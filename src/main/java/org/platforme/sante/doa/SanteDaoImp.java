package org.platforme.sante.doa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.platforme.sante.entities.Commentaire;
import org.platforme.sante.entities.Contenu;
import org.platforme.sante.entities.Favori;
import org.platforme.sante.entities.Role;
import org.platforme.sante.entities.SousCategorie;
import org.platforme.sante.entities.User;


public class SanteDaoImp implements ISanteDao {
	
	@PersistenceContext
	private EntityManager em;
	

	@Override
	public Long creerUser(User u) {
		em.persist(u);
		return u.getIdUser();
	}
	
	@Override
	public User trouverUser(String username, String password){
		Query req = em.createQuery("from User u where u.username = :x and u.password = :y");
		req.setParameter("x", username);
		req.setParameter("y", password);
		User u = (User) req.getSingleResult();
		return u;
	}

	@Override
	public void supprimerUser(Long idUser) {
		User u = em.find(User.class, idUser);
		em.remove(u);

	}

	@Override
	public void modifierUser(User u) {
		em.merge(u);

	}

	@Override
	public void attribuerRole(Role r, Long idUser) {
		User u=em.find(User.class, idUser);
		//u.getRoles().add(r);
		u.setRole(r);
		em.persist(r);
	}

	@Override
	public List<User> listUsers() {
		Query req = em.createQuery("select u from User u ");
		return req.getResultList();
	}


	@Override
	public void ajouterCommentaire(Commentaire c, Long idContenu, Long idUser) {
		Contenu co = em.find(Contenu.class, idContenu);
		User u=em.find(User.class, idUser);
		co.addCommentaire(c);
		u.addCommentaire(c);
		em.persist(co);
		
	}
	
	@Override
	public void supprimerCommentaire(Long idCommentaire) {
		Commentaire c = em.find(Commentaire.class, idCommentaire);
		em.remove(c);

	}

	@Override
	public void modifierCommentaire(Commentaire c) {
		em.merge(c);

	}

	@Override
	public List<Commentaire> AfficherCommentairesParContenu(Long idContenu){
		
		Query req = em.createQuery("select c.commentaires from Contenu c Where c.idContenu = :x ");
		req.setParameter("x", idContenu);
		
		return req.getResultList();
	}
	
	@Override
	public void ajouterContenu(Contenu c, Long idUser) {
		User u=em.find(User.class, idUser);
		u.addContenu(c);;
		em.persist(c);
		
	}

	@Override
	public void supprimerContenu(Long idContenu) {
	
		Contenu c = em.find(Contenu.class, idContenu);
		em.remove(c);

	}

	@Override
	public void modifierContenu(Contenu c) {
		em.merge(c);

	}
	
	@Override
	public List<Contenu> contenuParMotCle(String mc) {
		Query req = em.createQuery("from Contenu c Where c.titre like :x or c.contenu like :x");
		req.setParameter("x", "%"+mc+"%");
		return req.getResultList();
	}



	@Override
	public List<Contenu> contenusDerniers() {
		Query req = em.createQuery("from Contenu c ");
		req.setMaxResults(6);
		
		return req.getResultList();
	}

	@Override
	public void aimerContenu(Long idC) {
		Contenu c = em.find(Contenu.class, idC);
		c.setNombreLike(c.getNombreLike()+1);
		em.merge(c);
		

	}

	@Override
	public void detesterContenu(Long idC) {
		Contenu c = em.find(Contenu.class, idC);
		c.setNombreLike(c.getNombreDislike()+1);
		em.merge(c);
		

	}

	@Override
	public List<Contenu> contenuParCategorie(Long idCategorie) {
		Query req = em.createQuery("from Contenu c Where c.categorie = :x");
		req.setParameter("x", idCategorie);
		return req.getResultList();
		
	}

	@Override
	public List<Contenu> contenuParSousCategorie(Long idSousCategorie) {
		Query req = em.createQuery("from Contenu c Where c.sousCategorie = :x");
		req.setParameter("x" , idSousCategorie);
		return req.getResultList();
	}

	@Override
	public List<SousCategorie> listSousCategorieDeCategorie(Long idCategorie) {
		Query req = em.createQuery("from SousCategorie c Where c.categorie = :x");
		req.setParameter("x", idCategorie);
		return req.getResultList();
	}

	@Override
	public List<Favori> listFavori(Long idU) {
		
		Query req = em.createQuery("select u.favoris from User u where u.idUser = :x");
		req.setParameter("x", idU);
		
		return req.getResultList();
	}

	@Override
	public int existEmail(String email) {
		System.out.println("email : "+email);
		Query req = em.createQuery("select u from User u where u.email = :x");
		req.setParameter("x", email);
		User u = (User)req.getSingleResult();
		if(u.getUsername()!=null){
			return 1;
		}
		else return 0;
		
	}
	@Override
	public int existUsername(String username) {
		
		Query req = em.createQuery("from User u where u.username = :x");
		req.setParameter("x", username);
		return req.getFirstResult();
		
	}




}

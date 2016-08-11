package org.platforme.sante.metier;



import java.util.List;

import org.platforme.sante.doa.ISanteDao;
import org.platforme.sante.entities.*;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserSanteMetierImp implements IAdminSanteMetier {
	
	private ISanteDao dao;
	
	public void setDao(ISanteDao I ){
		
		this.dao = I;
	}

	@Override
	public void ajouterContenu(Contenu c, Long idUser) {
		
		dao.ajouterContenu(c, idUser);
		
	}

	@Override
	public void supprimerContenu(Long idContenu) {
	
		dao.supprimerContenu(idContenu);
		
	}

	@Override
	public void modifierContenu(Contenu c) {
		
		dao.modifierContenu(c);
		
	}

	@Override
	public void ajouterCommentaire(Commentaire c, Long idContenu, Long idUser) {
	
		dao.ajouterCommentaire(c, idContenu, idUser);
	}

	@Override
	public void supprimerCommentaire(Long idCommentaire) {
		
		dao.supprimerCommentaire(idCommentaire);
		
	}

	@Override
	public void modifierCommentaire(Commentaire c) {
		
		dao.modifierCommentaire(c);
		
	}

	@Override
	public Long creerUser(User u) {
    		
		return dao.creerUser(u);
	}

	@Override
	public User trouverUser(String username, String password) {
		
		return dao.trouverUser(username, password);
	}
	
	@Override
	public void supprimerUser(Long idUser) {
		dao.supprimerUser(idUser);
		
	}

	@Override
	public void modifierUser(User u) {

		dao.modifierUser(u);
	}
	
	@Override
	public List<Commentaire> AfficherCommentairesParContenu(Long idContenu) {
		
		return dao.AfficherCommentairesParContenu(idContenu);
	}

	@Override
	public List<Contenu> contenuParMotCle(String mc) {
		
		return dao.contenuParMotCle(mc);
	}

	@Override
	public List<Contenu> contenusDerniers() {

		return dao.contenusDerniers();
	}

	@Override
	public void aimerContenu(Long idC) {

		dao.aimerContenu(idC);
		
	}

	@Override
	public void detesterContenu(Long idC) {
		
		dao.detesterContenu(idC);
	}

	@Override
	public List<Contenu> contenuParCategorie(Long idCategorie) {

		return dao.contenuParCategorie(idCategorie);
	}

	@Override
	public List<Contenu> contenuParSousCategorie(Long idSousCategorie) {

		return dao.contenuParSousCategorie(idSousCategorie);
	}

	@Override
	public List<SousCategorie> listSousCategorieDeCategorie(Long idCategorie) {
		
		return dao.listSousCategorieDeCategorie(idCategorie);
	}

	
	@Override
	public void attribuerRole(Role r, Long idUser) {
		
		dao.attribuerRole(r, idUser);
		
	}

	@Override
	public List<User> listUsers() {
		
		return dao.listUsers();
	}

	
	


}

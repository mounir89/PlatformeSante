package org.platforme.sante.doa;



import java.util.List;

import org.platforme.sante.entities.*;

public interface ISanteDao {
	
	public Long creerUser(User u);
	public User trouverUser(String username, String password);
	public void supprimerUser(Long idUser);
	public void modifierUser(User u);
	public void attribuerRole(Role r, Long idUser);
	public List<User> listUsers();
	public int existEmail(String email);
	public int existUsername(String username);
	
	
	
	public void ajouterCommentaire(Commentaire c, Long idContenu, Long idUser);
	public void supprimerCommentaire(Long idCommentaire);
	public void modifierCommentaire(Commentaire c);
	
	
	
	public void ajouterContenu(Contenu c, Long idUser);
	public void supprimerContenu(Long idContenu);
	public void modifierContenu(Contenu c);
	
	public List<Commentaire> AfficherCommentairesParContenu(Long idContenu);
	

	
	public List<Contenu> contenuParMotCle(String mc);

	public List<Contenu> contenusDerniers();
	
	public void aimerContenu(Long idC);
	public void detesterContenu(Long idC);
	
	
	public List<Contenu> contenuParCategorie(Long idCategorie );
	public List<Contenu> contenuParSousCategorie(Long idSousCategorie);
	
	public List<SousCategorie> listSousCategorieDeCategorie(Long idCategorie);
	
	public List<Favori> listFavori(Long idU);
	
	
	

}

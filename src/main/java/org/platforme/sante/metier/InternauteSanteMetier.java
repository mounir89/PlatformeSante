package org.platforme.sante.metier;



import java.util.List;

import org.platforme.sante.entities.*;

public interface InternauteSanteMetier  {
	public int existEmail(String email);
	public int existUsername(String username);
	public Long creerUser(User u);
	public User trouverUser(String username, String password);
	public List<Commentaire> AfficherCommentairesParContenu(Long idContenu);
	public List<Contenu> contenuParMotCle(String mc);
	public List<Contenu> contenusDerniers();
	public void aimerContenu(Long idC);
	public void detesterContenu(Long idC);
	public List<Contenu> contenuParCategorie(Long idCategorie );
	public List<Contenu> contenuParSousCategorie(Long idSousCategorie);
	public List<SousCategorie> listSousCategorieDeCategorie(Long idCategorie);

}

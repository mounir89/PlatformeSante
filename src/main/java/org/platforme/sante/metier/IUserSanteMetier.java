package org.platforme.sante.metier;




import org.platforme.sante.entities.*;

public interface IUserSanteMetier extends InternauteSanteMetier {
	
	public void ajouterCommentaire(Commentaire c, Long idContenu, Long idUser);
	public void supprimerCommentaire(Long idCommentaire);
	public void modifierCommentaire(Commentaire c);
	

}

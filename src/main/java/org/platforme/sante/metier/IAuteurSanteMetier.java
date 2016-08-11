package org.platforme.sante.metier;





import org.platforme.sante.entities.*;

public interface IAuteurSanteMetier extends IUserSanteMetier{
	
	public void ajouterContenu(Contenu c, Long idUser);
	public void supprimerContenu(Long idContenu);
	public void modifierContenu(Contenu c);


}

package org.platforme.sante.metier;



import java.util.List;

import org.platforme.sante.entities.*;

public interface IAdminSanteMetier extends IAuteurSanteMetier {

	
	public void supprimerUser(Long idUser);
	public void modifierUser(User u);
	public void attribuerRole(Role r, Long idUser);
	public List<User> listUsers();


}

package org.platforme.sante;

import static org.junit.Assert.*;

import org.junit.Test;
import org.platforme.sante.entities.Contenu;
import org.platforme.sante.entities.Image;
import org.platforme.sante.entities.Role;
import org.platforme.sante.entities.User;
import org.platforme.sante.metier.IAdminSanteMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDOA {

	@Test
	public void test1() {
		try {
			ClassPathXmlApplicationContext app=
			new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
			
			IAdminSanteMetier metier =(IAdminSanteMetier) app.getBean("metier");
			User u = new User("hamdane89", "manuelle89", "mouni2rhamdane@yahoo.fr");
			Long idUser = metier.creerUser(u);
			
			/*System.out.println("------------------------------------------"+idUser);
			Contenu c = new Contenu("hamdane mounir","est un ingéneiruer en informatique" );
			c.addImage(new Image("soleil", "safina", "hhhdhddh"));
			
			
			metier.ajouterContenu(c, idUser);
			
			Role r = new Role("user");
			Long id = metier.trouverUser("hamdane", "manuelle89").getIdUser();
			metier.attribuerRole(r, id);*/
			
			
		    System.out.println("******************** "+metier.listUsers());
			
			
			//System.out.println(metier.trouverUser("hamdane", "manuelle89").getUsername());
		
			assertTrue(true);
			} catch (Exception e) {
			assertTrue(e.getMessage(),false);
			}
	}

}

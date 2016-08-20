package org.platforme.sante.controllers;

import org.platforme.sante.metier.IAdminSanteMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private IAdminSanteMetier metier;
	
	
	
	
	
	

}

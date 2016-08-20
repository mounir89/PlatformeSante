package org.platforme.sante.controllers;


import javax.validation.Valid;

import org.platforme.sante.ajaxForm.AjaxResponseBodyForm;
import org.platforme.sante.entities.User;
import org.platforme.sante.metier.InternauteSanteMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/")
public class ESanteController {
	
	@Autowired
	private InternauteSanteMetier metier;
	
	@RequestMapping("/")
	public String index(){
		
		return "index";
	}
	
	@RequestMapping(value="/register")
	public String register(Model model){
		
		model.addAttribute("user", new User());
		
		return "register";
	}
	@RequestMapping(value="/saveUser")
	public String saveUser(@Valid User u, BindingResult bindingResult,Model model){
		
		metier.creerUser(u);
		return "login";
	}
	
	@RequestMapping(value="/login")
	public String login(){
		
		return "login";
	}
	
	@ResponseBody 
	@RequestMapping(value="/existEmail", method=RequestMethod.GET)
	public AjaxResponseBodyForm existEmail(String email){
		
		AjaxResponseBodyForm res = new AjaxResponseBodyForm();
		
		int var = metier.existEmail(email);
		
		if(var==0){
			
			res.setStatus("success");
			
			return res;
			
		}else  if(var==1){
			
			res.setStatus("error");
			
		    return res ;
		
		}
		return null;
		
		
	}
	
	
	
	
	
	
	
	

}

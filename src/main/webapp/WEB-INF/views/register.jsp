<jsp:include page="header.jsp"></jsp:include>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<section id="register">
	<div class="container">
	<div class=row>
	<div class="col-md-offset-2 col-md-8 col-md-offset-2">

		<f:form modelAttribute="user" action="saveUser"  method="post" class="form-horizontal"  id="form_register" >
			
			<div class="form-group has-feedback" id="username_div">
				<f:label path="username" class="col-md-2 control-label">Pseudo</f:label>
				<div class="col-md-10">
				    <f:input path="username" class="form-control col-md-10" id="username" type="text" aria-describedby="inputError2Status"/>
					<span id="inputError2Status" class="sr-only">(error)</span>
				</div>
			</div>
			<div class="form-group has-feedback" id="password_div">
				<f:label path="password" class="col-md-2 control-label">Mot de passe</f:label>
				<div class="col-md-10">
				    <f:input path="password" class="form-control col-md-10" id="password" type="text"/>
				</div>
			</div>
			<div class="form-group has-feedback" id="email_div">
				<f:label path="email" class="col-md-2 control-label">Email</f:label>
				<div class="col-md-10">
				    <f:input path="email" class="form-control col-md-10" id="email"  type="text"/>
				</div>
			</div>
			<div class="form-group has-feedback" id="pays_div">
				<f:label path="adresse.pays" class="col-md-2 control-label">Pays</f:label>
				<div class="col-md-10">
				    <f:input path="adresse.pays" class="form-control col-md-10" id="pays" type="text"/>
				</div>
			</div>
			
		        <button type="submit" class="btn btn-warning col-md-10 col-md-offset-2">S'inscrire</button>
			 
		</f:form>
		</div>
		</div>
	</div>

</section>
<script>

    /* Validation form JS */
    
	jQuery(function($){
		
		/* Declaration variables */
		
		var ps=false, em=false, pass=false, py=false;
		
		/* test user name */
		
		
		$('#username').on('change keyup',function(){
            var username = $('#username').val().trim();
              var pattern = new RegExp(/^[A-Za-z0-9]+$/i);
              if (!pattern.test(username)) {
                  $('#username_div').removeClass('has-success');
                  $('#username_div').addClass('has-error');
	           	  $('#helpBlock2_username').remove();
	        	  $('#ic_username').remove();
	              $('#username').after('<span id="ic_username" class="glyphicon glyphicon-remove form-control-feedback" aria-hidden="true"></span>');
	              $("#ic_username").after('<span id="helpBlock2_username" class="help-block">Le pseudo ne doit pas contenir des caractères spéciaux</span>');
	                
              }
              else if((username.length<6)||(username.length>20)){
            	  $('#username_div').removeClass('has-success');
				  $('#username_div').addClass('has-error');
            	  $('#helpBlock2_username').remove();
            	  $('#ic_username').remove();
                  $('#username').after('<span id="ic_username" class="glyphicon glyphicon-remove form-control-feedback" aria-hidden="true"></span>');
                  $("#ic_username").after('<span id="helpBlock2_username" class="help-block">La longueur du pseudo doit être comprise entre 6 et 20</span>');
             	  
                  
              }
             else {
                 $('#username_div').removeClass('has-error');
                 $('#username_div').addClass('has-success');
                 $('#helpBlock2_username').remove();
           	     $('#ic_username').remove();
           	     $('#username').after('<span id="ic_username" class="glyphicon glyphicon-ok form-control-feedback" aria-hidden="true"></span>');
           	     
                 ps=true;
     
               }
		 });
		
		/* test email */
		
		  $('#password').on('change keyup',function(){
            var password = $('#password').val().trim();
              if((password.length<6)||(password.length>20)){
                  $('#password_div').removeClass('has-success');
                  $('#password_div').addClass('has-error');
 	           	  $('#helpBlock2_pass').remove();
 	        	  $('#ic_pass').remove();
 	              $('#password').after('<span id="ic_pass" class="glyphicon glyphicon-remove form-control-feedback" aria-hidden="true"></span>');
 	              $("#ic_pass").after('<span id="helpBlock2_pass" class="help-block">La longueur du mot de passe doit être comprise entre 6 et 20</span>');
       	    }
              else {
                  $('#password_div').removeClass('has-error');
                  $('#password_div').addClass('has-success');
                  $('#helpBlock2_pass').remove();
             	  $('#ic_pass').remove();
             	  $('#password').after('<span id="ic_pass" class="glyphicon glyphicon-ok form-control-feedback" aria-hidden="true"></span>');;
                  
             	  pass=true;

              }
          });
		
		/* test email */
		
		  $('#email').on('change keyup',function(){
              var email = $('#email').val().trim();
                var pattern = new RegExp(/^[a-z0-9._-]+@[a-z0-9._-]{2,}\.[a-z]{2,4}$/i);
                if (!pattern.test(email)) {
                  $('#email_div').removeClass('has-success');
                  $('#email_div').addClass('has-error');
   	           	  $('#helpBlock2_email').remove();
   	        	  $('#ic_email').remove();
   	              $('#email').after('<span id="ic_email" class="glyphicon glyphicon-remove form-control-feedback" aria-hidden="true"></span>');
   	              $("#ic_email").after('<span id="helpBlock2_email" class="help-block">Email n\'est pas valide</span>');
         	    }
                else{
                	$.ajax({
    			           url: 'existEmail?email='+email,
    			           type: 'GET',
    			           success: function (data) {
    			        	   
    			            
    			        	   if(data.status=="success"){
    			        		   console.log("hhhhhhh");
    			        		   $('#email_div').removeClass('has-error');
    			                   $('#email_div').addClass('has-success');
    			                   $('#helpBlock2_email').remove();
    			                   $('#ic_email').remove();
    			                   $('#email').after('<span id="ic_email" class="glyphicon glyphicon-ok form-control-feedback" aria-hidden="true"></span>');
    			                   
    			                   em=true;
 
    			        	   }else  if(data.status=="error"){ 
    			        		   
    			        		   $('#email_div').removeClass('has-success');
    			                   $('#email_div').addClass('has-error');
    			    	           $('#helpBlock2_email').remove();
    			    	           $('#ic_email').remove();
    			    	           $('#email').after('<span id="ic_email" class="glyphicon glyphicon-remove form-control-feedback" aria-hidden="true"></span>');
    			    	           $("#ic_email").after('<span id="helpBlock2_email" class="help-block">Email existe déja</span>');
    			        	   }
    			        	   
    			        	   
    			           }
    			         });
                 
                }
            });
		  var availableTags = [
								"Afghanistan",
								"Afrique du Sud",
								"Albanie",
								"Algérie",
								"Allemagne",
								"Andorre",
								"Arabie saoudite",
								"Argentine",
								"Arménie",
								"Australie",
								"Autriche",
								"Azerbaïdjan",
								"Bahamas",
								"Bahreïn",
								"Bangladesh",
								"Barbade",
								"Belgique",
								"Belize",
								"Bénin",
								"Biélorussie",
								"Birmanie",
								"Bolivie",
								"Bosnie-Herzégovine",
								"Botswana",
								"Brésil",
								"Bulgarie",
								"Burkina Faso",
								"Burundi",
								"Cambodge",
								"Cameroun",
								"Canada",
								"Centrafrique",
								"Chili",
								"Chine",
								"Chypre",
								"Colombie",
								"Comores",
								"Corée du Nord",
								"Corée du Sud",
								"Costa Rica",
								"Côte d'Ivoire",
								"Croatie",
								"Cuba",
								"Danemark", 	
								"Djibouti", 	
								"Égypte", 	
								"Émirats arabes unis", 
								"Équateur", 	
								"Érythrée", 	
								"Espagne", 	
								"Estonie", 	
								"États-Unis", 	
								"Éthiopie", 
								"Fidji",
								"Finlande", 	
								"France", 	
								"Gabon", 	
								"Gambie",
								"Géorgie", 	
								"Ghana", 	  
								"Grèce", 	  
								"Guatemala", 	  
								"Guinée", 	  
								"Guinée équatoriale", 	   
								"Guinée-Bissau", 	  
								"Guyana", 	  
								"Haïti", 	  
								"Honduras", 	  
								"Hongrie", 	  
								"Inde", 	  
								"Indonésie", 	  
								"Irak", 	  
								"Iran", 	  
								"Irlande", 	  
								"Islande", 	  
								"Italie", 	  
								"Jamaïque", 	  
								"Japon", 	  
								"Jordanie", 	  
								"Kazakhstan", 	  
								"Kenya", 	  
								"Kirghizistan", 	  
								"Koweït", 	  
								"Laos", 	  
								"Lettonie", 	  
								"Liban", 	  
								"Libéria", 	  
								"Libye", 	  
								"Liechtenstein", 	
								"Lituanie", 	
								"Luxembourg", 	
								"Macédoine", 	
								"Madagascar", 	
								"Malaisie", 	  
								"Malawi", 	  
								"Maldives", 	  
								"Mali", 	  
								"Malte", 	  
								"Maroc", 	  
								"Mauritanie", 	  
								"Mexique", 	  
								"Moldavie", 	  
								"Monaco", 	  
								"Mongolie", 	  
								"Monténégro", 	  
								"Mozambique", 	  
								"Népal", 	  
								"Nicaragua", 	  
								"Niger", 	  
								"Nigeria", 	  
								"Norvège", 	  
								"Nouvelle-Zélande", 	  
								"Oman", 	  
								"Ouganda", 	  
								"Ouzbékistan", 	  
								"Pakistan", 	 
								"Panama", 	 
								"Papouasie-Nouvelle-Guinée",
								"Paraguay", 	  
								"Pays-Bas", 	 
								"Pérou", 	  
								"Philippines", 	  
								"Pologne", 	  
								"Portugal", 	  
								"Qatar", 	  
								"République  du Congo",
								"République dominicaine",
								"République tchèque",
								"Roumanie",
								"Royaume-Uni",
								"Russie",
								"Rwanda",
								"Salvador",
								"Samoa",
								"Sao Tomé-et-Principe",
								"Sénégal",
								"Serbie",
								"Seychelles",
								"Sierra Leone",
								"Singapour",
								"Slovaquie",
								"Slovénie",
								"Somalie",
								"Soudan",
								"Sri Lanka",
								"Suède",
								"Suisse",
								"Suriname",
								"Swaziland",
								"Syrie",
								"Tadjikistan",
								"Tanzanie",
								"Tchad",
								"Thaïlande",
								"Tibet",
								"Togo",
								"Tonga",
								"Trinité-et-Tobago",
								"Tunisie",
								"Turkménistan",
								"Turquie",
								"Tuvalu",
								"Ukraine",
								"Uruguay",
								"Vanuatu",
								"Venezuela",
								"Viêt Nam",
								"Yémen",
								"Zambie",
								"Zimbabwe"
		                       ];
			
		  
		     $( "#pays" ).autocomplete({
		          source: availableTags,
		          minLength : 3 
		   });
		
		
		
		     $('#pays').on('change keyup',function(){
	              var pays = $('#pays').val().trim();
	               var pattern = new RegExp(/^[A-Za-záàâäãåçéèêëíìîïñóòôöõúùûüýÿæœÁÀÂÄÃÅÇÉÈÊËÍÌÎÏÑÓÒÔÖÕÚÙÛÜÝŸÆŒ]+$/i);
	               
	                if (!pattern.test(pays)) {
	                  $('#pays_div').removeClass('has-success');
	                  $('#pays_div').addClass('has-error');
	   	           	  $('#helpBlock2_pays').remove();
	   	        	  $('#ic_pays').remove();
	   	              $('#pays').after('<span id="ic_pays" class="glyphicon glyphicon-remove form-control-feedback" aria-hidden="true"></span>');
	   	              $("#ic_pays").after('<span id="helpBlock2_pays" class="help-block">Le pays ne contient pas des chiffres</span>');
	         	    }
	                else if(pays.length<3){
	                    $('#pays_div').removeClass('has-success');
	                    $('#pays_div').addClass('has-error');
	   	           	    $('#helpBlock2_pays').remove();
	   	        	    $('#ic_pays').remove();
	   	                $('#pays').after('<span id="ic_pays" class="glyphicon glyphicon-remove form-control-feedback" aria-hidden="true"></span>');
	   	                $("#ic_pays").after('<span id="helpBlock2_pays" class="help-block">La longueur du pays doit être au minimum 4 caractères</span>');
	         	    }
	                else {
	                	
	                  $('#pays_div').removeClass('has-error');
	                  $('#pays_div').addClass('has-success');
	                  $('#helpBlock2_pays').remove();
	               	  $('#ic_pays').remove();
	               	  $('#pays').after('<span id="ic_email" class="glyphicon glyphicon-ok form-control-feedback" aria-hidden="true"></span>');
	                 
	               	  py=true;
	               	

	                }
	            });
		
		
		      $( "#form_register" ).submit(function() {
		    	
                 if(ps && pass && em && py){
                   
                	  $.ajax({
   			           url: 'saveUser',
   			           type: 'POST',
   			           success: function (data) {
   			             
   			           }
   			         });
   			      }else{
                   alert("Veuillez remplir tous les champs !");
                 } 

                
               });
		
		
		
	});



</script>
<jsp:include page="footer.jsp"></jsp:include>




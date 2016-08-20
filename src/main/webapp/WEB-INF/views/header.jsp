<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>1 ere platforme de cours de sante dans le monde </title>
	
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/santeStyleVersion1.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/style.css">
	<link href="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/themes/ui-darkness/jquery-ui.min.css" rel="stylesheet">
	<script src="http://code.jquery.com/jquery-2.2.2.min.js"></script>
	<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
</head>
<body>

<nav class="navbar navbar-default">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" id="logo" href="/"><b style="color: #ff9800;">C-</b>
      <b style="color: #2196f3">Sante</b> <br> <b id="souslogo" style=""><b style="color: #ff9800 ; margin-right: 3px">Communauté</b><b style="color: #2196f3"><b style="margin-right: 3px">de</b> santé</b></b></a>
      
    </div>

    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="#" >Cours</a></li>
        <li><a href="#" >Partenaires</a></li>
         <li><a href="#">Nous contacter</a></li>
        
       </ul>
       
       
       <form class="navbar-form navbar-left " role="search">
	       <div class="inner-addon right-addon">
      			<i class="glyphicon glyphicon-search"></i>
     			<input type="text" class="form-control" placeholder="Search" />
   		   </div>
       </form>
       

      <ul class="nav navbar-nav navbar-right">
        <li><a href="register" class="btns btn-primary" id="reg" style="padding: 3px 7px 3px 7px; margin-top: 18px ; margin-right: 5px; color: #fff"  >S'inscrire</a></li>
        <li><a href="#" class="btns btn-warning" id="lg" style="padding: 3px 7px 3px 7px; margin-top: 18px; color: #fff"" >Se connecter</a></li>
      </ul>
    </div>
  </div>
</nav>

<!--  
<section id="cours">
 <div class="container">
	<div class="row">
		<div class="col-md-3">
			<div class="panel panel-default">
			  <div class="panel-body">
			   Au delà du fait qu'on peut stocker n'importe quoi dans n'importe quel document (je ne vois pas bien l'intérêt !) une des grandes différences c'est le fait que Mongo ne stocke pas de champs vides. Au contraire, il stocke les clés (nom des colonnes) dans tous les documents. C'est le tableau contre l'arbre. J'aimerais trouver un article qui se penche sur le sujet, compare, et décrit les conséquences.
			  </div>
			</div>
		</div>
		<div class="col-md-3">
			<div class="panel panel-default">
			  <div class="panel-body">
			  Au delà du fait qu'on peut stocker n'importe quoi dans n'importe quel document (je ne vois pas bien l'intérêt !) une des grandes différences c'est le fait que Mongo ne stocke pas de champs vides. Au contraire, il stocke les clés (nom des colonnes) dans tous les documents. C'est le tableau contre l'arbre. J'aimerais trouver un article qui se penche sur le sujet, compare, et décrit les conséquences.
			  </div>
			</div>
		</div>
		<div class="col-md-3">
			<div class="panel panel-default">
			  <div class="panel-body">
			    Au delà du fait qu'on peut stocker n'importe quoi dans n'importe quel document (je ne vois pas bien l'intérêt !) une des grandes différences c'est le fait que Mongo ne stocke pas de champs vides. Au contraire, il stocke les clés (nom des colonnes) dans tous les documents. C'est le tableau contre l'arbre. J'aimerais trouver un article qui se penche sur le sujet, compare, et décrit les conséquences.
			  </div>
			</div>
		</div>
	</div>
		<div class="row">
		<div class="col-md-3">
			<div class="panel panel-default">
			  <div class="panel-body">
			   Au delà du fait qu'on peut stocker n'importe quoi dans n'importe quel document (je ne vois pas bien l'intérêt !) une des grandes différences c'est le fait que Mongo ne stocke pas de champs vides. Au contraire, il stocke les clés (nom des colonnes) dans tous les documents. C'est le tableau contre l'arbre. J'aimerais trouver un article qui se penche sur le sujet, compare, et décrit les conséquences.
			  </div>
			</div>
		</div>
		<div class="col-md-3">
			<div class="panel panel-default">
			  <div class="panel-body">
			  Au delà du fait qu'on peut stocker n'importe quoi dans n'importe quel document (je ne vois pas bien l'intérêt !) une des grandes différences c'est le fait que Mongo ne stocke pas de champs vides. Au contraire, il stocke les clés (nom des colonnes) dans tous les documents. C'est le tableau contre l'arbre. J'aimerais trouver un article qui se penche sur le sujet, compare, et décrit les conséquences.
			  </div>
			</div>
		</div>
		<div class="col-md-3">
			<div class="panel panel-default">
			  <div class="panel-body">
			    Au delà du fait qu'on peut stocker n'importe quoi dans n'importe quel document (je ne vois pas bien l'intérêt !) une des grandes différences c'est le fait que Mongo ne stocke pas de champs vides. Au contraire, il stocke les clés (nom des colonnes) dans tous les documents. C'est le tableau contre l'arbre. J'aimerais trouver un article qui se penche sur le sujet, compare, et décrit les conséquences.
			  </div>
			</div>
		</div>
	</div>
		<div class="row">
		<div class="col-md-3">
			<div class="panel panel-default">
			  <div class="panel-body">
			   Au delà du fait qu'on peut stocker n'importe quoi dans n'importe quel document (je ne vois pas bien l'intérêt !) une des grandes différences c'est le fait que Mongo ne stocke pas de champs vides. Au contraire, il stocke les clés (nom des colonnes) dans tous les documents. C'est le tableau contre l'arbre. J'aimerais trouver un article qui se penche sur le sujet, compare, et décrit les conséquences.
			  </div>
			</div>
		</div>
		<div class="col-md-3">
			<div class="panel panel-default">
			  <div class="panel-body">
			  Au delà du fait qu'on peut stocker n'importe quoi dans n'importe quel document (je ne vois pas bien l'intérêt !) une des grandes différences c'est le fait que Mongo ne stocke pas de champs vides. Au contraire, il stocke les clés (nom des colonnes) dans tous les documents. C'est le tableau contre l'arbre. J'aimerais trouver un article qui se penche sur le sujet, compare, et décrit les conséquences.
			  </div>
			</div>
		</div>
		<div class="col-md-3">
			<div class="panel panel-primary">
			   <div class="panel-heading ">
   				 <img class=" col-md-2 panel_img" src="<%=request.getContextPath()%>/resources/img/imgfond.jpg">
  			  </div>
			  <div class="panel-body">
			  Au delà du fait qu'on peut stocker n'importe quoi dans n'importe quel document (je ne v
			  </div>
			   <div class="panel-footer">
			      <i class="glyphicon glyphicon-user"></i> Mounir Hamdane <br>
			      <i class="glyphicon glyphicon-eye-open">200</i>
			 	  <i class="glyphicon glyphicon-hand-right"></i> 500 
			 	  <i class="glyphicon glyphicon-thumbs-down"></i> 500 
			   </div>
			</div>
		</div>
	</div>
		<div class="row">
		<div class="col-md-6">
			<ul class="pagination">
			  <li class="disabled"><a href="#">&laquo;</a></li>
			  <li class="active"><a href="#">1</a></li>
			  <li><a href="#">2</a></li>
			  <li><a href="#">3</a></li>
			  <li><a href="#">4</a></li>
			  <li><a href="#">5</a></li>
			  <li><a href="#">&raquo;</a></li>
		</ul>
		</div>
		</div>
	
 </div>
</section>
-->
























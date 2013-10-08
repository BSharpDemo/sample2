<!DOCTYPE html>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<spring:url value="/resources" var="resourceUrl"/>

<html lang="en">
  <head>
    <tiles:insertAttribute name="html_head" />
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    
    <title>CingleVue Coding Challenge</title>
	<script src="${resourceUrl}/js/jquery.js"></script>
	
    <!-- Bootstrap core CSS -->
    <link href="${resourceUrl}/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${resourceUrl}/css/offcanvas.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="../../assets/js/html5shiv.js"></script>
      <script src="../../assets/js/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>
 	<tiles:insertAttribute name="header" />
    <div class="container">
      <div class="row row-offcanvas row-offcanvas-right">
		 <tiles:insertAttribute name="left-column"/>
		 <tiles:insertAttribute name="right-column"/>
      </div><!--/row-->
      <hr>
     <tiles:insertAttribute name="footer" />
    </div><!--/.container-->

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    
    <script src="${resourceUrl}/bootstrap/js/bootstrap.min.js"></script>
    <script src="${resourceUrl}/js/offcanvas.js"></script>
  </body>
</html>

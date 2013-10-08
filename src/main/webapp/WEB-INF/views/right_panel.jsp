<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<spring:url value="/resources" var="resourceUrl"/>

        <div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar" role="navigation">
          <div class="well sidebar-nav">
        
  			<ul class="nav">
              <li>  Subject</li>
              <li class="active">
	              <select id="subjectId" name="subject" >
		          	 <option value="-1">Select Subject</option>
			          <c:forEach var="subject" items="${subjects}">
							<option value="${subject.code}">${subject.description}</option>
			          </c:forEach>
		          </select>
              </li>
            </ul>
          </div><!--/.well -->
        </div><!--/span-->
        
		 
<script type="text/javascript" src="${resourceUrl}/js/handlebars.js"></script>
<script type="text/javascript">

var source   = $("#result-template").html();
var template = Handlebars.compile(source);

$(document).ready(function() {
	$( "#subjectId" ).change(function() {
		  //alert( "Handler for .change() called." );
		  $.getJSON( "getResultsJSON", { subject : $( "#subjectId" ).val() } )
			.done(function( json ) {
			  $("#content-placeholder").html(template(json));
			  //alert( "JSON Data: " + JSON.stringify(json) );
			})
			.fail(function( jqxhr, textStatus, error ) {
			  var err = textStatus + ', ' + error;
			  
			  console.log( "Request Failed: " + err);
			});
	});
	
});

</script>
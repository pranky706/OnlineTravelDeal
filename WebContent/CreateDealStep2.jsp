<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Deal</title>
<style>
body{
	background-image:url("White-Texture-HD-Backgrounds-7.jpg");
}
#header {
   background-image :url("shutterstock_126991940+.jpg");
    text-align:left;
    padding:30px;
    padding-right:px;
    margin-left:167px;
    width:1000px;
    font-family: "Lucida Bright",Georgia,serif;
    
}
#nav {
    line-height:30px;
    background-color:#eeeeee;
    height:300px;
    width:150px;
    float:left;
    
    padding:5px; 
}
#section {
    width:350px;
    float:left;
    padding:10px; 
}
#footer {
    background-color:#87CEEB;
    color:white;
    clear:both;
    margin:200px;
    padding:5px;
    text-align:center;
    
     margin-left:167px;
      margin-right:120px;
    text-align: right;
}
div#menu ul  {
    margin:1ex;padding:0;
    margin-right:100px;
    margin-left:170px;
    background-color: #87CEEB;
    height: 30px;
    border-style: dotted;
    border-color: blue;
    
    
}
div#menu ul li {
    display:inline; margin:10px;	
}
.one{
	color:white;
	text-align:center;
	font-family: cursive;
	background-color: #87CEEB;
	height: 30px;
	width: 200px;
	margin-left:620px;
	transition: height,width 2s;
	
}

.one:hover{
	height: 50px;
	width: 250px;
}    
.second:link{

	color:white;
}
.second:link{

	color:white;
}
#nav{
line-height:30px;
background-color: #eeeeee;
height:300px;
width:150px;
float:left;
padding:5px;

}


.four{
	font-weight:bold;
	color:white;
	width:80px;
	height:40px;
}
.circle{
	list-style-type: circle;
}
table{
	border-color: #87CEEB;
}
   
</style>


</head>
<body>
<div id="header">
<p  align="left" style="font-size: 50px; margin-left:100px;color:white;">Deal Yatra</p>

</div>
<div id="nav" style="margin: 1ex;">
<h3>Description:</h3>
<p>Make deal with us.....We will provide tensionless tour.....enjoy and feel the beauty of nature and have complete holiday</p>
</div>
<%

HttpSession s=request.getSession();
String name=(String)s.getAttribute("name4");
String email=(String)s.getAttribute("name3");
%>
<div id="menu">
<ul class="circle">
	<li style="text-align: center"><a class="four"  href="Salesman_Home.jsp"><%= name %>'s Home</a></li>
	<li style="text-align: center"><a class="four"  href="Logout.jsp">LogOut</a></li>
	
  
  
</ul>
<br>
</div>
<h2 align="center">Logged in as:<%= name %></h2>


	<form action="Add_OfferDeals_Servlet" method="post" align="center">
			DEAL TITLE: <input type="text" name="title"/>
			LOCATION: <input type="text" name="loc"/>
			DESCRIPTION: <input type="text" name="des"/>
			NUMBER OF TRAVELERS: <input type="text" name="numtravel"/>
			FOOD COST PER PERSON: <input type="text" name="fcost"/>
			TRAVEL COST PER PERSON: <input type="text" name="tcost"/>
			UPLOAD IMAGE HERE: <input name="image" type="text"/>
			
			<input type="submit" value="CONFIRM">
			
	</form>

<div id="footer">

Copyright © SNPS MAKE 2016
</div>

</body>
</html>
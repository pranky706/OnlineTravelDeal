<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="org.Servlet.*" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Previous deals</title>
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


	
<% 
	//String name=(String) session.getAttribute("name4");
			ArrayList<Deals> list=(ArrayList<Deals>)session.getAttribute("DLIST"); %>
		
	<h1>Available Deals</h1>
	<%
		if(list == null)
		{
			%>
			<h1>No Deals available</h1><%
		}
		else
		{
	%>
	
	<table border="1px">
	<tr><th>ID</th><th>Title</th><th>Location</th><th>Valid From</th>
	
	<th>Valid Upto</th><th>Food Cost</th><th>Travel Cost</th><th>Lodge Cost</th><th>Sales Email</th><th>Merchant Email</th>
	<th>Image</th><th>Number of Buys</th>
	</tr>
		
			
			
			<%	for(Deals d:list)
			{
				%>
				
		
				
				
				
				
							<tr>
							<td><%=d.getId() %></td><td><%=d.getTitle() %></td>
							<td><%= d.getLocation()%></td>
							<td><%=d.getValidfrom() %></td><td><%=d.getValidto() %></td>
							<td><%=d.getFoodcast() %></td><td><%=d.getTranspotcost() %></td><td><%=d.getLodgecost() %></td><td><%=d.getSemail() %></td>
							<td><%=d.getMemail() %></td>
							<td><img height="150px" width="200px" src="<%=d.getImage() %>"/></td>
							<td><%=d.getNoofbuy() %></td>
							</tr>
				
				
				
				
		<% 	}	}%>
		</table>

<div id="footer">

Copyright © SNPS MAKE 2016
</div>

</body>
</html>
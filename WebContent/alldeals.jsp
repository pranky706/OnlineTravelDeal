<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="org.Servlet.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deals</title>

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
	color: white;
	text-decoration: none;
	
	
}
.second:visited{
		color:white;
}
.second:hover{
	color:red;
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
	font-family:cursive;
	font-size:medium;
	color:white;
	width:80px;
	height:40px;
	text-decoration: none;
	background-color: highlight;
} 
.circle{
	list-style-type: circle;
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


<div id="section"><br>
<h1></h1>

</div>




<div id="menu">
<ul class="circle">
	<li style="text-align: center"><a class="four"  href="Home.html">Home</a></li>
  <li ><a class="four" href="About.html">About Us</a></li>
  <li><a class="four" href="">Contact Details</a></li>
  <li><a class="four" href="">Customer Executive Login</a></li>
  
</ul>
<br>
</div>
<%
		HttpSession s=request.getSession();
		ArrayList<Deals> a=(ArrayList<Deals>)s.getAttribute("DealsList");
		

%>
<h1 style=" text-align:center;:orange;font-family:cursive;">:::: -- Available Deals --::::</h1>
	
	<table border=2 >
	<tr><th>Title</th><th>Location</th><th>Description</th><th>Valid From</th>
	<th>Valid Upto</th><th>FOOD COST</th><th>LODGE COST</TH><th>TRAVEL COSTS</TH>
	<th>Image</th>
	</tr>
		
			
			
			<%	for(Deals d:a)
			{
				
				%>
				
		
				
				
				
				
							<tr>
							<td><%=d.getTitle() %></td>
							<td><%= d.getLocation()%></td><td><%=d.getDescription()%></td>
							<td><%=d.getValidfrom() %></td><td><%=d.getValidto() %></td>
							<td><%= d.getFoodcast() %></td><td><%= d.getLodgecost() %></td><td><%= d.getTranspotcost() %></td>
							<td><img height="150px" width="200px" src="<%=d.getImage() %>"/></td>
	<td><a href="Customer_Login_Servlet?id=<%=d.getId() %>">Book Now</a></td>
							
							</tr>
							
				
				
				
				
		<% 	}	%>
		</table>


<div id="footer">

Copyright © SNPS MAKE 2016
</div>


</body>

</html>
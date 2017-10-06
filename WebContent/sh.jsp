<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="org.Servlet.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bookings History</title>

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
<ul class="circle">

</ul>
</div>

<%
	HttpSession s=request.getSession(true);
	Object ob1=s.getAttribute("Booking");
	ArrayList<Bookings> alist=(ArrayList<Bookings>) ob1;
%>


<div id="menu">
<ul class="circle">
	<li style="text-align: center"><a class="four"  href="Customer1.jsp">Executive's Home</a></li>
  <li ><a class="four" href="Log_Out">Log Out</a></li>
</ul>
</div>
<%
	if(alist!=null)
	{
%>
<table align="center" border=2>
<tr><th>Deal Id</th><th>Title</th><th>Booking Date</th><th>Customer Name</th><th>Customer Email</th><th>Status</th></tr>
<%
	for(Bookings m: alist)
	{
%>
<tr><td><%= m.getDealid() %></td><td><%= m.getTitle() %></td><td><%= m.getBdate() %></td><td><%= m.getCname() %></td><td><%= m.getCemail() %></td><td><%= m.getStatus() %></td></tr>
<% } %>
</table>
<% }
	else
	{
%>
<h1 align="center">--::No Booking Available::--</h1>
<%} %>
<div id="footer">

Copyright © SNPS MAKE 2016
</div>


</body>

</html>
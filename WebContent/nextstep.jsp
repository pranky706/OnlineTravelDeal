<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="org.Servlet.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot password</title>

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
<p>jodncijbcbhsbchibc</p>
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
	Customer c=(Customer)s.getAttribute("Customer1");

%>
<table border=2 align="center">
<tr><td>Your Name::</td><td><%= c.getName() %></td></tr>
<tr><td>Your Email::</td><td><%= c.getEmail() %></td></tr>
<tr><td>Your Security Question::</td><td><%= c.getSquestion() %></td></tr>
<form align="center" action="changepassword_customer_servlet1" method="post">

<tr><td>Your Security Answer::</td><td><input type="password" name="answer" required></td></tr>

<input type="submit" value="Submit">
</form>
</table>
<div id="footer">

Copyright � SNPS MAKE 2016
</div>




</body>

</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="org.Servlet.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Merchant's Home</title>

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
<ul class="circle">

</ul>
</div>

<%
	HttpSession s=request.getSession(true);
	Object ob1=s.getAttribute("Array");
	ArrayList<MerchantDeals> alist=(ArrayList<MerchantDeals>) ob1;
	String Name=(String)s.getAttribute("name2");
%>


<div id="menu">
<ul class="circle">
	<li><a class="four" href="Fetch_Merchant_Details"><%= Name %>'s home page</a></li>
	<li ><a class="four" href="AddHotel.jsp">Add new hotels</a></li>
	<li><a class="four" href="Logout_Servlet">LogOut</a></li>
	
	
</ul>
</div>
<h2><marquee>Welcome <%= Name %></marquee></h2>
<table align="center" border=2>
<tr><th>Hotel Name</th><th>No. Of Bookings</th></tr>
<%
	if(alist!=null)
	{
		for(MerchantDeals m: alist)
		{
%>
			<tr><td><%= m.getHotelname() %></td><td><%= m.getNoofbookings() %></td><td><a href="Fetch_Booking_Details?hotelname=<%= m.getHotelname()%>">Waiting Customers List</a></td><td><a href="Fetch_All_Booking_Details?hotelname=<%= m.getHotelname()%>">All Customers List</a></td></tr>
<%
		}
%>
</table>
<%	
  	}
	else
	{
%>
<h2 align="center">No hotels in your account to show.</h2>
<h2 align="center">Add hotels.</h2>
<% }
	
%>
<div id="footer">

Copyright � SNPS MAKE 2016
</div>


</body>

</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<jsp:useBean id="manufacturer" type="model.manufacturer.Manufactures"
	scope="request">
</jsp:useBean>
<jsp:useBean id="company" type="model.company.Company" scope="request">
</jsp:useBean>
<jsp:useBean id="engineType" type="model.engine.EngineType"
	scope="request">
</jsp:useBean>
<jsp:useBean id="userBudget" type="user.UserBudget" scope="request">
</jsp:useBean>

<%@ page import="java.text.NumberFormat"%>
<%
	NumberFormat nfDouble = NumberFormat.getInstance();
	nfDouble.setMaximumFractionDigits(2);
	nfDouble.setMinimumFractionDigits(2);
	NumberFormat nfInt = NumberFormat.getInstance();
	nfInt.setMaximumFractionDigits(0);
	nfInt.setMinimumFractionDigits(0);
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<title>Confirm Order</title>
</head>

<style>
body {
	background-image: url(images/Image_Background.jpg);
	-moz-background-size: cover;
	-webkit-background-size: cover;
	background-size: cover;
	background-position: top center !important;
	background-repeat: no-repeat !important;
	background-attachment: fixed;
}

h1 {
	text-align: center;
	font-size: 45px;
	font-family: cursive;
	color: yellow;
	border: double;
	border-color: white;
	background-color: teal;
	border-color: white;
	color: yellow;
}

h2 {
	text-align: center;
	font-size: 35px;
	font-family: fantasy;
	color: white;
	border-style: dotted;
	border-color: white;
	color: white;
	text-shadow: black 0.1em 0.1em 0.1em
}

li {
	font-size: 18px;
	color: white;
	text-shadow: black 0.1em 0.1em 0.2em
}

h3 {
	font-size: 25px;
	font-family: inherit;
	color: white;
}

p {
	font-size: 150%;
	font-family: inherit;
	color: white;
	text-shadow: navy 0.1em 0.1em 0.2em
}

select {
	font-size: 18px;
	font-style: italic;
	color: blue;
}

option {
	font-size: 12px;
	font-style: normal;
	color: black;
}

.container {
	padding-top: 15px;
	padding-left: 35px;
	padding-right: 35px;
	padding-bottom: 75px;
}

.details {
	text-align: center;
}

.image {
	max-width: 75%;
	display: block;
	margin: 0 auto;
	text-align: center;
}

.imageEng {
	max-width: 50%;
	display: block;
	margin: 0 auto;
	text-align: center;
}
</style>

<body class="container">
	<h1>
		Carl's and Jasiel's Airfacturers <img src="images/logo.png"
			style="width: 50px; height: 50px;">
	</h1>
	<h2><%=company.viewCompanyName()%>
		<%=manufacturer.getAircraft().viewAircraftType()%></h2>
	<div class="image">
		<%=company.viewAircraftImage()%>
	</div>
	<br />

	<div class="details">
		<p>
			You have successfully ordered the
			<%=company.viewCompanyName()%>
			<%=manufacturer.getAircraft().viewAircraftType()%>.
		</p>
		<div class="imageEng">
			<%=engineType.viewEngineImage()%>
		</div>
		<br />
		<p>
			Aircraft Price: $<b><%=nfDouble.format(manufacturer.getAircraft().viewAircraftPrice())%></b>
		</p>
		<p>
			<b>Number of Order/s: <%=nfInt.format(userBudget.getOrderCount())%></b>
		</p>
		<p>
			<b>Total Price: <%=nfDouble.format(userBudget.getFinalPrice())%></b>
		</p>
		<p>
			<b>Your current budget is now at: <%=nfDouble.format(userBudget.getCurrentBudget())%></b>
		</p>
		<br /> <br />
	</div>
	<form action="index.jsp" style="text-align: center;">
		<input type="submit" class="btn btn-primary" value="Order Again">
	</form>
</body>
</html>
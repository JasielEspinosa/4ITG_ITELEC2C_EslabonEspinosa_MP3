<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<jsp:useBean id="manufacturer" type="model.manufacturer.Manufactures"
	scope="session">
</jsp:useBean>
<jsp:useBean id="company" type="model.company.Company" scope="session">
</jsp:useBean>
<jsp:useBean id="engineType" type="model.engine.EngineType"
	scope="session">
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
<title>Aircraft Details</title>
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

h4 {
	font-size: 175%;
	font-family: inherit;
	color: red;
	text-decoration: underline;
	text-shadow: -1px -1px 0 white, 1px -1px 0 white, -1px 1px 0 white, 1px
		1px 0 white;
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

.image {
	max-width: 100%;
	display: block;
	margin: 0 auto;
	text-align: center;
}

.imageEng {
	max-width: 50%;
	display: block;
	margin: 0 auto;
	text-align: left;
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
		<b><%=company.viewAircraftImage()%></b>
	</div>
	<br />
	<br />
	<form action="procorder.html" method='post'>

		<div>
			<input type="hidden" name="selManufacturer"
				value="<%=manufacturer.manufactureID()%>" />
		</div>
		<div>
			<input type="hidden" name="selACType"
				value="<%=manufacturer.getAircraft().viewAircraftType()%>" />
		</div>

		<div>
			<input type="hidden" name="selAirline"
				value="<%=company.companyID()%>" />
		</div>
		<div>
			<input type="hidden" name="selEng"
				value="<%=engineType.engineID()%>" />
		</div>

		<%
			if (manufacturer.getAircraft().viewAircraftPrice() != 0) {
		%>
		<input type="submit" style="float: right;" class="btn btn-primary"
			value="Add to Cart">
		<%
			}
		%>
		<input type="button" value="Go Back" class="btn btn-danger"
			style="float: left;" onClick="history.go(-1)"> <br /> <br />
		<br />

		<p>
			Manufacturer: <b><%=manufacturer.viewManufacturer()%></b>
		</p>
		<p>
			Aircraft Type to Order: <b><%=manufacturer.getAircraft().viewAircraftType()%></b>
		</p>
		<hr />
		<p>
			Aircraft Type Description: <b><%=manufacturer.getAircraft().viewDescription()%></b>
		</p>
		<p>
			Similar Models: <b><%=manufacturer.getAircraft().viewSimilarModels()%></b>
		</p>
		<hr />
		<p>
			Company to Deliver: <b><%=company.viewCompanyName()%></b>
		</p>
		<p>
			Company ICAO: <b><%=company.viewICAO()%></b>
		</p>
		<p>
			Engine Type to Order: <b><%=engineType.viewEngine()%></b>
		</p>
		<div class="imageEng">
			<b><%=engineType.viewEngineImage()%></b>
		</div>
		<hr />
		<p>
			Starting Price: $<b><%=nfDouble.format(manufacturer.getAircraft().viewAircraftPrice())%></b><br />
			(engine price free of charge)
		</p>
		<p>
			<b>Your current budget is: <%=nfDouble.format(userBudget.getCurrentBudget())%></b>
		</p>
		<br /> <br />
		<%
			if (manufacturer.getAircraft().viewAircraftPrice() != 0) {
		%>
		<input type="submit" style="float: right;" class="btn btn-primary"
			value="Add to Cart">
		<%
			}
		%>

		<input type="button" value="Go Back" class="btn btn-danger"
			style="float: left;" onClick="history.go(-1)">

	</form>
</body>
</html>
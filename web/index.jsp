<!DOCTYPE html>
<html>
<head>
<title>ITELEC2C-MP2</title>
<link rel="icon" href="images/logo.png">
<meta name="viewport" content="width=device-width, initial-scale=1">


<link rel="stylesheet" type="text/css" href="style.css">


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://www.w3schools.com/lib/w3-theme-black.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Allerta Stencil|Audiowide|Antic">

<link rel="stylesheet" href="bootstrap/downloads/w3.css">
<link rel="stylesheet" href="bootstrap/downloads/w3-theme-black.css">
<link rel="stylesheet"
	href="font-awesome-4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="bootstrap/downloads/antic.css">
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">

<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="bootstrap/downloads/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>

</head>

<style>
.allerta {
	font-family: Allerta Stencil;
}

.audiowide {
	font-family: Audiowide;
}

.antic {
	font-family: Antic
}

a:link {
	text-decoration: none;
}
</style>

<script>
	// Script for side navigation
	function w3_open() {
		var x = document.getElementById("mySidebar");
		x.style.width = "300px";
		x.style.paddingTop = "10%";
		x.style.display = "block";
	}
	// Close side navigation
	function w3_close() {
		document.getElementById("mySidebar").style.display = "none";
	}
	// Used to toggle the menu on smaller screens when clicking on the menu button
	function openNav() {
		var x = document.getElementById("navDemo");
		if (x.className.indexOf("w3-show") == -1) {
			x.className += " w3-show";
		} else {
			x.className = x.className.replace(" w3-show", "");
		}
	}
</script>

<script type="text/javascript">
	$(function() {

		$("input[name='selAirline']").click(
				function() {
					if ($("input[name='selAirline']").is(":checked")
							&& $("input[name='selEng']").is(":checked")) {
						$("#love").show();
					} else {
						$("#love").hide();
					}
				});

		$("input[name='selEng']").click(
				function() {
					if ($("input[name='selAirline']").is(":checked")
							&& $("input[name='selEng']").is(":checked")) {
						$("#love").show();
					} else {
						$("#love").hide();
					}
				});

		//Airline Select Function
		$("input[name='selManufacturer']").click(function() {
			if ($("#selAirbus").is(":checked")) {
				$("#manAirbus").slideDown(750);
				$("input[name='selACType']").click(function() {
					$("#love").hide();
					//Airbus
					if ($("#selA319").is(":checked")) {
						$("#acA319").slideDown(300);
						$("input[name='selAirline']").prop('checked', false);
						$("input[name='selEng']").prop('checked', false);
					} else {
						$("#acA319").slideUp(200);
					}
					if ($("#selA320").is(":checked")) {
						$("#acA320").slideDown(300);
						$("input[name='selAirline']").prop('checked', false);
						$("input[name='selEng']").prop('checked', false);
					} else {
						$("#acA320").slideUp(200);
					}
					if ($("#selA321").is(":checked")) {
						$("#acA321").slideDown(300);
						$("input[name='selAirline']").prop('checked', false);
						$("input[name='selEng']").prop('checked', false);
					} else {
						$("#acA321").slideUp(200);
					}
					if ($("#selA330").is(":checked")) {
						$("#acA330").slideDown(300);
						$("input[name='selAirline']").prop('checked', false);
						$("input[name='selEng']").prop('checked', false);
					} else {
						$("#acA330").slideUp(200);
					}
					if ($("#selA340").is(":checked")) {
						$("#acA340").slideDown(300);
						$("input[name='selAirline']").prop('checked', false);
						$("input[name='selEng']").prop('checked', false);
					} else {
						$("#acA340").slideUp(200);
					}
				});
			} else {
				$("#manAirbus").slideUp(200);
				$("#love").hide();
				$("input[name='selAirline']").prop('checked', false);
				$("input[name='selEng']").prop('checked', false);
				$("#selA319").prop("checked", false);
				$("#selA320").prop("checked", false);
				$("#selA321").prop("checked", false);
				$("#selA330").prop("checked", false);
				$("#selA340").prop("checked", false);
				$("#acA319").slideUp(200);
				$("#acA320").slideUp(200);
				$("#acA321").slideUp(200);
				$("#acA330").slideUp(200);
				$("#acA340").slideUp(200);
			}
			if ($("#selBoeing").is(":checked")) {
				$("#manBoeing").slideDown(750);
				$("input[name='selACType']").click(function() {
					$("#love").hide();
					//Boeing
					if ($("#selB733").is(":checked")) {
						$("#acB733").slideDown(300);
						$("input[name='selAirline']").prop('checked', false);
						$("input[name='selEng']").prop('checked', false);
					} else {
						$("#acB733").slideUp(200);
					}
					if ($("#selB744").is(":checked")) {
						$("#acB744").slideDown(300);
						$("input[name='selAirline']").prop('checked', false);
						$("input[name='selEng']").prop('checked', false);
					} else {
						$("#acB744").slideUp(200);
					}
					if ($("#selB772").is(":checked")) {
						$("#acB772").slideDown(300);
						$("input[name='selAirline']").prop('checked', false);
						$("input[name='selEng']").prop('checked', false);
					} else {
						$("#acB772").slideUp(200);
					}
					if ($("#selB773").is(":checked")) {
						$("#acB773").slideDown(300);
						$("input[name='selAirline']").prop('checked', false);
						$("input[name='selEng']").prop('checked', false);
					} else {
						$("#acB773").slideUp(200);
					}
				});
			} else {
				$("#manBoeing").slideUp(200);
				$("#love").hide();
				$("input[name='selAirline']").prop('checked', false);
				$("input[name='selEng']").prop('checked', false);
				$("#selB733").prop("checked", false);
				$("#selB744").prop("checked", false);
				$("#selB772").prop("checked", false);
				$("#selB773").prop("checked", false);
				$("#acB733").slideUp(200);
				$("#acB744").slideUp(200);
				$("#acB772").slideUp(200);
				$("#acB773").slideUp(200);
			}
			if ($("#selMD").is(":checked")) {
				$("#manMD").slideDown(750);

				$("input[name='selACType']").click(function() {
					$("#love").hide();
					//MD
					if ($("#selDC9").is(":checked")) {
						$("#acDC9").slideDown(300);
						$("input[name='selAirline']").prop('checked', false);
						$("input[name='selEng']").prop('checked', false);
					} else {
						$("#acDC9").slideUp(200);
					}
					if ($("#selDC10").is(":checked")) {
						$("#acDC10").slideDown(300);
						$("input[name='selAirline']").prop('checked', false);
						$("input[name='selEng']").prop('checked', false);
					} else {
						$("#acDC10").slideUp(200);
					}
					if ($("#selMD11").is(":checked")) {
						$("#acMD11").slideDown(300);
						$("input[name='selAirline']").prop('checked', false);
						$("input[name='selEng']").prop('checked', false);
					} else {
						$("#acMD11").slideUp(200);
					}
				});
			} else {
				$("#manMD").slideUp(200);
				$("#love").hide();
				$("input[name='selAirline']").prop('checked', false);
				$("input[name='selEng']").prop('checked', false);
				$("#selDC9").prop("checked", false);
				$("#selDC10").prop("checked", false);
				$("#selMD11").prop("checked", false);
				$("#acDC9").slideUp(200);
				$("#acDC10").slideUp(200);
				$("#acMD11").slideUp(200);
			}

		});

	});
</script>

<body id="myPage">

	<form action="processfactoryreviewmarket.html" method='post'>

		<div class="w3-top">
			<div class="w3-bar w3-theme-d2 w3-left-align">
				<a
					class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-hover-white"
					href="javascript:void(0);" onclick="openNav()"><i
					class="fa fa-bars"></i></a> <a href="index.jsp"
					class="w3-bar-item w3-button w3-green allerta w3-large">Carl
					and Jasiel's Airfacturers</a>

				<div class="w3-dropdown-hover w3-hide-small">

					<div class="w3-button allerta w3-large" title="Notifications">
						Shop Airfacturers <i class="fa fa-caret-down"></i>
					</div>

					<!-- Manufacturer Value Reference -->
					<div class="w3-dropdown-content w3-card-4 w3-bar-block w3-large">
						<label for="selAirbus"> <input id="selAirbus" type="radio"
							name="selManufacturer" value="Airbus" /><a
							class="w3-bar-item w3-button allerta">Airbus Industrie</a>
						</label><br /> <label for="selBoeing"> <input id="selBoeing"
							type="radio" name="selManufacturer" value="Boeing" /><a
							class="w3-bar-item w3-button allerta">The Boeing Company</a>
						</label><br /> <label for="selMD"> <input id="selMD" type="radio"
							name="selManufacturer" value="McDonnellDouglas" /><a
							class="w3-bar-item w3-button allerta">McDonnell Douglas</a>
						</label> <a href="removeAircraft.jsp"
							class="w3-bar-item w3-button allerta">Decommission your
							aircraft</a>
					</div>
				</div>
			</div>
		</div>

		<!-- Aircraft Type Value Reference -->

		<div
			style="margin-left: 10px; margin-bottom: 10px; margin-right: 10px; text-align: center; background-color: #DCFFAF;">

			<div id="manAirbus" title="Manufacturer Airbus" style="display: none">
				<br /> <br />
				<h2>Select Aircraft Type:</h2>
				<br />
				<div class="row cont-buttons">
					<label for="selA319"> <input id="selA319" type="radio"
						name="selACType" value="A319" /><img src="images/btnA319.jpg"
						class="imgbtn img-responsive">A319
					</label> <label for="selA320"> <input id="selA320" type="radio"
						name="selACType" value="A320" /><img src="images/btnA320.jpg"
						class="imgbtn img-responsive">A320
					</label> <label for="selA321"> <input id="selA321" type="radio"
						name="selACType" value="A321" /><img src="images/btnA321.jpg"
						class="imgbtn img-responsive">A321
					</label> <label for="selA330"> <input id="selA330" type="radio"
						name="selACType" value="A330" /><img src="images/btnA330.jpg"
						class="imgbtn img-responsive">A330
					</label> <label for="selA340"> <input id="selA340" type="radio"
						name="selACType" value="A340" /><img src="images/btnA340.jpg"
						class="imgbtn img-responsive">A340
					</label> <br />
				</div>
			</div>

			<div id="manBoeing" title="Manufacturer Boeing" style="display: none">
				<br /> <br />
				<h2>Select Aircraft Type:</h2>
				<br />
				<div class="row cont-buttons">
					<label for="selB733"> <input id="selB733" type="radio"
						name="selACType" value="B733" /><img src="images/btnB733.jpg"
						class="imgbtn img-responsive">B737-300
					</label> <label for="selB744"> <input id="selB744" type="radio"
						name="selACType" value="B744" /><img src="images/btnB744.jpg"
						class="imgbtn img-responsive">B747-400
					</label> <label for="selB772"> <input id="selB772" type="radio"
						name="selACType" value="B772" /><img src="images/btnB772.jpg"
						class="imgbtn img-responsive">B777-200
					</label> <label for="selB773"> <input id="selB773" type="radio"
						name="selACType" value="B773" /><img src="images/btnB773.jpg"
						class="imgbtn img-responsive">B777-300
					</label> <br />
				</div>
			</div>


			<div id="manMD" title="Manufacturer McDonnell Douglas"
				style="display: none">
				<br /> <br />
				<h2>Select Aircraft Type:</h2>
				<br />
				<div class="row cont-buttons">
					<label for="selDC9"> <input id="selDC9" type="radio"
						name="selACType" value="DC9" /><img src="images/btnDC9.jpg"
						class="imgbtn img-responsive">DC9
					</label> <label for="selDC10"> <input id="selDC10" type="radio"
						name="selACType" value="DC10" /><img src="images/btnDC10.jpg"
						class="imgbtn img-responsive">DC10
					</label> <label for="selMD11"> <input id="selMD11" type="radio"
						name="selACType" value="MD11" /><img src="images/btnMD11.jpg"
						class="imgbtn img-responsive">MD11
					</label> <br />
				</div>
			</div>

			<!-- ALL Airbus -->
			<div title="Airbus">

				<div id="acA319" style="display: none">
					<hr />
					<h2>Select Airline Company to Produce</h2>
					<div class="row cont-buttons">
						<label> <input id="selAirline" type="radio"
							name="selAirline" value="A319 PAL" /><img
							src="images/btnPAL.jpg" class="imgbtn img-responsive">Philippine
							Airlines
						</label> <label> <input id="selAirline" type="radio"
							name="selAirline" value="A319 CEB" /><img
							src="images/btnCEB.jpg" class="imgbtn img-responsive">Cebu
							Pacific Airlines
						</label>
					</div>
					<hr />
					<h2>Select Engine Type</h2>
					<div class="row cont-buttons">
						<label> <input id="selEng" value="CFM565A" type="radio"
							name="selEng" /><img src="images/btnCFM565A.jpg"
							class="imgbtn img-responsive">CFM International CFM56-5A
						</label> <label> <input id="selEng" value="CFM565B" type="radio"
							name="selEng" /><img src="images/btnCFM565B.jpg"
							class="imgbtn img-responsive">CFM International CFM56-5B
						</label> <label> <input id="selEng" value="IAEV2500" type="radio"
							name="selEng" /><img src="images/btnIAEV2500.jpg"
							class="imgbtn img-responsive">International Aero Engines
							IAE V2500
						</label> <br />
					</div>
				</div>

				<div id="acA320" style="display: none">
					<hr />
					<h2>Select Airline Company to Produce</h2>
					<div class="row cont-buttons">
						<label> <input id="selAirline" value="A320 PAL"
							type="radio" name="selAirline" /><img src="images/btnPAL.jpg"
							class="imgbtn img-responsive">Philippine Airlines
						</label> <label> <input id="selAirline" value="A320 CEB"
							type="radio" name="selAirline" /><img src="images/btnCEB.jpg"
							class="imgbtn img-responsive">Cebu Pacific Airlines
						</label>
					</div>
					<hr />
					<h2>Select Engine Type</h2>
					<div class="row cont-buttons">
						<label> <input id="selEng" value="CFM565B" type="radio"
							name="selEng" /><img src="images/btnCFM565B.jpg"
							class="imgbtn img-responsive">CFM International CFM56-5B
						</label> <label> <input id="selEng" value="IAEV2500" type="radio"
							name="selEng" /><img src="images/btnIAEV2500.jpg"
							class="imgbtn img-responsive">International Aero Engines
							IAE V2500
						</label> <br />
					</div>
				</div>

				<div id="acA321" style="display: none">
					<hr />
					<h2>Select Airline Company to Produce</h2>
					<div class="row cont-buttons">
						<label> <input id="selAirline" value="A321 PAL"
							type="radio" name="selAirline" /><img src="images/btnPAL.jpg"
							class="imgbtn img-responsive">Philippine Airlines
						</label>
					</div>
					<hr />
					<h2>Select Engine Type</h2>
					<div class="row cont-buttons">
						<label> <input id="selEng" value="CFM565B" type="radio"
							name="selEng" /><img src="images/btnCFM565B.jpg"
							class="imgbtn img-responsive">CFM International CFM56-5B
						</label> <label> <input id="selEng" value="IAEV2500" type="radio"
							name="selEng" /><img src="images/btnIAEV2500.jpg"
							class="imgbtn img-responsive">International Aero Engines
							IAE V2500
						</label> <br />
					</div>
				</div>

				<div id="acA330" style="display: none">
					<hr />
					<h2>Select Airline Company to Produce</h2>
					<div class="row cont-buttons">
						<label> <input id="selAirline" value="A330 PAL"
							type="radio" name="selAirline" /><img src="images/btnPAL.jpg"
							class="imgbtn img-responsive">Philippine Airlines
						</label> <label> <input id="selAirline" value="A330 CEB"
							type="radio" name="selAirline" /><img src="images/btnCEB.jpg"
							class="imgbtn img-responsive">Cebu Pacific Airlines
						</label>
					</div>
					<hr />
					<h2>Select Engine Type</h2>
					<div class="row cont-buttons">
						<label> <input id="selEng" value="GECF6" type="radio"
							name="selEng" /><img src="images/btnGECF6.jpg"
							class="imgbtn img-responsive">General Electric CF6
						</label> <label> <input id="selEng" value="PW4000" type="radio"
							name="selEng" /><img src="images/btnPW4000.jpg"
							class="imgbtn img-responsive">Pratt and Whitney PW4000
						</label> <label> <input id="selEng" value="RRT700" type="radio"
							name="selEng" /><img src="images/btnRRT700.jpg"
							class="imgbtn img-responsive">Rolls-Royce Trent 700
						</label> <br />
					</div>
				</div>

				<div id="acA340" style="display: none">
					<hr />
					<h2>Select Airline Company to Produce</h2>
					<div class="row cont-buttons">
						<label> <input id="selAirline" value="A340 PAL"
							type="radio" name="selAirline" /><img src="images/btnPAL.jpg"
							class="imgbtn img-responsive">Philippine Airlines
						</label>
					</div>
					<hr />
					<h2>Select Engine Type</h2>
					<div class="row cont-buttons">
						<label> <input id="selEng" value="CFM565C" type="radio"
							name="selEng" /><img src="images/btnCFM565C.jpg"
							class="imgbtn img-responsive">CFM International CFM56-5C
						</label> <label> <input id="selEng" value="RRT500" type="radio"
							name="selEng" /><img src="images/btnRRT500.jpg"
							class="imgbtn img-responsive">Rolls-Royce Trent 500
						</label> <br />
					</div>
				</div>

			</div>
			<!-- END ALL Airbus -->

			<!-- ALL Boeing -->
			<div title="Boeing">

				<div id="acB733" style="display: none">
					<hr />
					<h2>Select Airline Company to Produce</h2>
					<div class="row cont-buttons">
						<label> <input id="selEng" id="selAirline"
							value="B733 PAL" type="radio" name="selAirline" /><img
							src="images/btnPAL.jpg" class="imgbtn img-responsive">Philippine
							Airlines
						</label>
					</div>
					<hr />
					<h2>Select Engine Type</h2>
					<div class="row cont-buttons">
						<label> <input id="selEng" value="JT8D" type="radio"
							name="selEng" /><img src="images/btnJT8D.jpg"
							class="imgbtn img-responsive">Pratt and Whitney JT8D
						</label> <label> <input id="selEng" value="CFM567B" type="radio"
							name="selEng" /><img src="images/btnCFM567B.jpg"
							class="imgbtn img-responsive">CFM International CFM56-7B
						</label> <label> <input id="selEng" value="CFMLEAP1B" type="radio"
							name="selEng" /><img src="images/btnCFMLEAP1B.jpg"
							class="imgbtn img-responsive">CFM International MAX CFM
							LEAP-1B
						</label> <br />
					</div>
				</div>

				<div id="acB744" style="display: none">
					<hr />
					<h2>Select Airline Company to Produce</h2>
					<div class="row cont-buttons">
						<label> <input id="selAirline" value="B744 PAL"
							type="radio" name="selAirline" /><img src="images/btnPAL.jpg"
							class="imgbtn img-responsive">Philippine Airlines
						</label>
					</div>
					<hr />
					<h2>Select Engine Type</h2>
					<div class="row cont-buttons">
						<label> <input id="selEng" value="PW4000" type="radio"
							name="selEng" /><img src="images/btnPW4000.jpg"
							class="imgbtn img-responsive">Pratt and Whitney PW4000
						</label> <label> <input id="selEng" value="GECF6" type="radio"
							name="selEng" /><img src="images/btnGECF6.jpg"
							class="imgbtn img-responsive">General Electric CF6
						</label> <label> <input id="selEng" value="RB211" type="radio"
							name="selEng" /><img src="images/btnRB211.jpg"
							class="imgbtn img-responsive">Rolls-Royce RB211
						</label> <label> <input id="selEng" value="GENX" type="radio"
							name="selEng" /><img src="images/btnGENX.jpg"
							class="imgbtn img-responsive">General Electric GEnx
						</label> <br />
					</div>
				</div>

				<div id="acB772" style="display: none">
					<hr />
					<h2>Select Airline Company to Produce</h2>
					<div class="row cont-buttons">
						<label> <input id="selAirline" value="B772 KLM"
							type="radio" name="selAirline" /><img src="images/btnKLM.jpg"
							class="imgbtn img-responsive">KLM Royal Dutch Airlines
						</label>
					</div>
					<hr />
					<h2>Select Engine Type</h2>
					<div class="row cont-buttons">
						<label> <input id="selEng" value="PW4000" type="radio"
							name="selEng" /><img src="images/btnPW4000.jpg"
							class="imgbtn img-responsive">Pratt and Whitney PW4000
						</label> <label> <input id="selEng" value="GECF6" type="radio"
							name="selEng" /><img src="images/btnGECF6.jpg"
							class="imgbtn img-responsive">General Electric CF6
						</label> <label> <input id="selEng" value="RRT800" type="radio"
							name="selEng" /><img src="images/btnRRT800.jpg"
							class="imgbtn img-responsive">Rolls-Royce Trent 800
						</label> <label> <input id="selEng" value="GE90" type="radio"
							name="selEng" /><img src="images/btnGE90.jpg"
							class="imgbtn img-responsive">General Electric GE90
						</label> <br />
					</div>
				</div>

				<div id="acB773" style="display: none">
					<hr />
					<h2>Select Airline Company to Produce</h2>
					<div class="row cont-buttons">
						<label> <input id="selAirline" value="B773 PAL"
							type="radio" name="selAirline" /><img src="images/btnPAL.jpg"
							class="imgbtn img-responsive">Philippine Airlines
						</label>
					</div>
					<hr />
					<h2>Select Engine Type</h2>
					<div class="row cont-buttons">
						<label> <input id="selEng" value="PW4000" type="radio"
							name="selEng" /><img src="images/btnPW4000.jpg"
							class="imgbtn img-responsive">Pratt and Whitney PW4000
						</label> <label> <input id="selEng" value="GECF6" type="radio"
							name="selEng" /><img src="images/btnGECF6.jpg"
							class="imgbtn img-responsive">General Electric CF6
						</label> <label> <input id="selEng" value="RRT800" type="radio"
							name="selEng" /><img src="images/btnRRT800.jpg"
							class="imgbtn img-responsive">Rolls-Royce Trent 800
						</label> <label> <input id="selEng" value="GE90" type="radio"
							name="selEng" /><img src="images/btnGE90.jpg"
							class="imgbtn img-responsive">General Electric GE90
						</label> <br />
					</div>
				</div>

			</div>
			<!-- END ALL Boeing -->

			<!-- ALL MDs -->
			<div title="MDs">

				<div id="acDC9" style="display: none">
					<hr />
					<h2>Select Airline Company to Produce</h2>
					<div class="row cont-buttons">
						<label> <input id="selAirline" value="DC9 CEB"
							type="radio" name="selAirline" /><img src="images/btnCEB.jpg"
							class="imgbtn img-responsive">Cebu Pacific Airlines
						</label>
					</div>
					<hr />
					<h2>Select Engine Type</h2>
					<div class="row cont-buttons">
						<label> <input id="selEng" value="JT8D" type="radio"
							name="selEng" /><img src="images/btnJT8D.jpg"
							class="imgbtn img-responsive">Pratt and Whitney JT8D
						</label> <br />
					</div>
				</div>

				<div id="acDC10" style="display: none">
					<hr />
					<h2>Select Airline Company to Produce</h2>
					<div class="row cont-buttons">
						<label> <input id="selAirline" value="DC10 PAL"
							type="radio" name="selAirline" /><img src="images/btnPAL.jpg"
							class="imgbtn img-responsive">Philippine Airlines
						</label> <label> <input id="selAirline" value="DC10 FDX"
							type="radio" name="selAirline" /><img src="images/btnFDX.jpg"
							class="imgbtn img-responsive">FedEx Express
						</label>
					</div>
					<hr />
					<h2>Select Engine Type</h2>
					<div class="row cont-buttons">
						<label> <input id="selEng" value="JT8D" type="radio"
							name="selEng" /><img src="images/btnJT8D.jpg"
							class="imgbtn img-responsive">Pratt and Whitney JT8D
						</label> <label> <input id="selEng" value="GECF6" type="radio"
							name="selEng" /><img src="images/btnGECF6.jpg"
							class="imgbtn img-responsive">General Electric CF6
						</label> <label> <input id="selEng" value="JT9D" type="radio"
							name="selEng" /><img src="images/btnJT9D.jpg"
							class="imgbtn img-responsive">Pratt and Whitney JT9D
						</label><br />
					</div>
				</div>

				<div id="acMD11" style="display: none">
					<hr />
					<h2>Select Airline Company to Produce</h2>
					<div class="row cont-buttons">
						<label> <input id="selAirline" value="MD11 KLM"
							type="radio" name="selAirline" /><img src="images/btnKLM.jpg"
							class="imgbtn img-responsive">KLM Royal Dutch Airlines
						</label>
					</div>
					<hr />
					<h2>Select Engine Type</h2>
					<div class="row cont-buttons">
						<label> <input id="selEng" value="PW4000" type="radio"
							name="selEng" /><img src="images/btnPW4000.jpg"
							class="imgbtn img-responsive">Pratt and Whitney PW4000
						</label> <label> <input id="selEng" value="GECF6" type="radio"
							name="selEng" /><img src="images/btnGECF6.jpg"
							class="imgbtn img-responsive">General Electric CF6
						</label> <br />
					</div>
				</div>

			</div>
			<!-- END ALL MDs -->

			<div id="love" style="display: none; text-align: center;">
				<br /> <input type="submit" class="btn btn-primary"
					value="Add to Cart"><br /> <br />
			</div>

		</div>
	</form>

	<!-- THE BODY -->
	<div>

		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Wrapper for slides -->
			<div class="carousel-inner">
				<div class="item active">
					<img src="images/header-airbus-2.jpg" alt="Los Angeles"
						style="width: 100%;">
				</div>

				<div class="item">
					<img src="images/header-boeing-2.jpg" alt="Chicago"
						style="width: 100%;">
				</div>

				<div class="item">
					<img src="images/header-douglas-2.jpg" alt="New york"
						style="width: 100%;">
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>
		<div class="w3-container w3-padding-64 w3-center audiowide" id="team">
			<h2>OUR TEAM</h2>
			<p>Meet the team</p>
			<div class="w3-row">
				<br>
				<div class="w3-half">
					<img src="images/chixspotted.jpg" style="width: 35%"
						class="w3-circle w3-hover-opacity">
					<h3>Jasiel Espinosa</h3>
					<p>Chairman, President and CEO</p>
				</div>
				<div class="w3-half">
					<img src="images/carl-elec.jpg" style="width: 35%"
						class="w3-circle w3-hover-opacity">
					<h3>Carl Eslabon</h3>
					<p>Business Development and Strategy</p>
				</div>
			</div>
		</div>
		<div class="w3-row-padding w3-padding-64 w3-theme-l1 antic" id="work">
			<div class="w3-quarter">
				<h2>Our Work</h2>
				<p>Aircraft Wikifactures is an international pioneer in the
					aerospace industry. We are a leader in designing, manufacturing and
					delivering aerospace products, services and solutions to customers
					on a global scale. We aim for a better-connected, safer and more
					prosperous world.</p>
				<p>A commercial aircraft manufacturer, with Space and Defence as
					well as Helicopters Divisions, Airbus is the largest aeronautics
					and space company in Europe and a worldwide leader. Aircraft
					Wikifactures has built on its strong European heritage to become
					truly international, with roughly 180 locations and 12,000 direct
					suppliers globally. The company has aircraft and helicopter final
					assembly lines across Asia, Europe and the Americas, and has
					achieved a more than sixfold order book increase since 2000.</p>
			</div>
			<div class="w3-quarter">
				<div class="w3-card-2 w3-white">
					<img src="images/aces-edited.png" alt="First Partner"
						style="width: 100%">
					<div class="w3-container">
						<p>Founded on August 30, 1971, by a group of 13 Colombian
							entrepreneurs, amongst them, most notably Orlando Botero Escobar
							and German Peñaloza Arias from Manizales and Luis H. Coulson,
							Jorge Coulson R., Alberto Jaramillo and Hernán Zuluaga from
							Medellín.</p>
					</div>
				</div>
			</div>
			<div class="w3-quarter">
				<div class="w3-card-2 w3-white">
					<img src="images/adria-edited.png" alt="Cinque Terre"
						style="width: 100%">
					<div class="w3-container">
						<p>Formerly Inex-Adria Aviopromet, later Inex-Adria Airways,
							is the largest airline in Slovenia. The majority of Adria
							Airways' business is in scheduled flights, but it also provides
							charter and ad hoc flights. Adria currently operates to 24
							scheduled and 22 charter destinations throughout Europe.</p>
					</div>
				</div>
			</div>
			<div class="w3-quarter">
				<div class="w3-card-2 w3-white">
					<img src="images/aegean.png" alt="Monterosso" style="width: 100%">
					<div class="w3-container">
						<p>Largest Greek airline by total number of passengers
							carried, by number of destinations served and by fleet size. A
							Star Alliance member since June 2010, it operates scheduled and
							charter services from Athens and Thessaloniki to other major
							Greek destinations as well as to a number of European
							destinations.</p>
					</div>
				</div>
			</div>
		</div>
		<!-- Pricing Row -->
		<div class="w3-row-padding w3-center w3-padding-64 antic" id="pricing">
			<h2>PROMOS</h2>
			<p>Valid until December 2017!</p>
			<br>
			<div class="w3-third w3-margin-bottom">
				<ul class="w3-ul w3-border w3-hover-shadow">
					<li class="w3-theme">
						<p class="w3-xlarge">A300 PAL</p>
					</li>
					<li class="w3-padding-16"><b>FL</b> State</li>
					<li class="w3-padding-16"><b>2016</b></li>
					<li class="w3-padding-16">Serial no.<b> 6166</b></li>
					<li class="w3-padding-16">
						<h2 class="w3-wide">
							<i class="fa fa-usd"></i>62,850,000
						</h2>
					</li>
				</ul>
			</div>
			<div class="w3-third w3-margin-bottom">
				<ul class="w3-ul w3-border w3-hover-shadow">
					<li class="w3-theme">
						<p class="w3-xlarge">A310 PFDX</p>
					</li>
					<li class="w3-padding-16"><b>NJ</b> State</li>
					<li class="w3-padding-16"><b>2015</b></li>
					<li class="w3-padding-16">Serial no.<b> 9527</b></li>
					<li class="w3-padding-16">
						<h2 class="w3-wide">
							<i class="fa fa-usd"></i>13,995,000
						</h2>
					</li>
				</ul>
			</div>
			<div class="w3-third w3-margin-bottom">
				<ul class="w3-ul w3-border w3-hover-shadow">
					<li class="w3-theme">
						<p class="w3-xlarge">A318 PAL</p>
					</li>
					<li class="w3-padding-16"><b>VA</b> State</li>
					<li class="w3-padding-16"><b>2014</b></li>
					<li class="w3-padding-16">Serial no.<b> 463</b></li>
					<li class="w3-padding-16">
						<h2 class="w3-wide">
							<i class="fa fa-usd"></i> 52,900,000
						</h2>
					</li>
				</ul>
			</div>
		</div>
		<!-- Contact Container -->
		<div class="w3-container w3-padding-64 w3-theme-l5 antic" id="contact"
			align="center">

			<div class="w3-padding-16">
				<span class="w3-xlarge w3-border-teal w3-bottombar">Contact
					Us</span>
			</div>
			<h3>Address</h3>
			<p>Swing by for more details.</p>
			<p>
				<i class="fa fa-map-marker w3-text-teal w3-xlarge"></i>  Manila,
				PHL
			</p>
			<p>
				<i class="fa fa-phone w3-text-teal w3-xlarge"></i>  +63 9299692289
			</p>
			<p>
				<i class="fa fa-envelope-o w3-text-teal w3-xlarge"></i>  carleslabon@gmail.com
			</p>

		</div>
		<!-- Google Maps -->
		<div id="googleMap" style="width: 100%; height: 420px;"></div>
		<script>
			function myMap() {
				myCenter = new google.maps.LatLng(14.6097, 120.9896);
				var mapOptions = {
					center : myCenter,
					zoom : 12,
					scrollwheel : false,
					draggable : false,
					mapTypeId : google.maps.MapTypeId.ROADMAP
				};
				var map = new google.maps.Map(document
						.getElementById("googleMap"), mapOptions);
				var marker = new google.maps.Marker({
					position : myCenter,
				});
				marker.setMap(map);
			}
		</script>
		<script
			src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBukntHWDgN5ipmdxeTnGJUhpvM__jF39Y&callback=myMap"></script>
		<!--
					To use this code on your website, get a free API key from Google.
					Read more at: https://www.w3schools.com/graphics/google_maps_basic.asp
					-->
		<!-- Footer -->
		<footer class="w3-container w3-padding-32 w3-theme-d1 w3-center antic">
			<h4>Follow Us</h4>
			<a class="w3-button w3-large w3-teal"
				href="https://www.facebook.com/CocoaJasz?fref=ts" title="Facebook"><i
				class="fa fa-facebook"></i></a> <a class="w3-button w3-large w3-teal"
				href="https://www.facebook.com/CocoaJasz?fref=ts" title="Twitter"><i
				class="fa fa-twitter"></i></a> <a class="w3-button w3-large w3-teal"
				href="https://www.facebook.com/CocoaJasz?fref=ts" title="Instagram"><i
				class="fa fa-instagram"></i></a>
			<p>
				Powered by <a href="https://www.facebook.com/CocoaJasz?fref=ts"
					target="_blank">97Espi Research Team</a>
			</p>
			<div style="position: relative; bottom: 100px; z-index: 1;"
				class="w3-tooltip w3-right">
				<span class="w3-text w3-padding w3-teal w3-hide-small">Go To
					Top</span> <a class="w3-button w3-theme" href="#myPage"><span
					class="w3-xlarge"> <i class="fa fa-chevron-circle-up"></i></span></a>
			</div>
		</footer>

	</div>
	<!-- END OF THE BODY -->

</body>
</html>

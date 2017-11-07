package model.manufacturer.airbus;

import model.manufacturer.Aircraft;

public class A319 extends Aircraft {

	@Override
	public String viewAircraftType() {
		String text;
		text = "A319";
		return text;
	}

	@Override
	public String viewDescription() {
		String text;
		text = "The Airbus A319 is a member of the Airbus A320 family of short - to medium-range, narrow-body, "
				+ "commercial passenger twin-engine jet airliners manufactured by Airbus. "
				+ "The A319 carries up to 160 passengers and has a maximum range of 3,700 nmi (6,900 km; 4,300 mi). "
				+ "The A319 is a shortened-fuselage variant of the Airbus A320 and entered service in April 1996 with Swissair, "
				+ "around two years after the stretched Airbus A321 and eight years after the original A320. "
				+ "The aircraft shares a common type rating with all other Airbus A320 family variants, "
				+ "allowing existing A320 family pilots to fly the aircraft without the need for further training.";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>A319-111</li>" + "<li>A319-112</li>" + "<li>A319-113</li>"
				+ "<li>A319-114</li>" + "<li>A319-115</li>" + "<li>A319-131</li>" + "<li>A319-132</li>"
				+ "<li>A319-133</li>" + "</ul>";
		return text;
	}

	@Override
	public double viewAircraftPrice() {
		double amount;
		amount = 19250000.0;
		return amount;
	}

}

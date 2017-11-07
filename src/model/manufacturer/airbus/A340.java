package model.manufacturer.airbus;

import model.manufacturer.Aircraft;

public class A340 extends Aircraft {

	@Override
	public String viewAircraftType() {
		String text;
		text = "A340";
		return text;
	}

	@Override
	public String viewDescription() {
		String text;
		text = "The Airbus A340 is a long-range, four-engine, wide-body commercial passenger jet airliner developed "
				+ "and produced by the European aerospace company Airbus. The A340 was assembled in Toulouse, France. "
				+ "It seats up to 375 passengers in the standard variants and 440 in the stretched -600 series. "
				+ "Depending on the model, it has a range of 6,700 to 9,000 nautical miles (12,400 to 16,700 km; 7,700 to 10,400 mi). "
				+ "Its distinguishing features are four high-bypass turbofan engines and three-bogie main landing gear. "
				+ "<br/><br/>The A340 was manufactured in four fuselage lengths. "
				+ "The initial variant, A340-300, which entered service in 1993, measured 63.69 metres (209.0 ft). "
				+ "The shorter -200 was developed next, and the A340-600 was a 15.96 metres (52.4 ft) stretch of the -200. "
				+ "The -600 was developed alongside the shorter A340-500, which would become the longest-range "
				+ "commercial airliner until the arrival of the Boeing 777-200LR. "
				+ "The -200 and -300 models were powered by the 151 kilonewtons (34,000 lbf) CFM56-5C, "
				+ "while the 267-kilonewton (60,000 lbf) Rolls-Royce Trent 500 was the exclusive powerplant "
				+ "for the extended-range -500 and -600 models. The initial A340-200 and -300 variants share "
				+ "the fuselage and wing of the twin-engine Airbus A330 with which it was concurrently designed. "
				+ "The heavier A340-500 and -600 are longer and have larger wings.";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>A340-211</li>" + "<li>A340-212</li>" + "<li>A340-213</li>"
				+ "<li>A340-311</li>" + "<li>A340-312</li>" + "<li>A340-313</li>" + "<li>A340-541</li>"
				+ "<li>A340-542</li>" + "<li>A340-642</li>" + "<li>A340-643</li>" + "</ul>";
		return text;
	}

	@Override
	public double viewAircraftPrice() {
		double amount;
		amount = 35750000.0;
		return amount;
	}

}

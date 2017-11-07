package model.manufacturer.airbus;

import model.manufacturer.Aircraft;

public class A320 extends Aircraft {

	@Override
	public String viewAircraftType() {
		String text;
		text = "A320";
		return text;
	}

	@Override
	public String viewDescription() {
		String text;
		text = "The first member of the A320 family—the A320—was launched in March 1984, "
				+ "first flew on 22 February 1987, and was first delivered in March 1988 "
				+ "to launch customer Air France. The family was extended to include the A321 "
				+ "(first delivered 1994), the A319 (1996), and the A318 (2003). "
				+ "The A320 family pioneered the use of digital fly-by-wire flight control systems, "
				+ "as well as side-stick controls, in commercial aircraft. "
				+ "There has been a continuous improvement process since introduction. <br/><br/>"
				+ "As of 31 August 2017, a total of 7,731 Airbus A320-family aircraft have been delivered, "
				+ "of which 7,397 are in service. In addition, another 5,520 airliners are on firm order. "
				+ "It ranked as the world's fastest-selling jet airliner family according to records from 2005 to 2007, "
				+ "and as the best-selling single-generation aircraft programme. "
				+ "The A320 family has proved popular with airlines including low-cost carriers such as EasyJet, "
				+ "which purchased A319s and A320s to replace its 737 fleet. As of 31 August 2017, "
				+ "American Airlines was the largest operator of the Airbus A320 family aircraft, operating 392 aircraft. "
				+ "The aircraft family competes directly with the 737 and has competed with the 717, 757, and the MD-80/MD-90.";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>A320-111</li>" + "<li>A320-211</li>" + "<li>A320-212</li>"
				+ "<li>A320-214</li>" + "<li>A320-215</li>" + "<li>A320-216</li>" + "<li>A320-231</li>"
				+ "<li>A320-232</li>" + "<li>A320-233</li>" + "</ul>";
		return text;
	}

	@Override
	public double viewAircraftPrice() {
		double amount;
		amount = 20150000.0;
		return amount;
	}

}

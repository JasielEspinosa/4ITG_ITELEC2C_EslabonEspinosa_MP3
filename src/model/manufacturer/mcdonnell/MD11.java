package model.manufacturer.mcdonnell;

import model.manufacturer.Aircraft;

public class MD11 extends Aircraft {

	@Override
	public String viewAircraftType() {
		String text;
		text = "MD11";
		return text;
	}

	@Override
	public String viewDescription() {
		String text;
		text = "The McDonnell Douglas MD-11 is an American three-engine medium - to long-range wide-body jet airliner, "
				+ "manufactured by McDonnell Douglas and, later, by Boeing Commercial Airplanes. "
				+ "Based on the DC-10, it features a stretched fuselage, increased wingspan with winglets, "
				+ "refined airfoils on the wing and smaller tailplane, new engines and increased use of composite materials. "
				+ "Two of its engines are mounted on underwing pylons and a third engine at the base of the vertical stabilizer. "
				+ "It also features a glass cockpit that decreases the flight deck crew to two from the three required "
				+ "on the DC-10 by eliminating the need for a flight engineer.";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>MD-11  </li>" + "<li>MD-11ER</li>" + "<li>MD-11CF</li>"
				+ "<li>MD-11C </li>" + "<li>MD-11F </li>" + "</ul>";
		return text;
	}

	@Override
	public double viewAircraftPrice() {
		double amount;
		amount = 62000000.0;
		return amount;
	}

}

package model.manufacturer.boeing;

import model.manufacturer.Aircraft;

public class B773 extends Aircraft {

	@Override
	public String viewAircraftType() {
		String text;
		text = "B773";
		return text;
	}

	@Override
	public String viewDescription() {
		String text;
		text = "The Boeing 777 is a family of long-range wide-body twin-engine jet airliners developed "
				+ "and manufactured by Boeing Commercial Airplanes. It is the world's largest twinjet "
				+ "and has a typical seating capacity of 314 to 396 passengers, with a range of 5,240 to 8,555 "
				+ "nautical miles (9,704 to 15,844 km). Commonly referred to as the \"Triple Seven\", "
				+ "its distinguishing features include the largest-diameter turbofan engines of any aircraft, "
				+ "six wheels on each main landing gear, fully circular fuselage cross-section, "
				+ "and a blade-shaped tail cone. Developed in consultation with eight major airlines, "
				+ "the 777 was designed to replace older wide-body airliners and bridge the capacity "
				+ "difference between Boeing's 767 and 747. As Boeing's first fly-by-wire airliner, "
				+ "it has computer-mediated controls. It was also the first commercial aircraft to be "
				+ "designed entirely with computer-aided design. <br/><br/>The 777 is produced in two fuselage "
				+ "lengths as of 2017. The original 777-200 variant entered commercial service in 1995, "
				+ "followed by the extended-range 777-200ER in 1997. The stretched 777-300, which is 33.25 ft "
				+ "(10.1 m) longer, followed in 1998. The initial 777-200, -200ER and -300 versions are equipped "
				+ "with General Electric GE90, Pratt & Whitney PW4000, or Rolls-Royce Trent 800 engines. "
				+ "The extended-range 777-300ER and ultra long-range 777-200LR variants entered service in 2004 and 2006 "
				+ "respectively, while the 777F, a freighter version, debuted in February 2009; these variants all "
				+ "feature high-output GE90 engines and extended raked wingtips. The 777-200LR is one of the world's "
				+ "longest-range airliners, able to fly more than halfway around the globe and holds the record for the "
				+ "longest distance flown non-stop by a commercial aircraft.";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>777-200	</li>" + "<li>777-200ER	</li>"
				+ "<li>777-200LR	</li>" + "<li>777-300	</li>" + "<li>777-300ER	</li>" + "<li>777F		</li>"
				+ "<li>777X		</li>" + "</ul>";
		return text;
	}

	@Override
	public double viewAircraftPrice() {
		double amount;
		amount = 57440000.0;
		return amount;
	}

}

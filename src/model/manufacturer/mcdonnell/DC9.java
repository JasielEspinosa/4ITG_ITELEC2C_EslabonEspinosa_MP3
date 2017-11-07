package model.manufacturer.mcdonnell;

import model.manufacturer.Aircraft;

public class DC9 extends Aircraft {

	@Override
	public String viewAircraftType() {
		String text;
		text = "DC9";
		return text;
	}

	@Override
	public String viewDescription() {
		String text;
		text = "The McDonnell Douglas DC-9 (initially known as Douglas DC-9) is a twin-engine, "
				+ "single-aisle jet airliner. It was first manufactured in 1965 with its maiden flight later that year. "
				+ "The DC-9 was designed for frequent, short flights. "
				+ "The final DC-9 was delivered in October 1982. The DC-9-based airliners, "
				+ "MD-80, MD-90 and Boeing 717 later followed in production. "
				+ "With the final deliveries of the 717 in 2006, production of the DC-9/MD-80/90/717 "
				+ "aircraft family ceased after 41 years and over 2,400 units built.";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>DC-9-10	</li>" + "<li>DC-9-10C  </li>"
				+ "<li>DC-9-20	</li>" + "<li>DC-9-30	</li>" + "<li>DC-9-30C  </li>" + "<li>DC-9-30F  </li>"
				+ "<li>DC-9-40	</li>" + "<li>DC-9-50	</li>" + "<li>C-9A	    </li>" + "<li>C-9B	    </li>"
				+ "<li>VC-9C     </li>" + "</ul>";
		return text;
	}

	@Override
	public double viewAircraftPrice() {
		double amount;
		amount = 49000000.0;
		return amount;
	}

}

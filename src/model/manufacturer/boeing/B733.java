package model.manufacturer.boeing;

import model.manufacturer.Aircraft;

public class B733 extends Aircraft {

	@Override
	public String viewAircraftType() {
		String text;
		text = "B733";
		return text;
	}

	@Override
	public String viewDescription() {
		String text;
		text = "The Boeing 737 is a short - to medium-range twinjet narrow-body airliner developed "
				+ "and manufactured by Boeing Commercial Airplanes in the United States. "
				+ "Originally developed as a shorter, lower-cost twin-engine airliner derived from the "
				+ "707 and 727, the 737 has developed into a family of ten passenger models with capacities "
				+ "from 85 to 215 passengers. The 737 is Boeing's only narrow-body airliner in production, "
				+ "with the 737 Next Generation (-700, -800, and -900ER) and the re-engined and redesigned "
				+ "737 MAX variants currently being built.";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>737-100	</li>" + "<li>737-200	</li>"
				+ "<li>737-200C	</li>" + "<li>737-T43A	</li>" + "<li>737-300	</li>" + "<li>737-400	</li>"
				+ "<li>737-500	</li>" + "<li>737-600	</li>" + "<li>737-700	</li>" + "<li>737-700C	</li>"
				+ "<li>737-700W	</li>" + "<li>737-800	</li>" + "<li>737-800A	</li>" + "<li>737-900	</li>"
				+ "<li>737-900ER	</li>" + "<li>737-BBJ1 	</li>" + "<li>737-BBJ2 	</li>" + "<li>737-BBJ3 	</li>"
				+ "<li>737 MAX 	</li>" + "</ul>";
		return text;
	}

	@Override
	public double viewAircraftPrice() {
		double amount;
		amount = 20730000.0;
		return amount;
	}

}

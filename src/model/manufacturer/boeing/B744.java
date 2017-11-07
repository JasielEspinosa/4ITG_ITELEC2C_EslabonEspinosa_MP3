package model.manufacturer.boeing;

import model.manufacturer.Aircraft;

public class B744 extends Aircraft {

	@Override
	public String viewAircraftType() {
		String text;
		text = "B744";
		return text;
	}

	@Override
	public String viewDescription() {
		String text;
		text = "The Boeing 747 is an American wide-body commercial jet airliner and cargo aircraft, "
				+ "often referred to by its original nickname, \"Jumbo Jet\". Its distinctive \"hump\" "
				+ "upper deck along the forward part of the aircraft makes it among the world's most recognizable aircraft, "
				+ "and it was the first wide-body produced. Manufactured by Boeing's Commercial Airplane unit in the United States, "
				+ "the original version of the 747 was envisioned to have 150 percent greater capacity than the Boeing 707, "
				+ "one of the common large commercial aircraft of the 1960s. First flown commercially in 1970, "
				+ "the 747 held the passenger capacity record for 37 years.";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>747-100	</li>" + "<li>747-100B	</li>"
				+ "<li>747-100SR	</li>" + "<li>747-200B	</li>" + "<li>747-200C	</li>" + "<li>747-200F	</li>"
				+ "<li>747-200M	</li>" + "<li>747 E-4A	</li>" + "<li>747-E4B	</li>" + "<li>747-300	</li>"
				+ "<li>747-300M	</li>" + "<li>747-300SR	</li>" + "<li>747-400	</li>" + "<li>747-400ER	</li>"
				+ "<li>747-400ERF</li>" + "<li>747-400F	</li>" + "<li>747-400M	</li>" + "<li>747-400D	</li>"
				+ "<li>747-8I	</li>" + "<li>747-8F	</li>" + "<li>747SP     </li>" + "</ul>";
		return text;
	}

	@Override
	public double viewAircraftPrice() {
		double amount;
		amount = 78500000.0;
		return amount;
	}

}

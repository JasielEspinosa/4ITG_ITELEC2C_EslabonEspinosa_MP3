package model.manufacturer.boeing;

import model.manufacturer.Manufactures;
import model.manufacturer.Aircraft;

public class TheBoeingCompany extends Manufactures {
	
	Aircraft aircraftDetails;
	
	@Override
	public String manufactureID() {
		return "Boeing";
	}

	@Override
	public String viewManufacturer() {
		return "The Boeing Company";
	}

	@Override
	public void setAircraft(Aircraft aircraftDetails) {
		this.aircraftDetails = aircraftDetails;
	}

	@Override
	public Aircraft getAircraft() {
		return this.aircraftDetails;
	}

}

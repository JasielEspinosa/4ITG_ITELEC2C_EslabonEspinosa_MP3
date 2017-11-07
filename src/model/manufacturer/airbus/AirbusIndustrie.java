package model.manufacturer.airbus;

import model.manufacturer.Manufactures;
import model.manufacturer.Aircraft;

public class AirbusIndustrie extends Manufactures {

	Aircraft aircraftDetails;
	
	@Override
	public String manufactureID() {
		return "Airbus";
	}

	@Override
	public String viewManufacturer() {
		return "Airbus Industrie";
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

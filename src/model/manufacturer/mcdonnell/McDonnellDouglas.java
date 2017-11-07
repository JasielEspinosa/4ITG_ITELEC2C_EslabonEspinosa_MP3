package model.manufacturer.mcdonnell;

import model.manufacturer.Manufactures;
import model.manufacturer.Aircraft;

public class McDonnellDouglas extends Manufactures {

	Aircraft aircraftDetails;
	
	@Override
	public String manufactureID() {
		return "McDonnellDouglas";
	}

	@Override
	public String viewManufacturer() {
		return "McDonnell Douglas";
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

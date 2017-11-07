package utility;

import model.company.Company;
import model.engine.EngineType;
import model.manufacturer.Manufactures;
import model.manufacturer.Aircraft;
import model.manufacturer.airbus.*;
import model.manufacturer.boeing.*;
import model.manufacturer.mcdonnell.*;

public class AircraftFactory implements AbstractFactory {

	@Override
	public Manufactures getAircraft(String input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aircraft getAircraft(String input, Manufactures aircraft) {

		Aircraft aircraftDetails = null;

		if (aircraft instanceof AirbusIndustrie) {
			System.out.println("AirbusIndustrie");
			switch (input) {
			case "A319":
				aircraftDetails = new A319();
				break;
			case "A320":
				aircraftDetails = new A320();
				break;
			case "A321":
				aircraftDetails = new A321();
				break;
			case "A330":
				aircraftDetails = new A330();
				break;
			case "A340":
				aircraftDetails = new A340();
				break;
			default:
				break;
			}
		}
		if (aircraft instanceof TheBoeingCompany) {
			System.out.println("TheBoeingCompany");
			switch (input) {
			case "B733":
				aircraftDetails = new B733();
				break;
			case "B744":
				aircraftDetails = new B744();
				break;
			case "B772":
				aircraftDetails = new B772();
				break;
			case "B773":
				aircraftDetails = new B773();
				break;
			default:
				break;
			}
		}
		if (aircraft instanceof McDonnellDouglas) {
			System.out.println("McDonnellDouglas");
			switch (input) {
			case "DC9":
				aircraftDetails = new DC9();
				break;
			case "DC10":
				aircraftDetails = new DC10();
				break;
			case "MD11":
				aircraftDetails = new MD11();
				break;
			default:
				break;
			}
		}

		return aircraftDetails;

	}

	@Override
	public Company getCompany(String input, Manufactures aircraft) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EngineType getEngineType(String input, Manufactures aircraft) {
		// TODO Auto-generated method stub
		return null;
	}

}

package utility;

import model.company.Company;
import model.engine.EngineType;
import model.manufacturer.*;
import model.manufacturer.airbus.*;
import model.manufacturer.boeing.*;
import model.manufacturer.mcdonnell.*;

public class ManufacturingFactory implements AbstractFactory {

	@Override
	public Manufactures getAircraft(String input) {

		Manufactures aircraft = null;

		switch (input) {

		case "Airbus":
			aircraft = new AirbusIndustrie();
			break;
		case "Boeing":
			aircraft = new TheBoeingCompany();
			break;
		case "McDonnellDouglas":
			aircraft = new McDonnellDouglas();
			break;
		}

		return aircraft;
	}

	@Override
	public Aircraft getAircraft(String input, Manufactures aircraft) {
		// TODO Auto-generated method stub
		return null;
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

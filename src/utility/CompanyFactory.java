package utility;

import model.company.Company;
import model.company.ceb.*;
import model.company.fdx.*;
import model.company.klm.*;
import model.company.pal.*;
import model.company.swa.*;
import model.engine.EngineType;
import model.manufacturer.*;
import model.manufacturer.airbus.*;
import model.manufacturer.boeing.*;
import model.manufacturer.mcdonnell.*;

public class CompanyFactory implements AbstractFactory {

	@Override
	public Manufactures getAircraft(String input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aircraft getAircraft(String input, Manufactures aircraft) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company getCompany(String input, Manufactures aircraft) {

		Company company = null;

		if (aircraft instanceof AirbusIndustrie) {
			switch (input) {
			case "A319 PAL":
				company = new A319PAL();
				break;
			case "A319 CEB":
				company = new A319CEB();
				break;
			case "A320 PAL":
				company = new A320PAL();
				break;
			case "A320 CEB":
				company = new A320CEB();
				break;
			case "A321 PAL":
				company = new A321PAL();
				break;
			case "A330 PAL":
				company = new A330PAL();
				break;
			case "A330 CEB":
				company = new A330CEB();
				break;
			case "A340 PAL":
				company = new A340PAL();
				break;
			default:
				break;
			}
		}
		if (aircraft instanceof TheBoeingCompany) {
			switch (input) {
			case "B733 PAL":
				company = new B733PAL();
				break;
			case "B733 SWA":
				company = new B733SWA();
				break;
			case "B744 PAL":
				company = new B744PAL();
				break;
			case "B772 KLM":
				company = new B772KLM();
				break;
			case "B773 PAL":
				company = new B773PAL();
				break;
			default:
				break;
			}
		}
		if (aircraft instanceof McDonnellDouglas) {
			switch (input) {
			case "DC9 CEB":
				company = new DC9CEB();
				break;
			case "DC10 PAL":
				company = new DC10PAL();
				break;
			case "DC10 FDX":
				company = new DC10FDX();
				break;
			case "MD11 KLM":
				company = new MD11KLM();
				break;
			default:
				break;
			}
		}

		return company;

	}

	@Override
	public EngineType getEngineType(String input, Manufactures aircraft) {
		// TODO Auto-generated method stub
		return null;
	}

}

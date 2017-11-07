package utility;

import model.company.Company;
import model.engine.EngineType;
import model.engine.cfm.*;
import model.engine.ge.*;
import model.engine.iae.*;
import model.engine.pw.*;
import model.engine.rr.*;
import model.manufacturer.Manufactures;
import model.manufacturer.Aircraft;

public class EngineFactory implements AbstractFactory {

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EngineType getEngineType(String input, Manufactures aircraft) {

		EngineType engineType = null;

		switch (input) {

		case "CFM565A":
			engineType = new CFM565A();
			break;
		case "CFM565B":
			engineType = new CFM565B();
			break;
		case "CFM565C":
			engineType = new CFM565C();
			break;
		case "CFM567B":
			engineType = new CFM567B();
			break;
		case "CFMLEAP1B":
			engineType = new CFMLEAP1B();
			break;
		case "IAEV2500":
			engineType = new IAEV2500();
			break;
		case "GECF6":
			engineType = new GECF6();
			break;
		case "GE90":
			engineType = new GE90();
			break;
		case "GENX":
			engineType = new GENX();
			break;
		case "JT8D":
			engineType = new JT8D();
			break;
		case "JT9D":
			engineType = new JT9D();
			break;
		case "PW4000":
			engineType = new PW4000();
			break;
		case "RB211":
			engineType = new RB211();
			break;
		case "RRT500":
			engineType = new RRT500();
			break;
		case "RRT700":
			engineType = new RRT700();
			break;
		case "RRT800":
			engineType = new RRT800();
			break;
		}

		return engineType;
	}

}

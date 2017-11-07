package utility;

import model.company.Company;
import model.engine.EngineType;
import model.manufacturer.*;

public interface AbstractFactory {

	Manufactures getAircraft(String input);

	Aircraft getAircraft(String input, Manufactures aircraft);

	Company getCompany(String input, Manufactures aircraft);

	EngineType getEngineType(String input, Manufactures aircraft);

}

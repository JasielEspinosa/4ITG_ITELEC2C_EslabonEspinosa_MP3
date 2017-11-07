package model.company.fdx;

import model.company.Company;

public class DC10FDX extends Company {

	@Override
	public String companyID() {
		return "DC10 FDX";
	}

	@Override
	public String viewCompanyName() {
		return "FedEx Express";
	}

	@Override
	public String viewICAO() {
		return "FDX";
	}

	@Override
	public String viewAircraftImage() {
		String imagePath = "<img src='images/DC10 FDX.jpg' class=\"image\"/>";
		return imagePath;
	}

}

package model.company.klm;

import model.company.Company;

public class B772KLM extends Company {
	
	@Override
	public String companyID() {
		return "B772 KLM";
	}

	@Override
	public String viewCompanyName() {
		return "KLM Royal Dutch Airlines";
	}

	@Override
	public String viewICAO() {
		return "KLM";
	}

	@Override
	public String viewAircraftImage() {
		String imagePath = "<img src='images/B772 KLM.jpg' class=\"image\"/>";
		return imagePath;
	}

}
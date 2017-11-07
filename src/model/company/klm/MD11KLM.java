package model.company.klm;

import model.company.Company;

public class MD11KLM extends Company {
	
	@Override
	public String companyID() {
		return "MD11 KLM";
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
		String imagePath = "<img src='images/MD11 KLM.jpg' class=\"image\"/>";
		return imagePath;
	}

}
package model.company.ceb;

import model.company.Company;

public class A330CEB extends Company {
	
	@Override
	public String companyID() {
		return "A330 CEB";
	}

	@Override
	public String viewCompanyName() {
		return "Cebu Pacific Airlines";
	}

	@Override
	public String viewICAO() {
		return "CEB";
	}

	@Override
	public String viewAircraftImage() {
		String imagePath = "<img src='images/A330 CEB.jpg' class=\"image\"/>";
		return imagePath;
	}

}
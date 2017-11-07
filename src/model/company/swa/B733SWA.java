package model.company.swa;

import model.company.Company;

public class B733SWA extends Company {
	
	@Override
	public String companyID() {
		return "B733 SWA";
	}

	@Override
	public String viewCompanyName() {
		return "South West Airlines";
	}

	@Override
	public String viewICAO() {
		return "SWA";
	}

	@Override
	public String viewAircraftImage() {
		String imagePath = "<img src='images/B733 SWA.jpg' class=\"image\"/>";
		return imagePath;
	}

}
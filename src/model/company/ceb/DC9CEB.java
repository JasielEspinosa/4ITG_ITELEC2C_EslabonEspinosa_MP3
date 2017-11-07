package model.company.ceb;

import model.company.Company;

public class DC9CEB extends Company {
	
	@Override
	public String companyID() {
		return "DC9 CEB";
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
		String imagePath = "<img src='images/DC9 CEB.jpg' class=\"image\"/>";
		return imagePath;
	}

}

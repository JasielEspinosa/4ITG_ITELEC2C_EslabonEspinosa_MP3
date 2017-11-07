package model.company.pal;

import model.company.Company;

public class DC10PAL extends Company {
	
	@Override
	public String companyID() {
		return "DC10 PAL";
	}

	@Override
	public String viewCompanyName() {
		return "Philippine Airlines";
	}

	@Override
	public String viewICAO() {
		return "PAL";
	}

	@Override
	public String viewAircraftImage() {
		String imagePath = "<img src='images/DC10 PAL.jpg' class=\"image\"/>";
		return imagePath;
	}

}
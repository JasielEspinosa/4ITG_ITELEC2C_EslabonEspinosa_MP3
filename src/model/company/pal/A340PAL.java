package model.company.pal;

import model.company.Company;

public class A340PAL extends Company {
	
	@Override
	public String companyID() {
		return "A340 PAL";
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
		String imagePath = "<img src='images/A340 PAL.jpg' class=\"image\"/>";
		return imagePath;
	}

}
package model.company.pal;

import model.company.Company;

public class A321PAL extends Company {
	
	@Override
	public String companyID() {
		return "A321 PAL";
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
		String imagePath = "<img src='images/A321 PAL.jpg' class=\"image\"/>";
		return imagePath;
	}

}

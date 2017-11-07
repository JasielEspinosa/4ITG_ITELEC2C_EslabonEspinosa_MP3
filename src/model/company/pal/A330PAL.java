package model.company.pal;

import model.company.Company;

public class A330PAL extends Company {
	
	@Override
	public String companyID() {
		return "A330 PAL";
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
		String imagePath = "<img src='images/A330 PAL.jpg' class=\"image\"/>";
		return imagePath;
	}

}
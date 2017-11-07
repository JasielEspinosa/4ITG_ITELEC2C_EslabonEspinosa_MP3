package model.company.pal;

import model.company.Company;

public class A320PAL extends Company {
	
	@Override
	public String companyID() {
		return "A320 PAL";
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
		String imagePath = "<img src='images/A320 PAL.jpg' class=\"image\"/>";
		return imagePath;
	}

}

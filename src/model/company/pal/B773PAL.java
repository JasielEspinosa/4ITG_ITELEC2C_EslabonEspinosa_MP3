package model.company.pal;

import model.company.Company;

public class B773PAL extends Company {
	
	@Override
	public String companyID() {
		return "B773 PAL";
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
		String imagePath = "<img src='images/B773 PAL.jpg' class=\"image\"/>";
		return imagePath;
	}

}
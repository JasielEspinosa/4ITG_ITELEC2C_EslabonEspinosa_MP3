package model.company.pal;

import model.company.Company;

public class A319PAL extends Company {
	
	@Override
	public String companyID() {
		return "A319 PAL";
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
		String imagePath = "<img src='images/A319 PAL.jpg' class=\"image\"/>";
		return imagePath;
	}

}

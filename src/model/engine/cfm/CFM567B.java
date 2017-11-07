package model.engine.cfm;

import model.engine.EngineType;

public class CFM567B extends EngineType{
	
	@Override
	public String engineID() {
		return "CFM567B";
	}

	@Override
	public String viewEngine() {
		return "CFM International CFM56-7B";
	}

	@Override
	public String viewEngineImage() {
		String imagePath = "<img src='images/btnCFM567B.jpg' class=\"image\"/>";
		return imagePath;
	}

}

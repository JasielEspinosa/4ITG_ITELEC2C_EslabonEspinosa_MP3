package model.engine.cfm;

import model.engine.EngineType;

public class CFM565A extends EngineType{
	
	@Override
	public String engineID() {
		return "CFM565A";
	}

	@Override
	public String viewEngine() {
		return "CFM International CFM56-5A";
	}

	@Override
	public String viewEngineImage() {
		String imagePath = "<img src='images/btnCFM565A.jpg' class=\"image\"/>";
		return imagePath;
	}

}

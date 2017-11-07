package model.engine.cfm;

import model.engine.EngineType;

public class CFM565B extends EngineType{
	
	@Override
	public String engineID() {
		return "CFM565B";
	}

	@Override
	public String viewEngine() {
		return "CFM International CFM56-5B";
	}

	@Override
	public String viewEngineImage() {
		String imagePath = "<img src='images/btnCFM565B.jpg' class=\"image\"/>";
		return imagePath;
	}

}

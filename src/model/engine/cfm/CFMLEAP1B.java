package model.engine.cfm;

import model.engine.EngineType;

public class CFMLEAP1B extends EngineType{
	
	@Override
	public String engineID() {
		return "CFMLEAP1B";
	}

	@Override
	public String viewEngine() {
		return "CFM International MAX CFM LEAP-1B";
	}

	@Override
	public String viewEngineImage() {
		String imagePath = "<img src='images/btnCFMLEAP1B.jpg' class=\"image\"/>";
		return imagePath;
	}

}

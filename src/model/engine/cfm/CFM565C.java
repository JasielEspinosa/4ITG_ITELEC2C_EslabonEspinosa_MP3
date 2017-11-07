package model.engine.cfm;

import model.engine.EngineType;

public class CFM565C extends EngineType{
	
	@Override
	public String engineID() {
		return "CFM565C";
	}

	@Override
	public String viewEngine() {
		return "CFM International CFM56-5C";
	}

	@Override
	public String viewEngineImage() {
		String imagePath = "<img src='images/btnCFM565C.jpg' class=\"image\"/>";
		return imagePath;
	}

}

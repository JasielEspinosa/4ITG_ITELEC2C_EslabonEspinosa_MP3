package model.engine.ge;

import model.engine.EngineType;

public class GENX extends EngineType{
	
	@Override
	public String engineID() {
		return "GENX";
	}

	@Override
	public String viewEngine() {
		return "General Electric GEnx";
	}

	@Override
	public String viewEngineImage() {
		String imagePath = "<img src='images/btnGENX.jpg' class=\"image\"/>";
		return imagePath;
	}

}

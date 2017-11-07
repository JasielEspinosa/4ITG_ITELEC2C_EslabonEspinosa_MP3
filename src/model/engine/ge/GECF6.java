package model.engine.ge;

import model.engine.EngineType;

public class GECF6 extends EngineType{
	
	@Override
	public String engineID() {
		return "GECF6";
	}

	@Override
	public String viewEngine() {
		return "General Electric CF6";
	}

	@Override
	public String viewEngineImage() {
		String imagePath = "<img src='images/btnGECF6.jpg' class=\"image\"/>";
		return imagePath;
	}

}

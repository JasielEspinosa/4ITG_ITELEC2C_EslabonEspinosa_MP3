package model.engine.iae;

import model.engine.EngineType;

public class IAEV2500 extends EngineType{
	
	@Override
	public String engineID() {
		return "IAEV2500";
	}

	@Override
	public String viewEngine() {
		return "International Aero Engines IAE V2500";
	}

	@Override
	public String viewEngineImage() {
		String imagePath = "<img src='images/btnIAEV2500.jpg' class=\"image\"/>";
		return imagePath;
	}

}

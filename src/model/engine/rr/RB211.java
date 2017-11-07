package model.engine.rr;

import model.engine.EngineType;

public class RB211 extends EngineType{
	
	@Override
	public String engineID() {
		return "RB211";
	}

	@Override
	public String viewEngine() {
		return "Rolls-Royce Trent 500";
	}

	@Override
	public String viewEngineImage() {
		String imagePath = "<img src='images/btnRRT500.jpg' class=\"image\"/>";
		return imagePath;
	}

}

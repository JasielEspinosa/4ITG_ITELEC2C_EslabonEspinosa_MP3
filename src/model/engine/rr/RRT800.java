package model.engine.rr;

import model.engine.EngineType;

public class RRT800 extends EngineType{
	
	@Override
	public String engineID() {
		return "RRT800";
	}

	@Override
	public String viewEngine() {
		return "Rolls-Royce Trent 800";
	}

	@Override
	public String viewEngineImage() {
		String imagePath = "<img src='images/btnRRT800.jpg' class=\"image\"/>";
		return imagePath;
	}

}

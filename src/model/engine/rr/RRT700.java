package model.engine.rr;

import model.engine.EngineType;

public class RRT700 extends EngineType{
	
	@Override
	public String engineID() {
		return "RRT700";
	}

	@Override
	public String viewEngine() {
		return "Rolls-Royce Trent 700";
	}

	@Override
	public String viewEngineImage() {
		String imagePath = "<img src='images/btnRRT700.jpg' class=\"image\"/>";
		return imagePath;
	}

}

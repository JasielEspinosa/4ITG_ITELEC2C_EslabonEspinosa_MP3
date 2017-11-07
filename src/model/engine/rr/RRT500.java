package model.engine.rr;

import model.engine.EngineType;

public class RRT500 extends EngineType{
	
	@Override
	public String engineID() {
		return "RRT500";
	}

	@Override
	public String viewEngine() {
		return "Rolls-Royce RB211";
	}

	@Override
	public String viewEngineImage() {
		String imagePath = "<img src='images/btnRRT700.jpg' class=\"image\"/>";
		return imagePath;
	}

}

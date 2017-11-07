package model.engine.ge;

import model.engine.EngineType;

public class GE90 extends EngineType{
	
	@Override
	public String engineID() {
		return "GE90";
	}

	@Override
	public String viewEngine() {
		return "General Electric GE90";
	}

	@Override
	public String viewEngineImage() {
		String imagePath = "<img src='images/btnGE90.jpg' class=\"image\"/>";
		return imagePath;
	}

}

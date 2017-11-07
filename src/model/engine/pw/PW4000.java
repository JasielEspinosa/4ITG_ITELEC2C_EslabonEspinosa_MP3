package model.engine.pw;

import model.engine.EngineType;

public class PW4000 extends EngineType{
	
	@Override
	public String engineID() {
		return "PW4000";
	}

	@Override
	public String viewEngine() {
		return "Pratt and Whitney PW4000";
	}

	@Override
	public String viewEngineImage() {
		String imagePath = "<img src='images/btnPW4000.jpg' class=\"image\"/>";
		return imagePath;
	}

}

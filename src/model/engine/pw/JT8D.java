package model.engine.pw;

import model.engine.EngineType;

public class JT8D extends EngineType{
	
	@Override
	public String engineID() {
		return "JT8D";
	}

	@Override
	public String viewEngine() {
		return "Pratt and Whitney JT8D";
	}

	@Override
	public String viewEngineImage() {
		String imagePath = "<img src='images/btnJT8D.jpg' class=\"image\"/>";
		return imagePath;
	}

}

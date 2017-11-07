package model.engine.pw;

import model.engine.EngineType;

public class JT9D extends EngineType{
	
	@Override
	public String engineID() {
		return "JT9D";
	}

	@Override
	public String viewEngine() {
		return "Pratt and Whitney JT9D";
	}

	@Override
	public String viewEngineImage() {
		String imagePath = "<img src='images/btnJT9D.jpg' class=\"image\"/>";
		return imagePath;
	}

}

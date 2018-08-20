package org.lixianyuan.factory.abstractFactory;

//颜色的工厂
public class ColorFactory extends AbstractFactory {
	@Override
	public Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}

	@Override
	public Shape getShape(String sharp) {
		// TODO Auto-generated method stub
		return null;
	}
}

package org.lixianyuan.factory.abstractFactory;

//测试类
//使用 FactoryProducer 来获取 AbstractFactory，通过传递类型信息来获取实体类的对象
public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {

		// 获取形状工厂
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		// 获取形状为 Rectangle 的对象
		Shape shape2 = (Shape) shapeFactory.getShape("RECTANGLE");

		// 调用 Rectangle 的 draw 方法
		shape2.draw();

		// 获取形状为 Square 的对象
		Shape shape3 = (Shape) shapeFactory.getShape("SQUARE");

		// 调用 Square 的 draw 方法
		shape3.draw();

		// 获取颜色工厂
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		// 获取颜色为 Red 的对象
		Color color1 = colorFactory.getColor("RED");

		// 调用 Red 的 fill 方法
		color1.addColor();


		// 获取颜色为 Blue 的对象
		Color color3 = colorFactory.getColor("BLUE");

		// 调用 Blue 的 fill 方法
		color3.addColor();
	}
}

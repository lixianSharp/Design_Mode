package org.lixianyuan.factory.abstractFactory;

//������
//ʹ�� FactoryProducer ����ȡ AbstractFactory��ͨ������������Ϣ����ȡʵ����Ķ���
public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {

		// ��ȡ��״����
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		// ��ȡ��״Ϊ Rectangle �Ķ���
		Shape shape2 = (Shape) shapeFactory.getShape("RECTANGLE");

		// ���� Rectangle �� draw ����
		shape2.draw();

		// ��ȡ��״Ϊ Square �Ķ���
		Shape shape3 = (Shape) shapeFactory.getShape("SQUARE");

		// ���� Square �� draw ����
		shape3.draw();

		// ��ȡ��ɫ����
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		// ��ȡ��ɫΪ Red �Ķ���
		Color color1 = colorFactory.getColor("RED");

		// ���� Red �� fill ����
		color1.addColor();


		// ��ȡ��ɫΪ Blue �Ķ���
		Color color3 = colorFactory.getColor("BLUE");

		// ���� Blue �� fill ����
		color3.addColor();
	}
}

package org.lixianyuan.template;

public class Test {
	public static void main(String[] args) {
		AbstractClass c;
		c = new ConcreteClassA();
		c.TemplateMethod();
		
		c = new ConcreteClassB();
		c.TemplateMethod();
		/**
		 * ��ӡ�����
		 * ������A����1ʵ��
			������A����2ʵ��
			������B����1ʵ��
			������B����2ʵ��

		 */
	}
}

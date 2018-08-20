package org.lixianyuan.template;

public class Test {
	public static void main(String[] args) {
		AbstractClass c;
		c = new ConcreteClassA();
		c.TemplateMethod();
		
		c = new ConcreteClassB();
		c.TemplateMethod();
		/**
		 * 打印结果：
		 * 具体类A方法1实现
			具体类A方法2实现
			具体类B方法1实现
			具体类B方法2实现

		 */
	}
}

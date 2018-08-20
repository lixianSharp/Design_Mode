package org.lixianyuan.decorator;
/**
 * 定义了一个具体的对象，也可以给这个对象添加一些职责，一般不在这里添加
 * @author 贤元
 *
 */
public class ConcreteComponent extends Component {

	@Override
	public void operation() {
		System.out.println("具体对象的操作---被装饰的对象");
	}

}

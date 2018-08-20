package org.lixianyuan.decorator;
/**
 * 装饰抽象类，继承了Component，从外类来扩展Component类的功能，但
 * 	对于Component来说，是无需知道Decorator的存在的
 * @author 贤元
 *
 */
public abstract class Decorator extends Component {
	
	//被装饰者对象的句柄
	protected Component component;
	
	//设置component，设置被装饰者
	public void setComponent(Component component) {
		this.component = component;
	}


	//重写operation，实际执行的是Component的operation
	@Override
	public void operation() {
		if(component!=null){
			component.operation();
		}
	}

}

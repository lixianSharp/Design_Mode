package org.lixianyuan.adapter;
//Adapter(通过在内部包装一个Adaptee对象，把源接口转换成目标接口
public class Adapter extends Target{

	//建立一个私有的Adaptee对象
	private Adaptee adaptee = new Adaptee();
	
	@Override
	public void request() {
		//这样就可以把表面上调用request()方法变成实际调用specificRequest()
		adaptee.specificRequest();
	}
}

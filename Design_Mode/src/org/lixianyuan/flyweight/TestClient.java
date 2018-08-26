package org.lixianyuan.flyweight;

public class TestClient {
	public static void main(String[] args) {
		//代码外部状态
		int extrinsicstate = 22;
		
		FlyweightFactory f = new FlyweightFactory();
		
		Flyweight fx = f.getFlyweight("X");
		fx.operation(--extrinsicstate);
		
		Flyweight fy = f.getFlyweight("Y");
		fx.operation(--extrinsicstate);
		
		Flyweight fz = f.getFlyweight("Z");
		fx.operation(--extrinsicstate);
		
		Flyweight uf = new UnsharedConcreteFlyweight();
		uf.operation(--extrinsicstate);
		
		/**打印结果：
		 *  具体Flyweight：21
			具体Flyweight：20
			具体Flyweight：19
			不共享的具体Flyweight:18
		 */
		
	}
}

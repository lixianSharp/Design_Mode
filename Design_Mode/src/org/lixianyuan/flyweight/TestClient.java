package org.lixianyuan.flyweight;

public class TestClient {
	public static void main(String[] args) {
		//�����ⲿ״̬
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
		
		/**��ӡ�����
		 *  ����Flyweight��21
			����Flyweight��20
			����Flyweight��19
			������ľ���Flyweight:18
		 */
		
	}
}

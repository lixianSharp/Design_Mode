package org.lixianyuan.bridge;
//Abstraction��
public class Abstraction {
	//�ۺ�
	protected Implementor implementor;

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}
	
	public void operation(){
		implementor.operation();//ʹ��Implementor�еķ���
	}
	
}

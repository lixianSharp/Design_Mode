package org.lixianyuan.facade;

//�ͻ���
public class Client {
	//�ͻ��˵���
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.methodA();
		facade.methodB();
		
		/**
		 * ��ӡ���
		 * ������A()---
			��ϵͳ����һ
			��ϵͳ������
			��ϵͳ������
			������B()---
			��ϵͳ������
			��ϵͳ������
		 */
	}
}

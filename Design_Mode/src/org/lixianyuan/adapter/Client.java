package org.lixianyuan.adapter;
//�ͻ���
public class Client {
	public static void main(String[] args) {
		//�Կͻ�����˵�����õľ���Target��request()����ʵ�ʵ��õ���specificRequest()
		
		Target target = new Adapter();
		target.request();//��������
	}
}

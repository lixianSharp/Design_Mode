package org.lixianyuan.single;
//����ģʽ---����ʽ  ���Լ�������ʱ�ͽ��Լ�ʵ����
public class Single2 {
	private static Single2 instance = new Single2();
	
	//���췽������private,��Ͷ�˿���������new��������ʵ���Ŀ���
	private Single2(){}
	
	//�˷����ǻ�ñ���ʵ����Ψһȫ�ַ��ʵ㣬���ظ����ʵ������̬����
	public static Single2 getInstance(){
		return instance;
	}
}

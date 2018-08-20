package org.lixianyuan.facade;
//�����
/**
 * ����ࣺ֪����Щ��ϵͳ�ฺ�������󣬽��ͻ������������ʵ�����ϵͳ����
 * @author ��Ԫ
 *
 */
public class Facade {
	private SubSystemOne one;
	
	private SubSystemTwo two;
	private SubSystemThree three;
	private SubSystemFour four;
	
	//���캯����Ϊ��ϵͳ��ʵ����ʼ��
	public Facade(){
		one = new SubSystemOne();
		two = new SubSystemTwo();
		three = new SubSystemThree();
		four = new SubSystemFour();
	}
	
	//������A(),����ִ���ض��Ĺ���A
	public void methodA(){
		System.out.println("������A()---");
		one.methodOne();
		two.methodTwo();
		four.methodFour();
	}
	
	//������B(),����ִ���ض��Ĺ���B
	public void methodB(){
		System.out.println("������B()---");
		two.methodTwo();
		three.methodThree();
	}
}

package org.lixianyuan.observer;
/**
 * �ͻ��˴���
 * @author ��Ԫ
 *
 */
public class TestClient {
	public static void main(String[] args) {
		//��������
		ConcreteSubject s= new ConcreteSubject();
		//Ϊ������ӹ۲���
		s.attach(new ConcreateObserver(s,"X"));
		s.attach(new ConcreateObserver(s,"Y"));
		s.attach(new ConcreateObserver(s,"Z"));
		//ģ��ı������״̬
		s.setSubjectState("ABC");
		//������״̬�ı�ʱ��֪ͨ�۲������Ĺ۲���������Ӧ�仯
		s.inform();
		
	}
}

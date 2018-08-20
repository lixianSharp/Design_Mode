package org.lixianyuan.observer;
/**
 * ConcreteObserver�࣬����۲��ߣ�ʵ�ֳ���۲�����ɫ��Ҫ��ĸ��½ӿڣ��Ա�ʹ�����״̬�������״̬��Э����
 * ����۲��߽�ɫ���Ա���һ��ֻ����������������á�����۲��߽�ɫͨ����һ����������ʵ��
 * 
 *ConcreteObserver�࣬����۲��ߣ�ʵ�ֳ���۲��߽�ɫ��Ҫ��ĸ��½ӿڣ��Ա�ʹ�����״̬�������״̬��Э����
 * @author ��Ԫ
 *
 */
public class ConcreateObserver extends Observer{
	private String name;//�۲�������
	private String observerState;//�۲���״̬
	private ConcreteSubject subject;//���⡣����۲���(Ҳ���Ǵ˹۲���)��Ҫ�۲������
	
	//���췽����Ϊ����subject��name��ʼ��
	public ConcreateObserver(ConcreteSubject subject,String name){
		this.subject = subject;
		this.name = name;
	}
	
	@Override
	public void update() {
		observerState = subject.getSubjectState();
		System.out.println("�۲���"+name+"�ĸ���״̬��"+observerState);
	}

	
	
	public ConcreteSubject getSubject() {
		return subject;
	}

	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}
	
}

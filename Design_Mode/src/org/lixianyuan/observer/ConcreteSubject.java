package org.lixianyuan.observer;
/**
 * ConcreteSubject�࣬����������������֪ͨ�ߣ����й�״̬�������۲��߶���
 * 	�ھ���������ڲ�״̬�ı�ʱ�������еȼ����Ĺ۲��߷���֪ͨ�����������ɫͨ����һ����������ʵ�֡�
 * 
 * ConcreteSubject�࣬�������⣬���й�״̬�������۲��߶����ھ���������ڲ�״̬�ı�ʱ�������еǼǹ��Ĺ۲��߷���֪ͨ��
 * @author ��Ԫ
 *
 */
public class ConcreteSubject extends Subject{
	//���屻�۲���״̬
	private String subjectState;

	
	
	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}
	
	
	
}

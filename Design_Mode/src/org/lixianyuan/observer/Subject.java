package org.lixianyuan.observer;

import java.util.LinkedList;
import java.util.List;
/**
 * Subject�࣬�ɷ���Ϊ��������֪ͨ�ߣ�һ����һ�����������һ���ӿ�ʵ�֡��������жԹ۲��߶�������ñ�����һ���ۼ��
 * 	ÿ�����ⶼ�������κ������Ĺ۲��ߡ����������ṩһ���ӿڣ��������Ӻ�ɾ���۲��߶���
 * 
 * Subject�࣬�������жԹ۲��߶�������ñ�����һ���ۼ��ÿ�����ⶼ�������κ������Ĺ۲��ߡ����������ṩһ����ڣ��������Ӻ�ɾ���۲��߶���
 * @author ��Ԫ
 *
 */
public abstract class Subject {
	
	//��һ��list���ϴ�Ź۲���
	private List<Observer> observers = new LinkedList<Observer>();
	
	//���ӹ۲���
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	//�Ƴ��۲���
	public void detach(Observer observer){
		observers.remove(observer);
	}
	
	//֪ͨ
	public void inform(){
		for(Observer o:observers){
			o.update();//֪ͨ�۲���������Ӧ�仯
		}
	}
	
}

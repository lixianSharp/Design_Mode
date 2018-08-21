package org.lixianyuan.state.stateex;
//�����࣬
public class Work {
	//����״̬
	private State current;
	//���캯����Ϊ����״̬��ʼ��
	public Work(){
		current = new ForenoonState();
	}
	
	//ʱ�䣬���ڶ��ٵ���
	private double hour;
	//�����Ƿ������
	private boolean finish = false;
	
	//���ù���״̬
	public void setState(State s){
		current = s;
	}
	
	//д����
	public void writeProgram(){
		current.writeProgram(this);
	}
	
	//���������Ե�get/set����
	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	
	
	
}

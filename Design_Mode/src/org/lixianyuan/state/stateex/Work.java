package org.lixianyuan.state.stateex;
//工作类，
public class Work {
	//工作状态
	private State current;
	//构造函数，为工作状态初始化
	public Work(){
		current = new ForenoonState();
	}
	
	//时间，现在多少点了
	private double hour;
	//任务是否完成了
	private boolean finish = false;
	
	//设置工作状态
	public void setState(State s){
		current = s;
	}
	
	//写程序
	public void writeProgram(){
		current.writeProgram(this);
	}
	
	//下面是属性的get/set方法
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

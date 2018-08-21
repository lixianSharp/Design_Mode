package org.lixianyuan.state.stateex;
//睡眠状态
public class SleepingState extends State {

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		System.out.println("当前时间："+w.getHour()+"点，不行了，睡着了");
	}

}

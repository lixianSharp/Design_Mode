package org.lixianyuan.state.stateex;
//下午工作状态
public class AfternoonState extends State {

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getHour()<17){
			System.out.println("当前工作时间:"+w.getHour()+"下午状态还不错，继续努力");
		}else{
			//超过17点，则转入傍晚工作状态
			w.setState(new EveningState());
			w.writeProgram();
		}
	}

}

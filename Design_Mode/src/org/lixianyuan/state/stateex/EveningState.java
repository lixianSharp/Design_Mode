package org.lixianyuan.state.stateex;
//傍晚工作状态
public class EveningState extends State {

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.isFinish()){
			//如果完成任务，则转入下班状态
			w.setState(new RestState());
			w.writeProgram();
		}else{
			if(w.getHour()<21){
				System.out.println("当前时间:"+w.getHour()+"点，加班哦，疲累之极");
			}else{
				//超过21点，则转入睡眠工作状态
				w.setState(new SleepingState());
				w.writeProgram();
			}
		}
	}

}

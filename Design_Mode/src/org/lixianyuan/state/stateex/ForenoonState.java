package org.lixianyuan.state.stateex;
//上午和中午工作状态的类
public class ForenoonState extends State {

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getHour()<12){
			System.out.println("当前时间"+w.getHour()+"点，上午工作精神百倍");
		}else{
			//超过12点，则转入中午工作状态
			w.setState(new NoonState());
			w.writeProgram();
		}
	}

}

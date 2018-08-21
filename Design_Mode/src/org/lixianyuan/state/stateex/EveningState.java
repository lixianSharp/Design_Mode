package org.lixianyuan.state.stateex;
//������״̬
public class EveningState extends State {

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.isFinish()){
			//������������ת���°�״̬
			w.setState(new RestState());
			w.writeProgram();
		}else{
			if(w.getHour()<21){
				System.out.println("��ǰʱ��:"+w.getHour()+"�㣬�Ӱ�Ŷ��ƣ��֮��");
			}else{
				//����21�㣬��ת��˯�߹���״̬
				w.setState(new SleepingState());
				w.writeProgram();
			}
		}
	}

}

package org.lixianyuan.state.stateex;
//���繤��״̬
public class AfternoonState extends State {

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getHour()<17){
			System.out.println("��ǰ����ʱ��:"+w.getHour()+"����״̬����������Ŭ��");
		}else{
			//����17�㣬��ת�������״̬
			w.setState(new EveningState());
			w.writeProgram();
		}
	}

}

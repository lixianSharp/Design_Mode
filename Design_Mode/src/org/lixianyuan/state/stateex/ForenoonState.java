package org.lixianyuan.state.stateex;
//��������繤��״̬����
public class ForenoonState extends State {

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getHour()<12){
			System.out.println("��ǰʱ��"+w.getHour()+"�㣬���繤������ٱ�");
		}else{
			//����12�㣬��ת�����繤��״̬
			w.setState(new NoonState());
			w.writeProgram();
		}
	}

}

package org.lixianyuan.state.stateex;
//���繤��״̬
public class NoonState extends State {

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getHour()<13){
			System.out.println("��ǰʱ�䣺"+w.getHour()+" ���ˣ��緹������������");
		}else{
			//����13�㣬��ת�����繤��״̬
			w.setState(new AfternoonState());
			w.writeProgram();
		}
	}

}

package org.lixianyuan.chainofresponsibility;
//ConcreteHandler3,����������20��30֮������Ȩ��������ת�Ƶ���һλ��
public class ConcreteHandler3 extends Handler {

	@Override
	public void handlerRequest(int request) {
		//20��30�����������
		if(request>=20&&request<30){
			System.out.println(this.getClass().getTypeName()+"��������"+request);
		}else if(successor !=null){
			//ת�Ƶ���һλ
			successor.handlerRequest(request);
		}
		
	}

}

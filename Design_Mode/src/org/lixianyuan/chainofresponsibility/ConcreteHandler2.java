package org.lixianyuan.chainofresponsibility;
//ConcreteHandler2������������10��20֮������Ȩ��������ת����һλ��
public class ConcreteHandler2 extends Handler {

	@Override
	public void handlerRequest(int request) {
		//10��20�����������
		if(request>=10&&request<20){
			System.out.println(this.getClass().getTypeName()+"��������"+request);
		}else if(successor !=null){
			//ת�Ƶ���һλ
			successor.handlerRequest(request);
		}
		
	}

}

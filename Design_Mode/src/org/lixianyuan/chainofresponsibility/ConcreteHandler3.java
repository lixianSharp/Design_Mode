package org.lixianyuan.chainofresponsibility;
//ConcreteHandler3,当请求数载20到30之间则有权处理，否则转移到下一位。
public class ConcreteHandler3 extends Handler {

	@Override
	public void handlerRequest(int request) {
		//20到30，处理此请求
		if(request>=20&&request<30){
			System.out.println(this.getClass().getTypeName()+"处理请求"+request);
		}else if(successor !=null){
			//转移到下一位
			successor.handlerRequest(request);
		}
		
	}

}

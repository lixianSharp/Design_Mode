package org.lixianyuan.chainofresponsibility;
//ConcreteHandler2，当请求数载10到20之间则有权处理，否则转到下一位。
public class ConcreteHandler2 extends Handler {

	@Override
	public void handlerRequest(int request) {
		//10到20，处理此请求
		if(request>=10&&request<20){
			System.out.println(this.getClass().getTypeName()+"处理请求"+request);
		}else if(successor !=null){
			//转移到下一位
			successor.handlerRequest(request);
		}
		
	}

}

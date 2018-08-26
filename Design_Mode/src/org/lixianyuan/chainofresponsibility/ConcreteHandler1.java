package org.lixianyuan.chainofresponsibility;
/**
 * ConcreteHandler类，具体处理者类，处理他所负责的请求，可以访问它的后继者，如果可以处理该请求，就处理，否则就将该请求转发给他的后继者。
 * 
 * ConcreteHandler1,当请求数在0到10之间则有权处理，否则转到下一位。
 * @author 贤元
 *
 */
public class ConcreteHandler1 extends Handler {

	@Override
	public void handlerRequest(int request) {
		//0到10，处理此请求
		if(request>=0&&request<10){
			System.out.println(this.getClass().getTypeName()+"处理请求"+request);
		}else if(successor!=null){
			//转移到下一位
			successor.handlerRequest(request);
		}
	}

}

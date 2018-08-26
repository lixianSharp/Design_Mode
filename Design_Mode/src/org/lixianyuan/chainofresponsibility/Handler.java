package org.lixianyuan.chainofresponsibility;
//Handler类，定义一个处理请示的接口
public abstract class Handler {
	protected Handler successor;
	
	//设置继任者
	public void setSuccesssor(Handler successor){
		this.successor = successor;
	}
	
	//处理请求的抽象方法
	public abstract void handlerRequest(int request);
	
}

package org.lixianyuan.chainofresponsibility;
//Handler�࣬����һ��������ʾ�Ľӿ�
public abstract class Handler {
	protected Handler successor;
	
	//���ü�����
	public void setSuccesssor(Handler successor){
		this.successor = successor;
	}
	
	//��������ĳ��󷽷�
	public abstract void handlerRequest(int request);
	
}

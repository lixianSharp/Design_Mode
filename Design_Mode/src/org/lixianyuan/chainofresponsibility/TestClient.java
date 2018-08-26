package org.lixianyuan.chainofresponsibility;
//客户端代码，向链上的具体处理者对象提交请求
public class TestClient {
	public static void main(String[] args) {
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler2();
		Handler h3 = new ConcreteHandler3();
		//设置职责链上家与下家
		h1.setSuccesssor(h2);
		h2.setSuccesssor(h3);
		
		int[] reuquests = {2,5,14,22,18,3,27,20};
		for(int request:reuquests){
			h1.handlerRequest(request);
		}
		
		/**打印结果如下：
		 *  org.lixianyuan.chainofresponsibility.ConcreteHandler1处理请求2
			org.lixianyuan.chainofresponsibility.ConcreteHandler1处理请求5
			org.lixianyuan.chainofresponsibility.ConcreteHandler2处理请求14
			org.lixianyuan.chainofresponsibility.ConcreteHandler3处理请求22
			org.lixianyuan.chainofresponsibility.ConcreteHandler2处理请求18
			org.lixianyuan.chainofresponsibility.ConcreteHandler1处理请求3
			org.lixianyuan.chainofresponsibility.ConcreteHandler3处理请求27
			org.lixianyuan.chainofresponsibility.ConcreteHandler3处理请求20
		 */
	}
	
}

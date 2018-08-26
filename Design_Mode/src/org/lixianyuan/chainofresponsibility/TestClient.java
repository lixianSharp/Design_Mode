package org.lixianyuan.chainofresponsibility;
//�ͻ��˴��룬�����ϵľ��崦���߶����ύ����
public class TestClient {
	public static void main(String[] args) {
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler2();
		Handler h3 = new ConcreteHandler3();
		//����ְ�����ϼ����¼�
		h1.setSuccesssor(h2);
		h2.setSuccesssor(h3);
		
		int[] reuquests = {2,5,14,22,18,3,27,20};
		for(int request:reuquests){
			h1.handlerRequest(request);
		}
		
		/**��ӡ������£�
		 *  org.lixianyuan.chainofresponsibility.ConcreteHandler1��������2
			org.lixianyuan.chainofresponsibility.ConcreteHandler1��������5
			org.lixianyuan.chainofresponsibility.ConcreteHandler2��������14
			org.lixianyuan.chainofresponsibility.ConcreteHandler3��������22
			org.lixianyuan.chainofresponsibility.ConcreteHandler2��������18
			org.lixianyuan.chainofresponsibility.ConcreteHandler1��������3
			org.lixianyuan.chainofresponsibility.ConcreteHandler3��������27
			org.lixianyuan.chainofresponsibility.ConcreteHandler3��������20
		 */
	}
	
}

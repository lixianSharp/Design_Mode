package org.lixianyuan.chainofresponsibility;
/**
 * ConcreteHandler�࣬���崦�����࣬����������������󣬿��Է������ĺ���ߣ�������Դ�������󣬾ʹ�������ͽ�������ת�������ĺ���ߡ�
 * 
 * ConcreteHandler1,����������0��10֮������Ȩ��������ת����һλ��
 * @author ��Ԫ
 *
 */
public class ConcreteHandler1 extends Handler {

	@Override
	public void handlerRequest(int request) {
		//0��10�����������
		if(request>=0&&request<10){
			System.out.println(this.getClass().getTypeName()+"��������"+request);
		}else if(successor!=null){
			//ת�Ƶ���һλ
			successor.handlerRequest(request);
		}
	}

}

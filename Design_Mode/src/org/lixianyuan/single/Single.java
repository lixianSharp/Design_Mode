package org.lixianyuan.single;
//����ģʽ---����ʽ ��һ�α�ʹ��ʱ���Żᱻʵ����
public class Single {
	private static Single instance;
	
	//���췽������private,��Ͷ�˿���������new��������ʵ���Ŀ���
	private Single(){}
	
	//�˷����ǻ�ñ���ʵ����Ψһȫ�ַ��ʵ㡣���ظ����ʵ��
	public static Single getInstance(){
		//��ʵ�������ڣ���new һ����ʵ�������򷵻����е�ʵ��
		if(instance==null){
			instance = new Single();
		}
		return instance;
	}
}

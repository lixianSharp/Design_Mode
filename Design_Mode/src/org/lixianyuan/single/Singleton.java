package org.lixianyuan.single;
//���߳�ʱ�ĵ���
public class Singleton {
	private static Singleton instance;
	private static  Object syncRoot = new Object();
	
	//�ù��췽��˽�У���Ͷ�˿���������new��������ʵ���Ŀ��ܡ��������ͨ��new��������
	private Singleton(){}
	
	//��̬����
	public static Singleton getInstance(){
		//���ж�ʵ���Ƿ���ڣ��������ټ�������
		if(instance==null){
			synchronized (syncRoot) {
				if(instance==null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	/**
	 * Ϊʲô�������Ѿ��ж���instanceʵ���Ƿ���ڣ���Ҫ��synchronized������һ��ʵ���Ƿ���ڵ��ж��أ�
	 * 	����instance���ڵ��������ֱ�ӷ��أ���û�����⡣
	 *  ��instanceΪnull����ͬʱ�������̵߳���getInstance()����ʱ�����Ƕ�����ͨ����һ��instance==null���жϡ�Ȼ������synchronized���ƣ�
	 *  	�������߳���ֻ��һ�����룬��һ�������ŶӵȺ򣬱���Ҫ���е�һ�����벢��������һ�����ܽ��롣
	 *  		����ʱ���û���˵ڶ��ص�instance�Ƿ�Ϊnull���жϣ����һ���̴߳�����ʵ�������ڶ����̻߳��ǿ��Լ����ٴ����µ�ʵ���������û�дﵽ������Ŀ���ˡ�
	 */
}

package org.lixianyuan.single;

public class TestClient {
	public static void main(String[] args) {
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		//�Ƚ�����ʵ���������Ľ����ʵ����ͬ
		if(s1==s2){
			System.out.println("������������ͬ��ʵ��");
		}else{
			System.out.println("��ͬ");
		}
		//��ӡ�����������������ͬ��ʵ��
	}
}

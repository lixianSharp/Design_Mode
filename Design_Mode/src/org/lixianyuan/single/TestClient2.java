package org.lixianyuan.single;

public class TestClient2 {
	public static void main(String[] args) {
		Single2 s1 = Single2.getInstance();
		Single2 s2 = Single2.getInstance();
		//�Ƚ�����ʵ���������Ľ����ʵ����ͬ
		if(s1==s2){
			System.out.println("������������ͬ��ʵ��");
		}else{
			System.out.println("��ͬ");
		}
		//��ӡ�����������������ͬ��ʵ��
	}
}

package org.lixianyuan.prototype.deepclone;
/**
 * ����ֶ���ֵ���͵ģ���Ը��ֶ�ִ����λ���ƣ�����ֶ����������ͣ��������ã����������õĶ�����ˣ�ԭʼ������临������ͬһ����
 * @author ��Ԫ
 *
 */
public class Test {
	public static void main(String[] args) {
		Resume a = new Resume("����");
		a.setPersonalInfo("��", "29");
		a.setWorkExperience("1988-2000", " xx��˾");
		
		Resume b = a.clone();//���
		b.setWorkExperience("1988-2003", " yy��˾");
		
		Resume c =  a.clone();//���
		c.setWorkExperience("1988-2006", " zz��˾");
		
		a.display();
		b.display();
		c.display();
		
		/**
		 * ��ӡ������£�
		 *  ����:��:29
			����������1988-2000 xx��˾
			����:��:29
			����������1988-2003 yy��˾
			����:��:29
			����������1988-2006 zz��˾

		 */
	}
}

package org.lixianyuan.component.componentex;
//�ͻ���
public class TestClient {
	public static void main(String[] args) {
		ConcreteCompany root = new ConcreteCompany("�����ܹ�˾");
		root.add(new HRDepartment("�ܹ�˾������Դ��"));
		root.add(new FinanceDepartment("�ܹ�˾����"));
		
		ConcreteCompany comp = new ConcreteCompany("�����ֹ�˾");
		comp.add(new HRDepartment("�����ֹ�˾������Դ��"));
		comp.add(new FinanceDepartment("�����ֹ�˾����"));
		root.add(comp);//���ӹ�˾��ӵ��ܹ�˾
		
		ConcreteCompany comp1 = new ConcreteCompany("�Ͼ����´�");
		comp1.add(new HRDepartment("�Ͼ��´�������Դ��"));
		comp1.add(new FinanceDepartment("�Ͼ����´�����"));
		root.add(comp1);//���ӹ�˾��ӵ��ܹ�˾
		
		ConcreteCompany comp2 = new ConcreteCompany("���ݰ��´�");
		comp2.add(new HRDepartment("���ݰ��´�������Դ��"));
		comp2.add(new FinanceDepartment("���ݰ��´�����"));
		root.add(comp2);//���ӹ�˾��ӵ��ܹ�˾
		
		System.out.println("�ṹͼ��");
		root.display(1);
		
		System.out.println("ְ��");
		root.lineOfDuty();
		
	}
}

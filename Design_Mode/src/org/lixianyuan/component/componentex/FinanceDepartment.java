package org.lixianyuan.component.componentex;
//����
public class FinanceDepartment extends Company {

	public FinanceDepartment(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {
	}

	@Override
	public void remove(Company c) {
	}

	@Override
	public void display(int depth) {
		String str = "";//����ƴ��'-',dept���ڶ��پͱ�ʾƴ�Ӽ���'-',������ʾЧ��
		for(int i=0;i<depth;i++){
			str +="-";
		}
		System.out.println(str+name);
	}

	@Override
	public void lineOfDuty() {
		System.out.println(name+"��˾������֧����");
	}

}

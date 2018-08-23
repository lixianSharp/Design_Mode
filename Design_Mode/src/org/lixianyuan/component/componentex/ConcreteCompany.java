package org.lixianyuan.component.componentex;

import java.util.LinkedList;
import java.util.List;

//���幫˾�࣬ʵ�ֽӿڣ���֦�ڵ�
public class ConcreteCompany extends Company {

	private List<Company> children = new LinkedList<Company>();
	
	//���췽��
	public ConcreteCompany(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {
		children.add(c);
	}

	@Override
	public void remove(Company c) {
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		String str = "";//����ƴ��'-',dept���ڶ��پͱ�ʾƴ�Ӽ���'-',������ʾЧ��
		for(int i=0;i<depth;i++){
			str +="-";
		}
		System.out.println(str+name);
		
		for(Company component:children){
			component.display(depth+2);//�ݹ���ʾ
		}
	}
	
	
	//����ְ��
	@Override
	public void lineOfDuty() {
		// TODO Auto-generated method stub
		for(Company component:children){
			component.lineOfDuty();
		}
	}

}

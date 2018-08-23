package org.lixianyuan.component.componentex;
//财务部
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
		String str = "";//用于拼接'-',dept等于多少就表示拼接几个'-',用于显示效果
		for(int i=0;i<depth;i++){
			str +="-";
		}
		System.out.println(str+name);
	}

	@Override
	public void lineOfDuty() {
		System.out.println(name+"公司财务收支管理");
	}

}

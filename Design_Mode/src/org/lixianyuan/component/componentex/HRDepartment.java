package org.lixianyuan.component.componentex;

//人力资源部
public class HRDepartment extends Company {

	public HRDepartment(String name) {
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
		String str = "";// 用于拼接'-',dept等于多少就表示拼接几个'-',用于显示效果
		for (int i = 0; i < depth; i++) {
			str += "-";
		}
		System.out.println(str + name);
	}

	// 履行职责
	@Override
	public void lineOfDuty() {
		System.out.println(name + "员工招聘管理培训");
	}
}

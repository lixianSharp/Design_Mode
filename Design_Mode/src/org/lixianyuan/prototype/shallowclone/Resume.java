package org.lixianyuan.prototype.shallowclone;

//简历类
public class Resume implements Cloneable{
	private String name;
	private String sex;
	private String age;

	// 引用"工作经历"对象
	private WorkExperience work;

	// 构造方法
	public Resume(String name) {
		this.name = name;
		work = new WorkExperience();
	}

	// 设置个人信息
	public void setPersonalInfo(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}

	// 设置工作经历
	public void setWorkExperience(String workDate, String company) {
		//调用此方法时，给对象的两属性赋值
		work.setWorkDate(workDate);
		work.setCompany(company);
	}

	// 显示
	public void display() {
		System.out.println(name + ":" + sex + ":" + age);
		// 显示时，显示工作经历的两个属性
		System.out.println("工作经历：" + work.getWorkDate() + work.getCompany());
	}

	//复制对象，浅复制
	public Resume clone() {
		Object obj = null;
		try{
			obj = super.clone();
			return (Resume) obj;
		}catch (CloneNotSupportedException e){
			System.out.println("不支持复制！");
			return null;
		}
	}
}

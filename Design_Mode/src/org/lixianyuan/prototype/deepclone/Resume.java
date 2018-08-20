package org.lixianyuan.prototype.deepclone;

//简历类
public class Resume implements Cloneable {
	private String name;
	private String sex;
	private String age;

	// 引用“工作经历”对象
	private WorkExperience work;

	// 构造方法
	public Resume(String name) {
		this.name = name;
		work = new WorkExperience();
	}
	
	//构造方法
	private Resume(WorkExperience work){
		//提供clone方法调用的私有构造函数，以便克隆"工作经历"的数据
		this.work = (WorkExperience)work.clone();
	}

	// 设置个人信息
	public void setPersonalInfo(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}

	// 设置工作经历
	public void setWorkExperience(String workDate, String company) {
		// 调用此方法时，给对象的两属性赋值
		work.setWorkDate(workDate);
		work.setCompany(company);
	}

	// 显示
	public void display() {
		System.out.println(name + ":" + sex + ":" + age);
		// 显示时，显示工作经历的两个属性
		System.out.println("工作经历：" + work.getWorkDate() + work.getCompany());
	}
	
	//进行"深复制"克隆Resume对象
	public Resume clone(){
		//调用私有的构造方法，让“工作经历”克隆完成，然后再给这个“简历”对象的相关字段赋值，最终返回一个深复制的简历对象。
		Resume obj = new Resume(this.work);
		obj.name = this.name;
		obj.sex = this.sex;
		obj.age = this.age;
		
		//以上四行代码是重新封装一个一模一样的Resume对象，内容是一样的，但是他们的引用指向的是两个独立的对象，就相当于复制的不是引用，而是一个完整的对象
		return obj;
	}

}

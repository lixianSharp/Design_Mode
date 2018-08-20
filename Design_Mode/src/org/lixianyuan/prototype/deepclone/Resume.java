package org.lixianyuan.prototype.deepclone;

//������
public class Resume implements Cloneable {
	private String name;
	private String sex;
	private String age;

	// ���á���������������
	private WorkExperience work;

	// ���췽��
	public Resume(String name) {
		this.name = name;
		work = new WorkExperience();
	}
	
	//���췽��
	private Resume(WorkExperience work){
		//�ṩclone�������õ�˽�й��캯�����Ա��¡"��������"������
		this.work = (WorkExperience)work.clone();
	}

	// ���ø�����Ϣ
	public void setPersonalInfo(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}

	// ���ù�������
	public void setWorkExperience(String workDate, String company) {
		// ���ô˷���ʱ��������������Ը�ֵ
		work.setWorkDate(workDate);
		work.setCompany(company);
	}

	// ��ʾ
	public void display() {
		System.out.println(name + ":" + sex + ":" + age);
		// ��ʾʱ����ʾ������������������
		System.out.println("����������" + work.getWorkDate() + work.getCompany());
	}
	
	//����"���"��¡Resume����
	public Resume clone(){
		//����˽�еĹ��췽�����á�������������¡��ɣ�Ȼ���ٸ���������������������ֶθ�ֵ�����շ���һ����Ƶļ�������
		Resume obj = new Resume(this.work);
		obj.name = this.name;
		obj.sex = this.sex;
		obj.age = this.age;
		
		//�������д��������·�װһ��һģһ����Resume����������һ���ģ��������ǵ�����ָ��������������Ķ��󣬾��൱�ڸ��ƵĲ������ã�����һ�������Ķ���
		return obj;
	}

}

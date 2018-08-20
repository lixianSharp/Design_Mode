package org.lixianyuan.prototype.shallowclone;

//������
public class Resume implements Cloneable{
	private String name;
	private String sex;
	private String age;

	// ����"��������"����
	private WorkExperience work;

	// ���췽��
	public Resume(String name) {
		this.name = name;
		work = new WorkExperience();
	}

	// ���ø�����Ϣ
	public void setPersonalInfo(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}

	// ���ù�������
	public void setWorkExperience(String workDate, String company) {
		//���ô˷���ʱ��������������Ը�ֵ
		work.setWorkDate(workDate);
		work.setCompany(company);
	}

	// ��ʾ
	public void display() {
		System.out.println(name + ":" + sex + ":" + age);
		// ��ʾʱ����ʾ������������������
		System.out.println("����������" + work.getWorkDate() + work.getCompany());
	}

	//���ƶ���ǳ����
	public Resume clone() {
		Object obj = null;
		try{
			obj = super.clone();
			return (Resume) obj;
		}catch (CloneNotSupportedException e){
			System.out.println("��֧�ָ��ƣ�");
			return null;
		}
	}
}

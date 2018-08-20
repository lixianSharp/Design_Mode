package org.lixianyuan.prototype.deepclone;

import org.lixianyuan.prototype.shallowclone.Resume;

//��������
public class WorkExperience implements Cloneable{
	//����ʱ��
	private String workDate;
	//������˾
	private String company;
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	public WorkExperience clone() {
		Object obj = null;
		try{
			obj = super.clone();
			return (WorkExperience) obj;
		}catch (CloneNotSupportedException e){
			System.out.println("��֧�ָ��ƣ�");
			return null;
		}
	}
	
}

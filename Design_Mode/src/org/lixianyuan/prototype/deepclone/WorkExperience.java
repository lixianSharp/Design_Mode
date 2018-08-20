package org.lixianyuan.prototype.deepclone;

import org.lixianyuan.prototype.shallowclone.Resume;

//工作经历
public class WorkExperience implements Cloneable{
	//工作时间
	private String workDate;
	//工作公司
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
			System.out.println("不支持复制！");
			return null;
		}
	}
	
}

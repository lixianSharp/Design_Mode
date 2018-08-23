package org.lixianyuan.component.componentex;
//客户端
public class TestClient {
	public static void main(String[] args) {
		ConcreteCompany root = new ConcreteCompany("北京总公司");
		root.add(new HRDepartment("总公司人力资源部"));
		root.add(new FinanceDepartment("总公司财务部"));
		
		ConcreteCompany comp = new ConcreteCompany("华东分公司");
		comp.add(new HRDepartment("华东分公司人力资源部"));
		comp.add(new FinanceDepartment("华东分公司财务部"));
		root.add(comp);//将子公司添加到总公司
		
		ConcreteCompany comp1 = new ConcreteCompany("南京办事处");
		comp1.add(new HRDepartment("南京事处人力资源部"));
		comp1.add(new FinanceDepartment("南京办事处财务部"));
		root.add(comp1);//将子公司添加到总公司
		
		ConcreteCompany comp2 = new ConcreteCompany("杭州办事处");
		comp2.add(new HRDepartment("杭州办事处人力资源部"));
		comp2.add(new FinanceDepartment("杭州办事处财务部"));
		root.add(comp2);//将子公司添加到总公司
		
		System.out.println("结构图：");
		root.display(1);
		
		System.out.println("职责：");
		root.lineOfDuty();
		
	}
}

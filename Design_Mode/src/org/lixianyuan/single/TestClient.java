package org.lixianyuan.single;

public class TestClient {
	public static void main(String[] args) {
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		//比较两次实例化后对象的结果是实例相同
		if(s1==s2){
			System.out.println("两个对象是相同的实例");
		}else{
			System.out.println("不同");
		}
		//打印结果：两个对象是相同的实例
	}
}

package org.lixianyuan.adapter;
//客户端
public class Client {
	public static void main(String[] args) {
		//对客户端来说，调用的就是Target的request()。但实际调用的是specificRequest()
		
		Target target = new Adapter();
		target.request();//特殊请求！
	}
}

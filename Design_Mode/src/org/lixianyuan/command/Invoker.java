package org.lixianyuan.command;
//Invoker�࣬Ҫ�������ִ���������
public class Invoker {
	private Command command;
	public void setCommand(Command command){
		this.command = command;
	}
	public void executeCommand(){
		command.execute();//ִ������
	}
}

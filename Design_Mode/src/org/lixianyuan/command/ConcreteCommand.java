package org.lixianyuan.command;
//ConcreteCommand�࣬��һ�������߶������һ�����������ý�������Ӧ��������ʵ��execute��
public class ConcreteCommand extends Command{
	//���췽��
	public ConcreteCommand(Receiver receiver) {
		super(receiver);
	}

	//ִ������
	@Override
	public void execute() {
		receiver.action();
	}
	
}

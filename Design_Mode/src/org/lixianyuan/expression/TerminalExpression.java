package org.lixianyuan.expression;

/**
 * TerminalExpression�ս�����ʽ��ʵ�������е��ս��������Ľ��Ͳ�����
 * 	ʵ�ֳ�����ʽ����Ҫ��Ľӿڣ���Ҫ��һ��interpret()������
 *  �ķ���ÿһ���ս������һ�������ս�����ʽ��֮���Ӧ
 * @author ��Ԫ
 *
 */
public class TerminalExpression extends AbstractExpression{

	@Override
	public void interpret(Context context) {
		System.out.println("�ն˽�����");
	}

}

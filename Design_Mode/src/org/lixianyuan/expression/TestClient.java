package org.lixianyuan.expression;

import java.util.ArrayList;
import java.util.List;

//�ͻ��˴��룬������ʾ���ķ�����������е�һ���ض��ľ��ӵĳ����﷨�������ý��Ͳ���
public class TestClient {
	public static void main(String[] args) {
		Context context =new Context();
		List<AbstractExpression> list = new ArrayList<AbstractExpression>();
		list.add(new TerminalExpression());
		list.add(new NonterminalExpression());
		list.add(new TerminalExpression());
		list.add(new TerminalExpression());
		
		for(AbstractExpression exp:list){
			exp.interpret(context);
		}
		
		/**
		 * ��ӡ�����
		 *  �ն˽�����
			���ն˽�����
			�ն˽�����
			�ն˽�����
		 */
	}
}

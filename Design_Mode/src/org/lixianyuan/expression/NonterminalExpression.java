package org.lixianyuan.expression;
/**
 * NonterminalExpression���ս�����ʽ��Ϊ�ķ��еķ��ս��ʵ�ֽ�����������
 * 	���ķ���ÿһ������R1��R2....Rn����Ҫһ��������ս�����ʽ�ࡣͨ��ʵ�ֳ�����ʽ��interpret()����ʵ�ֽ��Ͳ�����
 * 	���Ͳ����Եݹ鷽ʽ�����������ᵽ�Ĵ���R1��R2...Rn�и������ŵ�ʵ��������
 * @author ��Ԫ
 *
 */
public class NonterminalExpression extends AbstractExpression {

	@Override
	public void interpret(Context context) {
		System.out.println("���ն˽�����");
	}

}

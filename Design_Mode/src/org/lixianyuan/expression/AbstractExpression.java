package org.lixianyuan.expression;
//AbstractExpression抽象表达式，声明一个抽象的解释操作，这个接口为抽象语法树种所有的节点所共享
public abstract class AbstractExpression {
	public abstract void interpret(Context context);
}

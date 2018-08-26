package org.lixianyuan.expression;

import java.util.ArrayList;
import java.util.List;

//客户端代码，构建表示该文法定义的语言中的一个特定的句子的抽象语法树。调用解释操作
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
		 * 打印结果：
		 *  终端解释器
			非终端解释器
			终端解释器
			终端解释器
		 */
	}
}

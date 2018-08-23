package org.lixianyuan.component;

import java.util.LinkedList;
import java.util.List;

/**
 * Component定义有枝节点行为，用来存储子部件，
 * 	在Component接口中实现与子部件有关的操作，比如增加add和删除remove
 * @author 贤元
 *
 */
public class Composite extends Component {
	
	private List<Component> children = new LinkedList<Component>();
	
	public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component c) {
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		String str = "";//用于拼接'-',depth表示多少，就拼接多少个'-',用于显示效果
		for(int i=0;i<depth;i++){
			str += "-";
		}
		System.out.println(str+name);
		
		for(Component component:children){
			component.display((depth+2));
		}
	}

}

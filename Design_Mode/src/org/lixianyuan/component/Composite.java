package org.lixianyuan.component;

import java.util.LinkedList;
import java.util.List;

/**
 * Component������֦�ڵ���Ϊ�������洢�Ӳ�����
 * 	��Component�ӿ���ʵ�����Ӳ����йصĲ�������������add��ɾ��remove
 * @author ��Ԫ
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
		String str = "";//����ƴ��'-',depth��ʾ���٣���ƴ�Ӷ��ٸ�'-',������ʾЧ��
		for(int i=0;i<depth;i++){
			str += "-";
		}
		System.out.println(str+name);
		
		for(Component component:children){
			component.display((depth+2));
		}
	}

}

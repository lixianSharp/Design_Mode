package org.lixianyuan.component;

public class Leaf extends Component{
	
	public Leaf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * ����Ҷ��û�������ӷ�֧����Ҷ������add��removeʵ����û�����壬
	 * 	����������������Ҷ�ڵ��֦�ڵ�����ڳ����ε��������Ǿ߱���ȫһ�µĽӿڡ�
	 */
	@Override
	public void add(Component c) {
		System.out.println("Cannot add to a leaf"); 
	}

	@Override
	public void remove(Component c) {
		System.out.println("Cannot remove from a leaf");
	}

	//Ҷ�ڵ�ľ��巽�����˴�����ʾ�����ƺͼ���
	@Override
	public void display(int depth) {
		String str = "";////����ƴ��'-',depth��ʾ���٣���ƴ�Ӷ��ٸ�'-',������ʾЧ��
		for(int i=0;i<depth;i++){
			str += "-";
		}
		System.out.println(str+name);
	}
}

package org.lixianyuan.component;

public class Leaf extends Component{
	
	public Leaf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 由于叶子没有再增加分支和树叶，所以add和remove实现它没有意义，
	 * 	但这样做可以消除叶节点和枝节点对象在抽象层次的区别，他们具备完全一致的接口。
	 */
	@Override
	public void add(Component c) {
		System.out.println("Cannot add to a leaf"); 
	}

	@Override
	public void remove(Component c) {
		System.out.println("Cannot remove from a leaf");
	}

	//叶节点的具体方法，此处是显示其名称和级别
	@Override
	public void display(int depth) {
		String str = "";////用于拼接'-',depth表示多少，就拼接多少个'-',用于显示效果
		for(int i=0;i<depth;i++){
			str += "-";
		}
		System.out.println(str+name);
	}
}

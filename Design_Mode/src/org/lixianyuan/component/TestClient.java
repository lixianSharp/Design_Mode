package org.lixianyuan.component;

public class TestClient {
	public static void main(String[] args) {
		//��������root�����ϳ�����ҶLeafA��LeafB
		Component root = new Composite("root");
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));
		
		//���ϳ�����֧CompositeX����֧��Ҳ����ҶLeafXA��LeafXB
		Composite comp = new Composite("Composite A");
		comp.add(new Leaf("Leaf XA"));
		comp.add(new Leaf("Leaf XB"));
		
		root.add(comp);
		
		//��CompositeX���ٳ�����֧CompositeXY����֧��Ҳ����ҶLeafXYA��LeafXYB
		Composite comp2 = new Composite("Composite XY");
		comp2.add(new Leaf("Leaf XYA"));
		comp2.add(new Leaf("Leaf XYB"));
		
		comp.add(comp2);
		
		root.add(new Leaf("Leaf C"));
		
		//�����ֳ�����ҶLeafC��LeafD,��ϧLeafDû���Σ����紵����
		Leaf leaf = new Leaf("Leaf D");
		root.add(leaf);
		root.remove(leaf);
		
		//��ʾ����������
		root.display(1);
		
	}
}

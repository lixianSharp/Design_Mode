package org.lixianyuan.component;

public class TestClient {
	public static void main(String[] args) {
		//生成树根root，根上长出两叶LeafA和LeafB
		Component root = new Composite("root");
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));
		
		//根上长出分支CompositeX，分支上也有两叶LeafXA和LeafXB
		Composite comp = new Composite("Composite A");
		comp.add(new Leaf("Leaf XA"));
		comp.add(new Leaf("Leaf XB"));
		
		root.add(comp);
		
		//在CompositeX上再长出分支CompositeXY，分支上也有两叶LeafXYA和LeafXYB
		Composite comp2 = new Composite("Composite XY");
		comp2.add(new Leaf("Leaf XYA"));
		comp2.add(new Leaf("Leaf XYB"));
		
		comp.add(comp2);
		
		root.add(new Leaf("Leaf C"));
		
		//根部又长出两叶LeafC和LeafD,可惜LeafD没长牢，被风吹走了
		Leaf leaf = new Leaf("Leaf D");
		root.add(leaf);
		root.remove(leaf);
		
		//显示大树的样子
		root.display(1);
		
	}
}

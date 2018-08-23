package org.lixianyuan.component;
/**
 * ComponentΪ����еĶ��������ӿڣ����ʵ�����£�ʵ�������๲�нӿڵ�Ĭ����Ϊ��
 * 	����һ���ӿ����ڷ��ʺ͹���Component���Ӳ���
 * @author ��Ԫ
 *
 */
public abstract class Component {
	protected String name;
	public Component(String name){
		this.name = name;
	}
	
	public abstract void add(Component c);
	public abstract void remove(Component c);
	public abstract void display(int depth);
}

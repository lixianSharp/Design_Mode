package org.lixianyuan.decorator;
/**
 * װ�γ����࣬�̳���Component������������չComponent��Ĺ��ܣ���
 * 	����Component��˵��������֪��Decorator�Ĵ��ڵ�
 * @author ��Ԫ
 *
 */
public abstract class Decorator extends Component {
	
	//��װ���߶���ľ��
	protected Component component;
	
	//����component�����ñ�װ����
	public void setComponent(Component component) {
		this.component = component;
	}


	//��дoperation��ʵ��ִ�е���Component��operation
	@Override
	public void operation() {
		if(component!=null){
			component.operation();
		}
	}

}

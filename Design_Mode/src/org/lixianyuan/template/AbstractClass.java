package org.lixianyuan.template;
/**
 * AbstractClass�ǳ����࣬��ʵҲ����һ����ģ�壬���岢ʵ����һ��ģ�巽����
 * ���ģ�巽��һ����һ�����巽������������һ�������߼��ĹǼܣ����߼�����ɲ�������Ӧ�ĳ�������У�
 * 		�Ƴ� ��������ʵ�֡������߼�Ҳ�п��ܵ���һЩ���巽����
 * @author ��Ԫ
 *
 */
public abstract class AbstractClass {
	
	//һЩ������Ϊ���ŵ�������ȥʵ�֡�Ҳ���ǻ�仯����Ϊ
	public abstract void primitiveOperation1();
	public abstract void primitiveOperation2();
	
	
	/**
	 * ģ�巽�����������߼��ĹǼܣ����߼��������һЩ��Ӧ�ĳ�����������Ƕ��Ƴٵ�����ʵ�֡�
	 */
	public void TemplateMethod(){
		primitiveOperation1();
		primitiveOperation2();
		
	}
	
}




package org.lixianyuan.builder;
/**
 * Builder��----���������࣬ȷ����Ʒ����������partA��partB��ɣ�������һ���õ���Ʒ��������ķ���GetResult��
 * @author ��Ԫ
 *
 */
public abstract class Builder {
	public abstract void builderPartA();
	public abstract void builderPartB();
	public abstract Product getResult();
}

package org.lixianyuan.builder;
/**
 * Builder类----抽象建造者类，确定产品由两个部件partA和partB组成，并声明一个得到产品建造后结果的方法GetResult。
 * @author 贤元
 *
 */
public abstract class Builder {
	public abstract void builderPartA();
	public abstract void builderPartB();
	public abstract Product getResult();
}

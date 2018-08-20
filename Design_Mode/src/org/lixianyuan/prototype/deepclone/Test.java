package org.lixianyuan.prototype.deepclone;
/**
 * 如果字段是值类型的，则对该字段执行逐位复制，如果字段是引用类型，则复制引用，不复制引用的对象。因此，原始句柄及其复本引用同一对象。
 * @author 贤元
 *
 */
public class Test {
	public static void main(String[] args) {
		Resume a = new Resume("大鸟");
		a.setPersonalInfo("男", "29");
		a.setWorkExperience("1988-2000", " xx公司");
		
		Resume b = a.clone();//深复制
		b.setWorkExperience("1988-2003", " yy公司");
		
		Resume c =  a.clone();//深复制
		c.setWorkExperience("1988-2006", " zz公司");
		
		a.display();
		b.display();
		c.display();
		
		/**
		 * 打印结果如下：
		 *  大鸟:男:29
			工作经历：1988-2000 xx公司
			大鸟:男:29
			工作经历：1988-2003 yy公司
			大鸟:男:29
			工作经历：1988-2006 zz公司

		 */
	}
}

/******************************************************************
 * Appearance.java
 * Copyright jk 2018
 * CreateDate：2018年8月8日
 * Author：jk
 ******************************************************************/

package cn.jk.appearance;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年8月8日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 外观类
 * </p>
 */
public class Appearance {
	
	private A a = new A();
	
	private B b = new B();
	
	private C c = new C();
	
	public void method1() {
		a.methodA();
		b.methodB();
	}
	
	public void method2() {
		a.methodA();
		c.methodC();
	}
	
	public void method3() {
		b.methodB();
		c.methodC();
	}

}

/******************************************************************
 * Test.java
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
 * 外观模式，封装子类，使用统一对方开放的方法接口
 * </p>
 */
public class Test {
	
	public static void main(String[] args) {
		//外观模式
		Appearance appearance = new Appearance();
		appearance.method1();
		System.out.println();
		appearance.method2();
		System.out.println();
		appearance.method3();
		System.out.println();
	}

}

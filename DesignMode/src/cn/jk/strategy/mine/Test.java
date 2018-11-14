/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年8月7日
 * Author：jk
 ******************************************************************/

package cn.jk.strategy.mine;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年8月7日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public class Test {

	public static void main(String[] args) {
		double a = 5;
		double b = 2;
		System.out.println(Strategy.div.calculate(a, b));
		System.out.println(Strategy2.div.calculate(a, b));
		System.out.println(Strategy2.add.calculate(a, b));
	}
}

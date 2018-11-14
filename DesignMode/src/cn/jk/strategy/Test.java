/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年8月7日
 * Author：jk
 ******************************************************************/

package cn.jk.strategy;

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
 * 策略模式
 * 封装一系列算法，对外提供一个接口，使算法能自由切换，只需调一个接口
 * 大多的设计模式都是封装内部细节，对外提供简便的访问接口
 * </p>
 */
public class Test {

	public static void main(String[] args) {
		System.out.println(new Calculate(new Add()).calculate(5, 6));
		System.out.println(new Calculate(new Sub()).calculate(5, 6));
	}
}

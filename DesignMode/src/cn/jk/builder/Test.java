/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年8月9日
 * Author：jk
 ******************************************************************/

package cn.jk.builder;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年8月9日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 建造者模式
 * 主要思想还是封装内部细节，对外提供访问接口，跟什么命令模式啊，外观模式啊差不多
 * </p>
 */
public class Test {

	public static void main(String[] args) {
		Director director = new Director(new Builder());
		Product productA = director.getProductA();
		System.out.println(productA);
	}
}

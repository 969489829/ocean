/******************************************************************
 * Sub.java
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
 * 
 * </p>
 */
public class Sub implements Target{

	@Override
	public double calculate(double a, double b) {
		return a-b;
	}

}

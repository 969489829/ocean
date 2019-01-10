/******************************************************************
 * Calculate.java
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
public class Calculate implements Target{

	private Target ta;
	
	public Calculate(Target ta) {
		super();
		this.ta = ta;
	}

	@Override
	public double calculate(double a,double b) {
		return ta.calculate(a, b);
	}
}

/******************************************************************
 * Strategy.java
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
 * 枚举，模仿策略模式
 * 但策略模式有个优点，可以在不改变原代码的情况下添加算法，枚举不行
 * </p>
 */
public enum Strategy implements Calculate{
	
	add,
	sub,
	mul,
	div;
	
	private double add(double a,double b) {
		return a+b;
	}
	
	private double sub(double a,double b) {
		return a-b;
	}
	
	private double mul(double a,double b) {
		return a*b;
	}

	private double div(double a,double b) {
		return a/b;
	}

	@Override
	public double calculate(double a, double b) {
		switch (this) {
		case add:
			return add(a,b);
		case sub:
			return sub(a,b);
		case mul:
			return mul(a,b);
		case div:
			return div(a,b);
		default:
			return 0;
		}
	}
}

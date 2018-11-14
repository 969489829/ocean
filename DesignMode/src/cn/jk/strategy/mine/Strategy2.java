/******************************************************************
 * Strategy2.java
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
public enum Strategy2 implements Calculate{

	add{
		@Override
		public double calculate(double a, double b) {
			return a+b;
		}
	},
	sub{
		@Override
		public double calculate(double a, double b) {
			return a-b;
		}
	},
	mul{
		@Override
		public double calculate(double a, double b) {
			return a*b;
		}
	},
	div{
		@Override
		public double calculate(double a, double b) {
			return a/b;
		}
	};
}

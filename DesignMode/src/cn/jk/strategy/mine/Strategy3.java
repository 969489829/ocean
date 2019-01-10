/******************************************************************
 * Strategy3.java
 * Copyright jk 2018
 * CreateDate：2018年11月21日
 * Author：jk
 ******************************************************************/

package cn.jk.strategy.mine;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年11月21日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public enum Strategy3 implements Calculate{

	ADD(1){

		@Override
		public double calculate(double a, double b) {
			return a+b;
		}
	},
	SUB(2){

		@Override
		public double calculate(double a, double b) {
			return a-b;
		}
		
	},
	MUL(3){

		@Override
		public double calculate(double a, double b) {
			return a*b;
		}
		
	},
	DIV(4){

		@Override
		public double calculate(double a, double b) {
			return a/b;
		}
		
	};
	
	private int value;

	private Strategy3(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public static Strategy3 parse(int value) {
		for (Strategy3 e : Strategy3.values()) {
			if(e.getValue() == value)
				return e;
		}
		return null;
	}
	
}

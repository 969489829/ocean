/******************************************************************
 * Director.java
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
 * 指挥
 * </p>
 */
public class Director {

	private Builder builder;
	
	public Product getProductA() {
		builder.buildPartA1();
		builder.buildPartB1();
		builder.buildPartC1();
		return builder.getPro();
	}

	public Product getProductB() {
		builder.buildPartA1();
		builder.buildPartB2();
		builder.buildPartC1();
		return builder.getPro();
	}

	public Product getProductC() {
		builder.buildPartA1();
		builder.buildPartB2();
		builder.buildPartC2();
		return builder.getPro();
	}

	public Product getProductD() {
		builder.buildPartA2();
		builder.buildPartB2();
		builder.buildPartC2();
		return builder.getPro();
	}

	public Director(Builder builder) {
		super();
		this.builder = builder;
	}
	
	
	
}

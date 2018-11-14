/******************************************************************
 * Product.java
 * Copyright jk 2018
 * CreateDate：2018年8月9日
 * Author：jk
 ******************************************************************/

package cn.jk.builder;

import cn.jk.builder.part.PartA;
import cn.jk.builder.part.PartB;
import cn.jk.builder.part.PartC;

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
 * 产品
 * </p>
 */
public class Product {
	
	private PartA a;
	
	private PartB b;
	
	private PartC c;

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 获取
	 * </ul>
	 * @return the a
	 */
	public PartA getA() {
		return a;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * a
	 */
	public void setA(PartA a) {
		this.a = a;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 获取
	 * </ul>
	 * @return the b
	 */
	public PartB getB() {
		return b;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * b
	 */
	public void setB(PartB b) {
		this.b = b;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 获取
	 * </ul>
	 * @return the c
	 */
	public PartC getC() {
		return c;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * c
	 */
	public void setC(PartC c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Product [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
	

}

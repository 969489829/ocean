/******************************************************************
 * Builder.java
 * Copyright jk 2018
 * CreateDate：2018年8月9日
 * Author：jk
 ******************************************************************/

package cn.jk.builder;

import cn.jk.builder.part.impl.A1;
import cn.jk.builder.part.impl.A2;
import cn.jk.builder.part.impl.B1;
import cn.jk.builder.part.impl.B2;
import cn.jk.builder.part.impl.C1;
import cn.jk.builder.part.impl.C2;

/**
 * <b>修改记录：</b>
 * <p>
 * <li>
 * 
 * ---- jk 2018年8月9日</li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p>
 * 建造者
 * </p>
 */
public class Builder {

	private Product pro = new Product();
	
	public void buildPartA1() {
		pro.setA(new A1("A1"));
	}
	
	public void buildPartA2() {
		pro.setA(new A2("A2"));
	}
	
	public void buildPartB1() {
		pro.setB(new B1("B1"));
	}
	
	public void buildPartB2() {
		pro.setB(new B2("B2"));
	}
	
	public void buildPartC1() {
		pro.setC(new C1("C1"));
	}
	
	public void buildPartC2() {
		pro.setC(new C2("C2"));
	}
	
	public Product getPro() {
		return pro;
	}

}

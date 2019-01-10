/******************************************************************
 * Singleton1.java
 * Copyright jk 2018
 * CreateDate：2018年8月7日
 * Author：jk
 ******************************************************************/

package cn.jk.singleton;

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
 * 饿汉，直接加载，没有线程问题，缺点，占用性能
 * </p>
 */
public class Singleton1 {
	
	private static Singleton1 instance = new Singleton1();
	
	private Singleton1() {
		System.out.println("加载");
	}
	
	public static Singleton1 getInstance() {
		return instance;
	}
	public static void main(String[] args) {
		
	}
}

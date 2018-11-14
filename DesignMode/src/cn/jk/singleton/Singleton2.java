/******************************************************************
 * Singleton2.java
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
 * 懒汉，延迟加载，但存在线程问题
 * </p>
 */
public class Singleton2 {
	
	private static Singleton2 instance = null;
	
	private Singleton2() {}
	
	public static Singleton2 getInstance() {
		if(instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}

}

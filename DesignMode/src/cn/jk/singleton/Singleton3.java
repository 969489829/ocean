/******************************************************************
 * Singleton3.java
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
 * 静态方法加锁，安全，延迟加载，但是syn消耗性能较大，静态方法加锁 锁类，非静态方法加锁，锁对象
 * </p>
 */
public class Singleton3 {
	
	private static Singleton3 instance = null;
	
	private Singleton3() {}
	
	public static synchronized Singleton3 getInstance() {
		if(instance == null) {
			instance = new Singleton3();
		}
		return instance;
	}

}

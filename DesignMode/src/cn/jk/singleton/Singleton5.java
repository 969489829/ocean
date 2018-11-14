/******************************************************************
 * Singleton5.java
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
 * 使用了volatile的双重校验锁，能解决指令顺序一致性，安全，一般使用的多把
 * </p>
 */
public class Singleton5 {
	
	private static volatile Singleton5 instance = null;
	
	private Singleton5() {}
	
	public static Singleton5 getInstance() {
		if(instance == null) {
			synchronized (Singleton5.class) {
				if(instance == null) {
					instance = new Singleton5();
				}
			}
		}
		return instance;
	}

}

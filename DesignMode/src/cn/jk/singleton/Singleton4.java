/******************************************************************
 * Singleton4.java
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
 * 双重校验锁
 * </p>
 */
public class Singleton4 {
	
	private static Singleton4 instance = null;
	
	private Singleton4() {}
	/**
	 * 假如现在有两个线程，一个线程执行到了2，拿到了锁，另一个线程执行到了1，被阻塞，当线程1执行完释放锁的时候，
	 * 线程2会拿到锁，并去判断instance是否为空，
	 * 这时候可能会出问题，在创建一个对象的时候可能会出现指令重排序，
	 */
	public static Singleton4 getInstance() {
		if(instance == null) {
			//1
			synchronized (Singleton4.class) {
				//2
				if(instance == null) {
					instance = new Singleton4();
				}
			}
		}
		return instance;
	}

}

/******************************************************************
 * Singleton6.java
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
 * 静态内部类单例，完全安全，性能也好，直接利用了jvm的特性来保持单例，且内部类实现了懒加载，不会浪费性能
 * </p>
 */
public class Singleton6 {
	
	private static class Loader{
		private static final Singleton6 instance = new Singleton6();
	}
	
	private Singleton6() {
		System.out.println("加载静态内部类单例");
	}
	
	public static Singleton6 getInstance() {
		return Loader.instance;
	}
	
	public static void test() {
		System.out.println("测试");
	}

	public static void main(String[] args) {
		
	}
}

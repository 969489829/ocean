/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年12月28日
 * Author：jk
 ******************************************************************/

package 垃圾回收;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * <b>修改记录：</b>
 * <p>
 * <li>
 * 
 * ---- jk 2018年12月28日</li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p>
 * 
 * </p>
 */
public class Test {

	Bean b;

	public static void main(String[] args) throws Throwable {
		Test test = new Test();
		test.b = new Bean();
		Thread.sleep(1000);
		test.b = null;
		AtomicInteger atomicInteger = new AtomicInteger();
		while (true) {
			Thread.sleep(100);
			System.gc();
		}
	}
}

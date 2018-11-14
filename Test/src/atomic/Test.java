/******************************************************************
 * Test.java
 * Copyright 2018 by jk. All Rights Reserved.
 * CreateDate：2018年7月26日
 * Author：jk
 ******************************************************************/

package atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年7月26日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public class Test {

	public static void main(String[] args) {
		/**
		 * atomic系列，实现了和volatile一样的效果，即操作对象的时候视为不稳定的对象，从主存中读取unsafe方法
		 */
		AtomicInteger atomicInteger = new AtomicInteger(2);
		System.out.println(atomicInteger);
	}
}

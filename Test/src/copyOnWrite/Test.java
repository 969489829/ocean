/******************************************************************
 * Test.java
 * Copyright 2018 by jk. All Rights Reserved.
 * CreateDate：2018年7月26日
 * Author：jk
 ******************************************************************/

package copyOnWrite;

import java.util.concurrent.CopyOnWriteArrayList;

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
		 * copyOnWrite系列，实现读写分离，写操作的时候，copy一个数组进行写操作，写操作完了将引用指向新的数组对象，实现读写分离，
		 * 一般用于读多写少，不然复制长度很大的数组很浪费时间和性能
		 */
		CopyOnWriteArrayList<Object> list = new CopyOnWriteArrayList<>();
		System.out.println(list);
	}
}

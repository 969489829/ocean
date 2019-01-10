/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年12月27日
 * Author：jk
 ******************************************************************/

package 线程.semaphore并发;

import java.util.concurrent.Semaphore;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年12月27日
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
		Semaphore semaphore = new Semaphore(3);
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new Task(semaphore));
			thread.setName("线程" + i);
			thread.start();
		}
	}
}

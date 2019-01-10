/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年12月27日
 * Author：jk
 ******************************************************************/

package 线程.cyclicBarrier并发;

import java.util.concurrent.CyclicBarrier;

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
		CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Thread thread = new Thread(new Task(cyclicBarrier));
			thread.setName("线程" + i);
			thread.start();
		}
	}
}

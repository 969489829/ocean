/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年12月27日
 * Author：jk
 ******************************************************************/

package 线程.countDownLatch并发;

import java.util.concurrent.CountDownLatch;

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

	public static void main(String[] args) throws Exception{
		CountDownLatch countDownLatch = new CountDownLatch(1);
		Task task = new Task(countDownLatch);
		
		Thread thread = new Thread(task);
		thread.setName("我的线程");
		thread.start();
		
		new Thread(() -> {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("线程执行够了，快停把");
			thread.interrupt();
			
		}).start();;
		
		System.out.println("主线程阻塞，等待task执行完毕");
		countDownLatch.await();
		
		System.out.println(thread.getName() + "状态： " + thread.isInterrupted());
		
	}
}

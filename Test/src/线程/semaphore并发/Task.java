/******************************************************************
 * Task.java
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
public class Task implements Runnable{
	
	private Semaphore semaphore;
	
	public Task(Semaphore semaphore) {
		super();
		this.semaphore = semaphore;
	}
	@Override
	public void run() {
		try {
			semaphore.acquire();
			System.out.println(Thread.currentThread().getName()  + "获取到资源，准备工作");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()  + "工作完毕，释放资源");
		semaphore.release();
	}

}

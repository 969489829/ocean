/******************************************************************
 * Task.java
 * Copyright jk 2018
 * CreateDate：2018年12月27日
 * Author：jk
 ******************************************************************/

package 线程.countDownLatch并发;

import java.util.concurrent.CountDownLatch;

import org.apache.tools.ant.taskdefs.Sleep;

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
	
	private CountDownLatch count;
	
	public Task(CountDownLatch count) {
		super();
		this.count = count;
	}

	@Override
	public void run() {
		while(true) {
			try {
				work();
			} catch (InterruptedException e) {
				break;
			}
		}
	}
	
	public void work() throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + "正在执行工作");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			count.countDown();
			System.out.println(Thread.currentThread().getName() + "执行中断");
			throw e;
		}
	}

}

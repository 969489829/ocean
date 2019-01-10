/******************************************************************
 * Task.java
 * Copyright jk 2018
 * CreateDate：2018年12月27日
 * Author：jk
 ******************************************************************/

package 线程.cyclicBarrier并发;

import java.util.concurrent.BrokenBarrierException;
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
public class Task implements Runnable{
	
	private CyclicBarrier cyclicBarrier;
	
	public Task(CyclicBarrier cyclicBarrier) {
		super();
		this.cyclicBarrier = cyclicBarrier;
	}

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + "等待执行");
		try {
			cyclicBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "正在执行...");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "执行完毕");
		
	}

	
}

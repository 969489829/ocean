/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年8月8日
 * Author：jk
 ******************************************************************/

package 线程.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年8月8日
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
		test3();
	}
	
	/**
	 * 
	 * <b>方法说明：</b>
	 * <ul>
	 * newFixedThreadPool
	 * 限制了线程池的数量
	 * </ul>
	 */
	public static void test1() {
		ExecutorService pool = Executors.newScheduledThreadPool(4);
		ExecutorService pool1 = Executors.newScheduledThreadPool(4);
		try {
			//等待5秒
			pool.awaitTermination(2, TimeUnit.SECONDS);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println(pool.isTerminated());
		for (int i = 0; i < 10; i++) {
			pool.execute(new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("休眠了1秒:"+Thread.currentThread().getName());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("又休眠了1秒，执行结束");
				}
			});
			
			pool1.execute(new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("休眠了1秒:"+Thread.currentThread().getName());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("又休眠了1秒，执行结束");
				}
			});
			
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pool.shutdown();
		pool1.shutdown();
	}
	
	/**
	 * 
	 * <b>方法说明：</b>
	 * <ul>
	 * newCachedThreadPool，
	 * 不限制线程数量，只要有剩余的任务，就创造线程
	 * </ul>
	 */
	public static void test2() {
		ExecutorService pool = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			pool.execute(new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("休眠了1秒:"+Thread.currentThread().getName());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("又休眠了1秒，执行结束");
				}
			});
			
		}
	}
	
	public static void test3() {
		LinkedBlockingDeque<Runnable> quene = new LinkedBlockingDeque<>();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {
			quene.add(new Runnable() {
				
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName()+"休眠一秒");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"休眠完成，结束");
				}
			});
		}
		ThreadPoolExecutor pool = new ThreadPoolExecutor(4, 5, 100, TimeUnit.SECONDS, quene);
		//FIXME 开始所有任务，多个线程
		pool.prestartAllCoreThreads();
		//FIXME 开始任务，一个线程
//		pool.prestartCoreThread();
		pool.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+"休眠一秒");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"休眠完成，结束");
			}
		});
		System.out.println(pool.getCorePoolSize());
		System.out.println(pool.getPoolSize());
		System.out.println(pool.getMaximumPoolSize());
		System.out.println(pool.getQueue().size());
		pool.shutdown();
	}

}

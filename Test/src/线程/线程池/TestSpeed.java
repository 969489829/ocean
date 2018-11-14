/******************************************************************
 * TestSpeed.java
 * Copyright jk 2018
 * CreateDate：2018年9月17日
 * Author：jk
 ******************************************************************/

package 线程.线程池;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年9月17日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 测试线程池的效率和速度
 * </p>
 */
public class TestSpeed {
	
	private static HashMap<String, Object> map = new HashMap<>();
	private volatile LinkedBlockingDeque<Runnable> quene = new LinkedBlockingDeque<>();
	
	
	{
		for (int i = 0; i < 500; i++) {
			map.put("No."+i, i);
		}
		for (int i = 0; i < 500; i++) {
			quene.add(()->{
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
		}
	}
	
	public static void main(String[] args) {
		TestSpeed testSpeed = new TestSpeed();
		testSpeed.testThread();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		testSpeed.test();
	}
	
	public void testThread() {
		new Thread(()->{
			long s = System.currentTimeMillis();
			for (Entry<String, Object> m : map.entrySet()) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			long s1 = System.currentTimeMillis();
			System.out.println("单线程耗时："+(s1-s));
		}).start();
	}
	
	public void test(){
		
		ThreadPoolExecutor pool = new ThreadPoolExecutor(4, 5, 100, TimeUnit.SECONDS, quene);
		
		long currentTimeMillis = System.currentTimeMillis();
		pool.prestartAllCoreThreads();
		while(quene.size()!=0) {
		}
		long currentTimeMillis2 = System.currentTimeMillis();
		System.out.println("线程池耗时："+(currentTimeMillis2-currentTimeMillis));
		quene.add(()->{
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i);
				pool.shutdown();
			}
		});
		
	}

}

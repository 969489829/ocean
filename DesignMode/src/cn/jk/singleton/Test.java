/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年8月23日
 * Author：jk
 ******************************************************************/

package cn.jk.singleton;

import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 * <b>修改记录：</b>
 * <p>
 * <li>
 * 
 * ---- jk 2018年8月23日</li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p>
 * 
 * </p>
 */
public class Test {

	public static void main(String[] args) throws InterruptedException {
//		test1();
		System.out.println("123456789".substring(0, 8));
	}

	public static HashSet<Object> test1() {
		CountDownLatch count = new CountDownLatch(100);
		HashSet<Object> hashSet = new HashSet<>();
		for (int i = 0; i < 100; i++) {
			new Thread(() -> {
				count.countDown();
				try {
					count.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Singleton4 instance = Singleton4.getInstance();
				hashSet.add(instance);
			}).start();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		hashSet.forEach(s -> {
			System.out.println("set:" + s);
		});
		System.out.println("size:"+hashSet.size());
		return hashSet;
	}

	public static void test2() {
		CyclicBarrier sb = new CyclicBarrier(1000, new Runnable() {

			@Override
			public void run() {
				System.out.println("解锁完毕");
			}
		});
		HashSet<Object> hashSet = new HashSet<>();
		for (int i = 0; i < 1000; i++) {
			new Thread(() -> {
				try {
					sb.await();
				} catch (Exception e) {
					e.printStackTrace();
				}
				Singleton4 instance = Singleton4.getInstance();
				hashSet.add(instance);
				// System.out.println(instance);
			}).start();

		}
		System.out.println(hashSet.size());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		hashSet.forEach(s -> {
			System.out.println("set:" + s);
		});
	}
}

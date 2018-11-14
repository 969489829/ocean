/******************************************************************
 * Test.java
 * Copyright 2018 by jk. All Rights Reserved.
 * CreateDate：2018年8月5日
 * Author：jk
 ******************************************************************/

package 线程.并发测试;

/**
 * <b>修改记录：</b>
 * <p>
 * <li>
 * 
 * ---- jk 2018年8月5日</li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p>
 * 并发问题，
 * javabean的属性可能存在并发
 * 但方法内定义的变量不会存在并发问题
 * </p>
 */
public class Test {
	
	private int num;

	public void count() {
//		int num = 0;
		System.out.println(num);
		num += 1;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(num);
	}

	public static void main(String[] args) {
		Test test = new Test();

		new Thread(new Runnable() {

			@Override
			public void run() {
				test.count();
			}
		}).start();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		new Thread(new Runnable() {

			@Override
			public void run() {
				test.count();
			}
		}).start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		new Thread(new Runnable() {

			@Override
			public void run() {
				test.count();
			}
		}).start();
	}
}

/******************************************************************
 * Test1.java
 * Copyright jk 2018
 * CreateDate：2018年7月30日
 * Author：jk
 ******************************************************************/

package 线程.单线程;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年7月30日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public class Test1 {
	
	class MyThread extends Thread{
		private volatile int ticket = 5;

		@Override
		public void run() {
			while(ticket>0) {
				System.out.println("1111111111卖出第"+ticket--+"张票");
			}
		}
		
	}
	
	class MyThread1 implements Runnable{
		
		private volatile int tk =5;
		
		@Override
		public void run() {
			while(tk>0) {
				System.out.println("22222222222卖出第"+tk--+"张票");
			}
		}
	}
	
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		MyThread myThread = test1.new MyThread();
		
		MyThread1 myThread1 = test1.new MyThread1();
		
		new Thread(myThread).start();
		new Thread(myThread).start();
		new Thread(myThread).start();
		test1.new MyThread().start();
		test1.new MyThread().start();
		test1.new MyThread().start();
		new Thread(myThread1).start();
		new Thread(myThread1).start();
		new Thread(myThread1).start();
	}
}

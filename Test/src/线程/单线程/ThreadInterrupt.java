/******************************************************************
 * ThreadInterrupt.java
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
 * 线程中断
 * </p>
 */
public class ThreadInterrupt {
	
	static class MyThread implements Runnable{
		
		private int count = 0;

		@Override
		public void run() {
			System.out.println("进入线程");
			for(;;) {
				System.out.println(count++);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
					return;
				}
			}
		}
	}

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		thread.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			thread.interrupt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("继续执行");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.notify();
		System.out.println("线程唤醒");
	}
}

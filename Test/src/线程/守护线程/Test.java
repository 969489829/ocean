/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年10月8日
 * Author：jk
 ******************************************************************/

package 线程.守护线程;

import org.apache.tools.ant.types.CommandlineJava.SysProperties;

/**
 * <b>修改记录：</b>
 * <p>
 * <li>
 * 
 * ---- jk 2018年10月8日</li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p>
 * 
 * </p>
 */
public class Test extends Thread{
	
	private int ticket = 10;
	
	@Override
	public void run() {
		while(ticket-- > 0) {
			System.out.println(Thread.currentThread().getName()+"卖出一张票，还剩"+ticket+"张");
		}
	}

	public static void main(String[] args) {
		Test test = new Test();
		new Thread(test).start();
		new Thread(test).start();
		new Thread(test).start();
//		new Test().start();
//		new Test().start();
//		new Test().start();
	}

}

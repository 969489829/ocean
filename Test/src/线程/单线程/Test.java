/******************************************************************
 * Test.java
 * Copyright 2018 by jk. All Rights Reserved.
 * CreateDate：2018年7月17日
 * Author：jk
 ******************************************************************/

package 线程.单线程;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年7月17日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public class Test extends Thread{
	
	private int num = 10;
	

	public void setNum(int num) {
		this.num = num;
	}
	

	@Override
	public void run() {
		System.out.println("进入run");
		while(num>0) {
			System.out.println("卖出第"+(num--)+"张票");
		}
		System.out.println("卖完了");
	}
	
	public static void main(String[] args) throws InterruptedException {
		Test test = new Test();
		test.start();
		Thread.sleep(2000);
//		test.setBoo(false);
		System.out.println("修改false");
//		test.setNum(1);
	}
	
}

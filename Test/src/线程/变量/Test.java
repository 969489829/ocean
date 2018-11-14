/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年9月17日
 * Author：jk
 ******************************************************************/

package 线程.变量;

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
 * 
 * </p>
 */
public class Test {
	
	private static int value;
	
	public static void main(String[] args) throws Exception {
		new Thread(()->{
			while(true) {
				System.out.println(Test.value);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}).start();
		
		Thread.sleep(5000);
		Test.value = 10;
		Thread.sleep(2000);
		Test.value = 5;
	}

}

/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年9月27日
 * Author：jk
 ******************************************************************/

package 常量;

/**
 * <b>修改记录：</b>
 * <p>
 * <li>
 * 
 * ---- jk 2018年9月27日</li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p>
 * 
 * </p>
 */
public class Test {

	private static final String asd = "asd";

	public static void main(String[] args) {
		new Thread(() -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			asd = "qweqwe";
		}).start();
		for (;;) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(asd);
		}

	}

}

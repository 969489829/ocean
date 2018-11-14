/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年8月2日
 * Author：jk
 ******************************************************************/

package quene;

import java.util.concurrent.LinkedBlockingDeque;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年8月2日
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
		LinkedBlockingDeque<Object> quene = new LinkedBlockingDeque<>();
		quene.offer(1);
		quene.offer(2);
		quene.offer(3);
		quene.offer(4);
		System.out.println(quene.poll());
		System.out.println(quene.poll());
		System.out.println(quene.poll());
		System.out.println(quene.poll());
	}

}

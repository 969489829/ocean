/******************************************************************
 * Test.java
 * Copyright 2018 by jk. All Rights Reserved.
 * CreateDate：2018年7月22日
 * Author：jk
 ******************************************************************/

package 测试;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * <b>修改记录：</b>
 * <p>
 * <li>
 * 
 * ---- jk 2018年7月22日</li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p>
 * 
 * </p>
 */
public class Test {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Object object = new Object();
		synchronized (object) {
			try {
				object.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void test() {
		outer: for (int i = 0; i < 10; i++) {
			inner: for (int j = 0; j < 10; j++) {
				if (i == 1 && j == 3) {
					continue outer;
				}

				if (i == 5 && j == 2) {
					System.out.println(i + "-----" + j);
					break inner;
				}
				System.out.println(i + "...." + j);
			}
		}
	}

}

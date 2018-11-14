/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年9月29日
 * Author：jk
 ******************************************************************/

package stringbuilder;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年9月29日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public class Test {
	
	public static void testStringBuilder() {
		StringBuilder sb = new StringBuilder(1000000*160);
		String test  = "abcdefghij";
		for (;test.length()<100;) {
			test += test;
		}
		System.out.println(test.length());
		long currentTimeMillis = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			sb.append(test);
		}
		long currentTimeMillis2 = System.currentTimeMillis();
		System.out.println("耗时："+(currentTimeMillis2 - currentTimeMillis));
	}

}

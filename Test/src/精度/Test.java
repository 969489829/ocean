/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年10月9日
 * Author：jk
 ******************************************************************/

package 精度;

import java.math.BigDecimal;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年10月9日
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
		String str = "0.6555";
		Double d = Double.valueOf(str);
		BigDecimal b = new BigDecimal(d);
		BigDecimal b1 = BigDecimal.valueOf(d);
		BigDecimal b2 = new BigDecimal(str);
		System.out.println(d);
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
	}

}

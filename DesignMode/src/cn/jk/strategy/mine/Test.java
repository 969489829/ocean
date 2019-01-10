/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年8月7日
 * Author：jk
 ******************************************************************/

package cn.jk.strategy.mine;

import java.util.Arrays;
import java.util.List;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年8月7日
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
		double a = 10,b = 5;
		List<Integer> list = Arrays.asList(1,2,3,4);
		list.forEach((li)->{
			System.out.println(Strategy3.parse(li).calculate(a, b));
		});
	}
}

/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年10月26日
 * Author：jk
 ******************************************************************/

package 排序;

import java.util.LinkedList;
import java.util.stream.Stream;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年10月26日
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
		LinkedList<Object> linkedList = new LinkedList<>();
		linkedList.add("1.0.0.0");
		linkedList.add("1.0.0.2");
		linkedList.add("1.0.0.1");
		linkedList.add("1.0.0.5");
		linkedList.add("1.0.0.3");
		Stream<Object> sorted = linkedList.stream().sorted();
		
		linkedList.forEach(System.out::println);
	}

}

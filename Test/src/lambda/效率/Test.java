/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年10月22日
 * Author：jk
 ******************************************************************/

package lambda.效率;

import java.util.Arrays;
import java.util.List;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年10月22日
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
		List<Object> list = Arrays.asList("asd","qwe",5,6,7);
		list.parallelStream().forEach(System.out::println);
	}
}

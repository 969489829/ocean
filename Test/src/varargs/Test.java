/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年7月31日
 * Author：jk
 ******************************************************************/

package varargs;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年7月31日
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
//		test("asd","qqq","|");
		test(new String[]{"asd","zxc","qqq"});
	}
	
	
	public static void test(String...arr) {
		for (String string : arr) {
			System.out.println(string);
		}
	}

}

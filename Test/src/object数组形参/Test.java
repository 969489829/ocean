/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年9月28日
 * Author：jk
 ******************************************************************/

package object数组形参;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年9月28日
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
		test1(new Object[] {"asd","qweqweqwe"});
//		test("asd","qwe");
	}
	public static void test(Object args[]) {
		for (Object object : args) {
			System.out.println(object);
		}
	}
	
	public static void test1(Object...args) {
		for (Object object : args) {
			System.out.println(object);
		}
	}
}

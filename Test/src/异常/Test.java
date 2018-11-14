/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年11月1日
 * Author：jk
 ******************************************************************/

package 异常;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年11月1日
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
		try {
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println(e);
			return;
		}finally {
			System.out.println("最后执行");
		}
	}
}

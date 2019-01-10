/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年12月14日
 * Author：jk
 ******************************************************************/

package 构造器;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年12月14日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public class Test {
	
	private String name;

	{
		System.out.println(name);
		System.out.println("执行构造块方法");
	}
	
	public Test() {
		System.out.println("执行构造器方法");
	}
	public static void main(String[] args) {
		new Test();
	}
}

/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年12月27日
 * Author：jk
 ******************************************************************/

package 反射.深入;

import java.lang.reflect.Field;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年12月27日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public class Test {

	public static void main(String[] args) throws Exception {
		Person person = new Person();
		person.setName("哈哈");
		Field field = person.getClass().getSuperclass().getDeclaredField("number");
		field.setAccessible(true);
		field.set(person, null);
		System.out.println(person);
	}
}

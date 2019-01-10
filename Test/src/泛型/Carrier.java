/******************************************************************
 * Carrier.java
 * Copyright jk 2018
 * CreateDate：2018年12月24日
 * Author：jk
 ******************************************************************/

package 泛型;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年12月24日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public class Carrier<T> {

	public void test() {
		Class<? extends Carrier> clazz = this.getClass();
		Type genericSuperclass = clazz.getGenericSuperclass();
		TypeVariable<?>[] typeParameters = clazz.getTypeParameters();
		Type[] genericInterfaces = clazz.getGenericInterfaces();
		System.out.println();
	}
	
	public static void main(String[] args) {
		Carrier<Person> carrier = new Carrier<Person>();
		carrier.test();
	}
}

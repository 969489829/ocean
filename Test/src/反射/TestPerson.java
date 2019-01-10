/******************************************************************
 * TestPerson.java
 * Copyright jk 2018
 * CreateDate：2018年11月20日
 * Author：jk
 ******************************************************************/

package 反射;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年11月20日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public class TestPerson {

	
	public static void main(String[] args) throws Exception {
		test2();
	}
	
	/**
	 * 
	 * <b>方法说明：</b>
	 * <ul>
	 * 序列化person，再反序列化出对象
	 * </ul>
	 * @throws Exception
	 */
	public static void test1() throws Exception{
		Class<Person> clazz = Person.class;
		Constructor<Person> declaredConstructor = clazz.getDeclaredConstructor(String.class);
		declaredConstructor.setAccessible(true);
		Person newInstance = declaredConstructor.newInstance("asdqwe");
		
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
		objectOutputStream.writeObject(newInstance);
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
		ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
		Object readObject = objectInputStream.readObject();
		System.out.println();
	}
	
	/**
	 * 
	 * <b>方法说明：</b>
	 * <ul>
	 * 反射不能创建enum的对象
	 * </ul>
	 * @throws Exception
	 */
	public static void test2()  throws Exception{
		
		Constructor<?> constructor = Type.AA.getClass().getDeclaredConstructors()[0];
		constructor.setAccessible(true);
		Object newInstance = constructor.newInstance("AA",Type.AA.ordinal(),"qwe");
		Constructor<?>[] declaredConstructors = Person.class.getDeclaredConstructors();
		System.out.println();
	}
}

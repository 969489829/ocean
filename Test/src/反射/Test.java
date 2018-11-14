/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年9月29日
 * Author：jk
 ******************************************************************/

package 反射;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年9月29日
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
		Object[] arr = new Object[] {"asd",123,123.25};
		System.out.println(arr.getClass().getComponentType());
		ArrayList<Object> arrayList = new ArrayList<>();
		System.out.println(arrayList.getClass().getTypeParameters()[0].getClass().getName());
	}

	
	public static void test() {
		Class<char[]>  aa = (Class<char[]>) char.class.getComponentType();
        System.out.println("the componentType of the char is :" + char.class.getComponentType());
        System.out.println("the componentType of the char[] is :" + char[].class.getComponentType());
        System.out.println("the componentType of the String is :" + String.class.getComponentType());
        System.out.println("the componentType of the String[] is :" + String[].class.getComponentType());
        System.out.println("the componentType of the int is :" + int.class.getComponentType());
        System.out.println("the componentType of the int[] is :" + int[].class.getComponentType());
        System.out.println("the componentType of the Integer is :" + Integer.class.getComponentType());
        System.out.println("the componentType of the Integer[] is :" + Integer[].class.getComponentType());
        try {
            char c = (char)Array.newInstance(char.class.getComponentType(), 10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        char[] charArray = (char [])Array.newInstance(char[].class.getComponentType(), 100);
        System.out.println("the length of the charArray is :" + charArray.length);

        try {
            String c = (String)Array.newInstance(String.class.getComponentType(), 10);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String[] strArray = (String [])Array.newInstance(String[].class.getComponentType(), 10);
        System.out.println("the length of the strArray is :" + strArray.length);

	}
}

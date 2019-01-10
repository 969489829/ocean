/******************************************************************
 * DestroyUtil.java
 * Copyright jk 2018
 * CreateDate：2018年12月27日
 * Author：jk
 ******************************************************************/

package 反射.深入;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * <b>修改记录：</b>
 * <p>
 * <li>
 * 
 * ---- jk 2018年12月27日</li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p>
 * 
 * </p>
 */
public class DestroyUtil {

	public static void main(String[] args) throws Exception {
		Person person = new Person();
		person.setName("我的名字");
		person.setNumber(100);
		person.setGender("女的");
		person.setAge(18);
		Father father = new Father();
		father.setNumber(10);
		person.setFather(father);
		person.setTest(11);
		person.setFun(new FunctionImpl());
		person.setThread(new Thread(() -> {
			System.out.println("呵呵");
		}));
		DestroyUtil destroyUtil = new DestroyUtil();
		destroyUtil.batchDestroy(person);
		System.out.println(person);
	}
	
	public void batchDestroy(Object... args) throws Exception {
		for (Object object : args) {
			// 跳过基本类型
			if (judgeBasic(object))
				continue;
			// 基本封装类型直接置空
			if (judgeIfBasicType(object)) {
				object = null;
				continue;
			}
			// 递归销毁对象
			destroyObject(object, object.getClass());
			try {
				Method declaredMethod = object.getClass().getDeclaredMethod("destroy");
				if(declaredMethod != null)
					declaredMethod.invoke(object);
			} catch (Exception e) {
			}
			object = null;
		}
	}

	public void destroyObject(Object obj, Class<?> clazz) throws Exception {
		System.out.println(obj);
		try {
			if (null != clazz.getSuperclass() && !clazz.getSuperclass().equals(Object.class) ) {
				destroyObject(obj, clazz.getSuperclass());
			}
			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				if(null == field)
					continue;
				field.setAccessible(true);
				if (judgeBasicType(field.getType())) {
					continue;
				}
				if (judgeType(field.getType())) {
					try {
						field.set(obj, null);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						e.printStackTrace();
					}
					continue;
				}
				if (field.get(obj) instanceof Thread) {
					Thread t = (Thread) field.get(obj);
					if (!t.isInterrupted())
						t.interrupt();
					field.set(obj, null);
					continue;
				} else {
					destroyObject(field.get(obj), field.getType());
					try {
						Method declaredMethod = field.getType().getDeclaredMethod("destroy");
						if(declaredMethod != null)
							declaredMethod.invoke(field.get(obj));
					} catch (Exception e) {
					}
					field.set(obj, null);
					continue;
				}
			}
		} catch (Exception e) {
			System.out.println(clazz);
			e.printStackTrace();
		}
		
	}

	public boolean judgeIfBasicType(Object object) {
		if (object instanceof String || object instanceof Integer || object instanceof Double
				|| object instanceof Boolean || object instanceof Long || object instanceof Character
				|| object instanceof Short || object instanceof Byte || object instanceof String[]
				|| object instanceof Integer[] || object instanceof Double[] || object instanceof Long[]
				|| object instanceof Boolean[] || object instanceof Byte[]) {
			return true;
		}
		return false;
	}

	public boolean judgeType(Class<?> clazz) {
		if (clazz == String.class || clazz == Integer.class || clazz == Double.class || clazz == Boolean.class
				|| clazz == Long.class || clazz == Character.class || clazz == Short.class || clazz == Byte.class
				|| clazz == String[].class || clazz == Integer[].class || clazz == Double[].class
				|| clazz == Long[].class || clazz == Boolean[].class || clazz == Byte[].class) {
			return true;
		}
		return false;
	}

	public boolean judgeBasicType(Class<?> clazz) {
		if (clazz == int.class || clazz == double.class || clazz == float.class || clazz == boolean.class
				|| clazz == char.class || clazz == short.class || clazz == long.class || clazz == byte.class
				|| clazz == int[].class || clazz == double[].class || clazz == float[].class || clazz == boolean[].class
				|| clazz == char[].class || clazz == short[].class || clazz == long[].class || clazz == byte[].class) {
			return true;
		}
		return false;
	}

	public boolean judgeBasic(Object object) {
		if (object == int.class || object == double.class || object == float.class || object == boolean.class
				|| object == char.class || object == short.class || object == long.class || object == byte.class
				|| object == int[].class || object == double[].class || object == float[].class
				|| object == boolean[].class || object == char[].class || object == short[].class
				|| object == long[].class || object == byte[].class) {
			return true;
		}
		return false;
	}

}

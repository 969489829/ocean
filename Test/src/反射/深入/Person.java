/******************************************************************
 * Person.java
 * Copyright jk 2018
 * CreateDate：2018年12月27日
 * Author：jk
 ******************************************************************/

package 反射.深入;

import java.lang.reflect.AnnotatedType;
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
public class Person extends Father{

	private String name = "namesss";
	
	private String gender;
	
	private Integer age;
	
	private Thread thread;
	
	private Father father;
	
	private int test;
	
	private Function fun;
	
	{
		thread = new Thread(() -> {
			
		});
		thread.start();
	}
	
	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 获取
	 * </ul>
	 * @return the fun
	 */
	public Function getFun() {
		return fun;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * fun
	 */
	public void setFun(Function fun) {
		this.fun = fun;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 获取
	 * </ul>
	 * @return the father
	 */
	public Father getFather() {
		return father;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * father
	 */
	public void setFather(Father father) {
		this.father = father;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 获取
	 * </ul>
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 获取
	 * </ul>
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 获取
	 * </ul>
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * age
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 获取
	 * </ul>
	 * @return the thread
	 */
	public Thread getThread() {
		return thread;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * thread
	 */
	public void setThread(Thread thread) {
		this.thread = thread;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 获取
	 * </ul>
	 * @return the test
	 */
	public int getTest() {
		return test;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * test
	 */
	public void setTest(int test) {
		this.test = test;
	}

	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", thread=" + thread + ", father="
				+ father + ", test=" + test + ", fun=" + fun + "]";
	}

	public void destroy() {
		System.out.println("执行person的销毁方法");
	}
	
	public static void main(String[] args) throws Exception {
		Person person = new Person();
		person.setFun(new FunctionImpl());
		Field declaredField = person.getClass().getDeclaredField("fun");
		Object object = declaredField.get(person);
		Class<? extends Object> class1 = object.getClass();
		Field[] declaredFields = class1.getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.println(field.getName());
		}
		System.out.println();
	}
	
}

/******************************************************************
 * Person.java
 * Copyright 2018 by jk. All Rights Reserved.
 * CreateDate：2018年7月22日
 * Author：jk
 ******************************************************************/

package 测试;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年7月22日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public class Person {
	
	private String name;
	private int age;
	
	/**
	 * <b>构造方法</b>
	 * <br/>
	 * @param name
	 * @param age
	 */
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	

}

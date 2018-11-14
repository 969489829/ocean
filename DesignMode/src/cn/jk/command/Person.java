/******************************************************************
 * Person.java
 * Copyright jk 2018
 * CreateDate：2018年8月9日
 * Author：jk
 ******************************************************************/

package cn.jk.command;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年8月9日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 人
 * </p>
 */
public class Person {
	
	private Command cm;
	
	public Person(Command cm) {
		super();
		this.cm = cm;
	}


	public void sendFile() {
		cm.execute();
	}

}

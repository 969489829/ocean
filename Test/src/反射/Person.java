/******************************************************************
 * Person.java
 * Copyright jk 2018
 * CreateDate：2018年11月20日
 * Author：jk
 ******************************************************************/

package 反射;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

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
public class Person implements Serializable{

	/**  */
	private static final long serialVersionUID = -6915727198337959769L;
	
	private String name;
	
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

	private Person(String name) {
		super();
		this.name = name;
	}
	private Person() {
		super();
	}
	
	/**
     * prevent default deserialization
     */
    private void readObject(ObjectInputStream in) throws IOException,
        ClassNotFoundException {
        throw new InvalidObjectException("can't deserialize singtonClass");
    }

    @SuppressWarnings("unused")
	private void readObjectNoData() throws ObjectStreamException {
        throw new InvalidObjectException("can't deserialize singtonClass-noData");
    }

}

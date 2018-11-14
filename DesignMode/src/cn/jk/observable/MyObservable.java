/******************************************************************
 * MyObservable.java
 * Copyright jk 2018
 * CreateDate：2018年8月7日
 * Author：jk
 ******************************************************************/

package cn.jk.observable;

import java.util.Observable;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年8月7日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public class MyObservable extends Observable{

	private String name = "观察者";
	
	private String note = "没有初始化";
	
	public void changeName(String note) {
		this.note = note;
		//必须设置以改变，不然不会执行通知
		this.setChanged();
		this.notifyObservers(note);
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
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * note
	 */
	public void setNote(String note) {
		this.note = note;
	}
	
	
}

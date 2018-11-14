/******************************************************************
 * MyObserver.java
 * Copyright jk 2018
 * CreateDate：2018年8月7日
 * Author：jk
 ******************************************************************/

package cn.jk.observable;

import java.util.Observable;
import java.util.Observer;

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
public class MyObserver implements Observer{
	
	private String name;
	
	public MyObserver(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		/**
		 * 使用 观察者对象，就是拉
		 * 使用arg即传入的参数，即为推
		 */
		System.out.println(this.name+"收到"+o+"的消息:"+arg);
	}

}

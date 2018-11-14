/******************************************************************
 * MyComputer.java
 * Copyright jk 2018
 * CreateDate：2018年8月7日
 * Author：jk
 ******************************************************************/

package cn.jk.adapter;

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
 * 接口实现
 * </p>
 */
public class MyComputer implements Computer{

	@Override
	public void playGames() {
		System.out.println("用电脑打游戏");
	}

}

/******************************************************************
 * Adapter.java
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
 * 适配器的实现可以有两种方法
 * 1.使用继承
 * 2.依赖对象
 * </p>
 */
public class Adapter extends Book implements Computer{
	
	
//	private Book book = new Book();

	@Override
	public void playGames() {
		System.out.println("改变电脑的用途");
		super.study();
//		book.study();
	}

}

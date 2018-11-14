/******************************************************************
 * Test.java
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
 * 命令模式，封装内部细节，对外提供一个接口，使用者无需关心内部细节
 * 比如 电脑开机，只需要按一下按钮，然后电脑就启动了，实际上电脑做了很多工作
 * 
 * 主要思想就是封装内部细节，提供对外访问接口
 * </p>
 */
public class Test {

	public static void main(String[] args) {
		Work work = new Work();
		CommandImpl commandImpl = new CommandImpl(work);
		Person person = new Person(commandImpl);
		person.sendFile();
	}
}

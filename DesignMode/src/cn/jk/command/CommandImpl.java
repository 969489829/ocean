/******************************************************************
 * CommandImpl.java
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
 * 
 * </p>
 */
public class CommandImpl implements Command{
	
	private Work work;

	public CommandImpl(Work work) {
		super();
		this.work = work;
	}

	@Override
	public void execute() {
		work.connect();
		work.send();
		work.close();
	}

}

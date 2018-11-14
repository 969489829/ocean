/******************************************************************
 * Task.java
 * Copyright jk 2018
 * CreateDate：2018年8月3日
 * Author：jk
 ******************************************************************/

package 线程.future模式;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年8月3日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public class Task extends FutureTask<TaskVO>{

	
	/**
	 * <b>构造方法</b>
	 * <br/>
	 * @param callable
	 */
	public Task(Callable<TaskVO> callable) {
		super(callable);
	}

	
	
}

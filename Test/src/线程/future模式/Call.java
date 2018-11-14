/******************************************************************
 * Call.java
 * Copyright jk 2018
 * CreateDate：2018年8月3日
 * Author：jk
 ******************************************************************/

package 线程.future模式;

import java.util.concurrent.Callable;

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
public class Call implements Callable<TaskVO>{
	
	private TaskVO task;
	
	
	public Call(TaskVO task) {
		super();
		this.task = task;
	}

	@Override
	public TaskVO call() throws Exception {
		task.setAll(task.getEnd()+task.getStart());
		Thread.sleep(3000);
		return task;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 获取
	 * </ul>
	 * @return the task
	 */
	public TaskVO getTask() {
		return task;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * task
	 */
	public void setTask(TaskVO task) {
		this.task = task;
	}
	
	

}

/******************************************************************
 * Task.java
 * Copyright jk 2018
 * CreateDate：2018年8月3日
 * Author：jk
 ******************************************************************/

package 线程.master_worker模式;

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
 * 任务
 * </p>
 */
public class Task {
	
	private String name;
	
	private int start;
	
	private int end;

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
	 * @return the start
	 */
	public int getStart() {
		return start;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * start
	 */
	public void setStart(int start) {
		this.start = start;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 获取
	 * </ul>
	 * @return the end
	 */
	public int getEnd() {
		return end;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * end
	 */
	public void setEnd(int end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "Task [name=" + name + ", start=" + start + ", end=" + end + "]";
	}
	
	
}

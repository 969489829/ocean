/******************************************************************
 * Result.java
 * Copyright jk 2018
 * CreateDate：2018年8月3日
 * Author：jk
 ******************************************************************/

package 线程.master_worker模式;

import java.util.Date;

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
 * 处理结果
 * </p>
 */
public class Result {
	
	private int sum;
	
	private String name;
	
	private Date dealTime;

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 获取
	 * </ul>
	 * @return the sum
	 */
	public int getSum() {
		return sum;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * sum
	 */
	public void setSum(int sum) {
		this.sum = sum;
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
	 * @return the dealTime
	 */
	public Date getDealTime() {
		return dealTime;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * dealTime
	 */
	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}
	
	

}

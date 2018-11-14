/******************************************************************
 * PartB.java
 * Copyright jk 2018
 * CreateDate：2018年8月9日
 * Author：jk
 ******************************************************************/

package cn.jk.builder.part;

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
public abstract class PartB {

	String bName;

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 获取
	 * </ul>
	 * @return the bName
	 */
	public String getbName() {
		return bName;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * bName
	 */
	public void setbName(String bName) {
		this.bName = bName;
	}

	public PartB(String bName) {
		super();
		this.bName = bName;
	}

	@Override
	public String toString() {
		return "PartB [bName=" + bName + "]";
	}
	
	
}

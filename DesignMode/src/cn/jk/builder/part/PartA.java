/******************************************************************
 * PartA.java
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
public abstract class PartA {

	String aName;

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 获取
	 * </ul>
	 * @return the aName
	 */
	public String getaName() {
		return aName;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * aName
	 */
	public void setaName(String aName) {
		this.aName = aName;
	}

	public PartA(String aName) {
		super();
		this.aName = aName;
	}

	@Override
	public String toString() {
		return "PartA [aName=" + aName + "]";
	}
	
	
	
}

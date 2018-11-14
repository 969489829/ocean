/******************************************************************
 * PartC.java
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
public abstract class PartC {

	String cName;

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 获取
	 * </ul>
	 * @return the cName
	 */
	public String getcName() {
		return cName;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * cName
	 */
	public void setcName(String cName) {
		this.cName = cName;
	}

	public PartC(String cName) {
		super();
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "PartC [cName=" + cName + "]";
	}
	
	
}

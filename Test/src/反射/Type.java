/******************************************************************
 * Type.java
 * Copyright jk 2018
 * CreateDate：2018年11月20日
 * Author：jk
 ******************************************************************/

package 反射;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年11月20日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public enum Type {

	LL("qwe"),
	AA("asd");
	
	private String value;

	private Type(String value) {
		this.value = value;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 获取
	 * </ul>
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * value
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
}

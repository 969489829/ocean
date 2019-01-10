/******************************************************************
 * Father.java
 * Copyright jk 2018
 * CreateDate：2018年12月27日
 * Author：jk
 ******************************************************************/

package 反射.深入;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年12月27日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public class Father {
	
	private Integer number;

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 获取
	 * </ul>
	 * @return the number
	 */
	public Integer getNumber() {
		return number;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * number
	 */
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public void destroy() {
		System.out.println("执行father的销毁方法");
	}

	@Override
	public String toString() {
		return "Father [number=" + number + "]";
	}
	
}

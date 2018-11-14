/******************************************************************
 * Product.java
 * Copyright jk 2018
 * CreateDate：2018年8月3日
 * Author：jk
 ******************************************************************/

package 线程.生产消费模式;

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
 * 产品
 * </p>
 */
public class Product {
	
	private String name;
	
	private int id;

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
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public Product(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

}

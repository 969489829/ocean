/******************************************************************
 * SqlFactory.java
 * Copyright jk 2018
 * CreateDate：2018年8月9日
 * Author：jk
 ******************************************************************/

package cn.jk.bridge;

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
public class SqlFactory {
	
	private Driver driver;

	public SqlFactory(Driver driver) {
		super();
		this.driver = driver;
	}
	
	public void inset() {
		driver.connect();
		System.out.println("插入数据");
		System.out.println("关闭连接");
	}
	
	public void query() {
		driver.connect();
		System.out.println("查询数据");
		System.out.println("关闭连接");
	}

}

/******************************************************************
 * Test.java
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
 * 桥接模式，分离抽象化和实现，使两者的接口可以不同，目的是分离
 * </p>
 */
public class Test {
	
	public static void main(String[] args) {
		MysqlDriver mysqlDriver = new MysqlDriver();
		OracleDriver oracleDriver = new OracleDriver();
		SqlFactory sqlFactory = new SqlFactory(mysqlDriver);
		
		sqlFactory.inset();
		sqlFactory.query();
		
		SqlFactory sqlFactory1 = new SqlFactory(oracleDriver);
		System.out.println("--------------------------");
		sqlFactory1.inset();
		sqlFactory1.query();
	}

}

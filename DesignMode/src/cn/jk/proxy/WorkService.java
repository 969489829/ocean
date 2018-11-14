/******************************************************************
 * WorkService.java
 * Copyright jk 2018
 * CreateDate：2018年8月9日
 * Author：jk
 ******************************************************************/

package cn.jk.proxy;

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
public class WorkService implements Work{
	
	@Override
	public void insert(String data) {
		System.out.println("插入一条数据:"+data);
	}
	@Override
	public void delete(String data) {
		System.out.println("删除一条数据:"+data);
	}

}

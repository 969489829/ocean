/******************************************************************
 * Test.java
 * Copyright 2018 by jk. All Rights Reserved.
 * CreateDate：2018年8月5日
 * Author：jk
 ******************************************************************/

package 线程.future模式.mine;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年8月5日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 实现效果，请求->拿到请求，返回封装数据，同时开启线程执行计算数据->返回数据
 * </p>
 */
public class Test {

	public static void main(String[] args) {
		Client client = new Client();
		Data request = client.request("asd");
		System.out.println("执行其他方法");
		System.out.println(request.response());
		System.out.println("得到数据");
	}
}

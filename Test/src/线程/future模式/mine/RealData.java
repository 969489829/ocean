/******************************************************************
 * RealData.java
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
 * 实际数据
 * </p>
 */
public class RealData implements Data{
	
	private String request;
	
	public RealData(String request) {
		System.out.println("得到请求："+request);
		this.request = request;
	}

	@Override
	public Object response() {
		System.out.println("返回真正的数据"+request+"->真的数据");
		return request+"si 真正的数据";
	}

}

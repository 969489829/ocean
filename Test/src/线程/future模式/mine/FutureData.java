/******************************************************************
 * FutureData.java
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
 * 包装数据
 * </p>
 */
public class FutureData implements Data{
	
	private Data realData;
	
	private boolean ifSet = false;

	@Override
	public synchronized Object response() {
		if(ifSet) {
			return realData.response();
		}else {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return realData.response();
	}

	public Data getRealData() {
		return realData;
	}

	public synchronized void setRealData(Data realData) {
		if(ifSet) {
			return;
		}
		this.realData = realData;
		this.notify();
	}
	
	
}

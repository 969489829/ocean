/******************************************************************
 * Client.java
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
 * 客户端
 * </p>
 */
public class Client {
	

	/**
	 * 
	 * <b>方法说明：</b>
	 * <ul>
	 * future模式，通过Client的request 我的目的是得到一个返回的data，这个data是个接口，有两个实现类，futureData和realData
	 * 刚调用request方法直接返回一个futureData的实例。调用此方法的人最终目的是要调用data接口的response方法，所以futureData的实现方法
	 * 是依赖于realData的，所以同时开一个线程，去具体化futureData的realData依赖。
	 * 在用户的视角就是调用Client的request方法，直接得到了他想要的data接口的实现类，但此时只是一个空壳的futureData，如果此时调用data接口
	 * 的response方法会被阻塞，直到线程将futureData的realData依赖具体化
	 * </ul>
	 * @param request
	 * @return
	 */
	public Data request(String request) {
		FutureData futureData = new FutureData();
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				RealData realData = new RealData(request);
				futureData.setRealData(realData);
			}
		}).start();
		return futureData;
	}

}

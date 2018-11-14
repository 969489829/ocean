/******************************************************************
 * Mediation.java
 * Copyright jk 2018
 * CreateDate：2018年8月3日
 * Author：jk
 ******************************************************************/

package 线程.生产消费模式;

import java.util.concurrent.LinkedBlockingDeque;

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
 * 中介
 * </p>
 */
public class Mediation {

	/**
	 * 产品
	 */
	private volatile LinkedBlockingDeque<Product> products = new LinkedBlockingDeque<>();
	
	private Object lock = new Object();
	
	/**
	 * 
	 * <b>方法说明：</b>
	 * <ul>
	 * 从生产者获取产品
	 * </ul>
	 */
	public void getProduct(Product product) {
			products.add(product);
			if(products.size() == 1) {
				synchronized (lock) {
					lock.notify();
				}
			}
	}
	
	/**
	 * 
	 * <b>方法说明：</b>
	 * <ul>
	 * 卖出产品
	 * </ul>
	 * @return
	 */
	public Product sellProduct() {
		synchronized (lock) {
			Product poll = products.poll();
			while(poll == null) {
				try {
					lock.wait();
					poll = products.poll();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			lock.notify();
			return poll;
		}
		
	}
}

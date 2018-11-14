/******************************************************************
 * Test.java
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
 * 
 * </p>
 */
public class Test {
	
	public static void main(String[] args) {
		/**
		 * 准备实现功能：
		 * 生产者生产产品，交给中介，
		 * 消费者从中介处拿产品
		 */
		
		//中介
		Mediation mediation = new Mediation();
		//生产者
		Producer producer = new Producer();
		producer.setMediation(mediation);
		//消费者
		Consumer consumer = new Consumer();
		consumer.setMediation(mediation);
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					try {
						Thread.sleep(1100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					producer.createProduct();
					System.out.println("生产出了"+i+"个产品");
				}
			}
		}).start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					consumer.buyProduct();
					System.out.println("消费者买了"+i+"个产品");
				}
			}
		}).start();
	}

}

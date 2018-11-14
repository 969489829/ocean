/******************************************************************
 * SimulateQuene.java
 * Copyright 2018 by jk. All Rights Reserved.
 * CreateDate：2018年7月22日
 * Author：jk
 ******************************************************************/

package 线程.模拟队列;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <b>修改记录：</b>
 * <p>
 * <li>
 * 
 * ---- jk 2018年7月22日</li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p>
 * 模拟队列
 * </p>
 */
public class SimulateQuene {

	private LinkedList<Object> queneList= new LinkedList<>();

	private AtomicInteger count = new AtomicInteger(0);

	private Object lock = new Object();
	
	private AtomicInteger maxSize ;
	private AtomicInteger minSize = new AtomicInteger(0); 
	// @formatter:on
;
	
	
	
	/**
	 * <b>构造方法</b>
	 * <br/>
	 */
	
	public SimulateQuene(int size) {
		maxSize=new AtomicInteger(size);
	}

	public void put(Object obj) throws InterruptedException {
		
		synchronized (lock) {
			while(this.getCount() == this.getMaxSize()) {
				System.out.println("等待加入数据");
				lock.wait();
			}
			queneList.add(obj);
			count.incrementAndGet();
			lock.notify();
			System.out.println("quene添加元素:" + obj);
		}
	}

	public Object take() throws InterruptedException {
		Object obj = null;
		synchronized (lock) {
			while(this.getCount() == this.getMinSize()) {
				System.out.println("等待取出数据");
				lock.wait();
			}
			obj = queneList.removeFirst();
			count.decrementAndGet();
			lock.notify();
		}
		return obj;
	}
	
	

	public int getCount() {
		return count.get();
	}

	public int getMaxSize() {
		return maxSize.get();
	}

	public int getMinSize() {
		return minSize.get();
	}

	public static void main(String[] args) throws InterruptedException {
		SimulateQuene simulateQuene = new SimulateQuene(5);
		simulateQuene.put("qqq");
		simulateQuene.put("qqq1");
		simulateQuene.put("qqq2");
		simulateQuene.put("qqq3");
		simulateQuene.put("qqq4");
		System.out.println();
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					simulateQuene.put("asd");
					simulateQuene.put("asd2");
					simulateQuene.put("asd1");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		Thread.sleep(3000);
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					System.out.println("取出："+simulateQuene.take());
					System.out.println("取出："+simulateQuene.take());
					System.out.println("取出："+simulateQuene.take());
					System.out.println("取出："+simulateQuene.take());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
	
	}
}

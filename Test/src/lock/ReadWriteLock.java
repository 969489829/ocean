/******************************************************************
 * ReadWriteLock.java
 * Copyright jk 2018
 * CreateDate：2018年8月16日
 * Author：jk
 ******************************************************************/

package lock;

/**
 * <b>修改记录：</b>
 * <p>
 * <li>
 * 
 * ---- jk 2018年8月16日</li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p>
 * 读写锁，一般场景中，读读不互斥，读写互斥，写写互斥，读一般远大于写，为了提高效率，可以将锁分的更细致
 * </p>
 */
public class ReadWriteLock {
	/**
	 * 读锁持有个数
	 */
	private int readCount = 0;
	/**
	 * 写锁持有个数
	 */
	private int writeCount = 0;

	/**
	 * 获取读锁,读锁在写锁不存在的时候才能获取
	 */
	public synchronized void lockRead() throws InterruptedException {
		// 写锁存在,需要wait
		while (writeCount > 0) {
			wait();
		}
		readCount++;
	}

	/**
	 * 释放读锁
	 */
	public synchronized void unlockRead() {
		readCount--;
		notifyAll();
	}

	/**
	 * 获取写锁,当读锁存在时需要wait.
	 */
	public synchronized void lockWrite() throws InterruptedException {
		// 先判断是否有写请求
		while (writeCount > 0) {
			wait();
		}

		// 此时已经不存在获取写锁的线程了,因此占坑,防止写锁饥饿
		writeCount++;

		// 读锁为0时获取写锁
		while (readCount > 0) {
			wait();
		}
	}

	/**
	 * 释放读锁
	 */
	public synchronized void unlockWrite() {
		writeCount--;
		notifyAll();
	}

}

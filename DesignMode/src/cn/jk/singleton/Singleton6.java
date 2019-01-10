/******************************************************************
 * Singleton6.java
 * Copyright jk 2018
 * CreateDate：2018年8月7日
 * Author：jk
 ******************************************************************/

package cn.jk.singleton;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年8月7日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 静态内部类单例，完全安全，性能也好，直接利用了jvm的特性来保持单例，且内部类实现了懒加载，不会浪费性能
 * </p>
 */
public class Singleton6 {
	
	private static AtomicInteger flag = new AtomicInteger(0);
	
	private static class Loader{
		private static final Singleton6 instance = new Singleton6();
	}
	
	private Singleton6() {
		if(flag.incrementAndGet()>1)
			throw new RuntimeException("单例模式被攻击");
	}
	
	public static Singleton6 getInstance() {
		return Loader.instance;
	}
	
	public static void main(String[] args) throws Exception {
		Singleton6 instance = Singleton6.getInstance();
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
		objectOutputStream.writeObject(instance);
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
		ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
		Object readObject = objectInputStream.readObject();
		System.out.println(instance == readObject);
	}
}

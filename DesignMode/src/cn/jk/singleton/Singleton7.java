/******************************************************************
 * Singleton7.java
 * Copyright jk 2018
 * CreateDate：2018年8月7日
 * Author：jk
 ******************************************************************/

package cn.jk.singleton;

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
 * 枚举单例，据说是最完美的单例，很自然的解决了单例，也解决了序列化的问题
 * 
 * 
 * 单例模式都有种隐患，能被反射破解，待研究
 * 
 * 枚举单例模式虽然解决了多线程和序列化问题，但这实际上是懒汉模式升级版
 * </p>
 */
public enum Singleton7 {
	
	INSTANCE;
	
	private Singleton7() {
		System.out.println("初始化枚举单例");
	}

	private String name;
	
	private int age;
	
	public void doWork() {
		System.out.println("执行方法");
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 获取
	 * </ul>
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 获取
	 * </ul>
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public static void test() {
		System.out.println("测试");
	}
	
	public static void main(String[] args) {
		
	}
	
}

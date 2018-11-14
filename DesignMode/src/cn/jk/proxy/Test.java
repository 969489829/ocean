/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年8月9日
 * Author：jk
 ******************************************************************/

package cn.jk.proxy;

import java.util.HashMap;

import cn.jk.proxy.cglib.ProxyFactory;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年8月9日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * jdk代理注意：强转不能转化实现类，只能转化为接口，毕竟jdk原理是利用接口生成了新的实现类，写代理方法也只能ProxyFactory里这么写，不能用proxy去执行方法，不然会死循环
 * cglib代理，通过字节码技术，动态生成类
 * </p>
 */
public class Test {
	
	public static void main(String[] args) throws Exception {
		/**
		 * cglib代理
		 */
		ProxyFactory proxyFactory = new ProxyFactory();
		WorkService workService = proxyFactory.getWorkService();
		workService.delete("asdasd");
//		HashMap<Object, Object> hashMap = new HashMap<>();
		/**
		 * jdk代理
		 */
		/*cn.jk.proxy.jdk.ProxyFactory proxyFactory2 = new cn.jk.proxy.jdk.ProxyFactory(new WorkService());
		Work proxyBean = proxyFactory2.getProxyBean();
		proxyBean.insert("哈哈");*/
	}

}

/******************************************************************
 * ProxyFactory.java
 * Copyright jk 2018
 * CreateDate：2018年8月9日
 * Author：jk
 ******************************************************************/

package cn.jk.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import cn.jk.proxy.Work;
import cn.jk.proxy.WorkService;

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
 * 
 * </p>
 */
public class ProxyFactory implements InvocationHandler{
	
	private Object target;
	
	public ProxyFactory(Object target) {
		super();
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("当前对象："+proxy.getClass().getName());
		System.out.println("当前方法："+method.getName());
		return method.invoke(target, args);
	}
	
	public Work getProxyBean() throws Exception {
		Object newProxyInstance = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),target.getClass().getInterfaces(),this);
		System.out.println(Thread.currentThread().getContextClassLoader());
		System.out.println(Work.class.getClassLoader());
		System.out.println(target.getClass().getInterfaces());
		System.out.println(WorkService.class.getInterfaces());
		return Work.class.cast(newProxyInstance);
	}

}

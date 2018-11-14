/******************************************************************
 * ProxyFactory.java
 * Copyright jk 2018
 * CreateDate：2018年8月9日
 * Author：jk
 ******************************************************************/

package cn.jk.proxy.cglib;

import java.lang.reflect.Method;

import cn.jk.proxy.WorkService;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

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
public class ProxyFactory implements MethodInterceptor{
	
	private Enhancer en = new Enhancer();
	
	public WorkService getWorkService() {
		en.setInterfaces(WorkService.class.getInterfaces());
		en.setSuperclass(WorkService.class);
		en.setCallback(this);
		return WorkService.class.cast(en.create()) ;
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("进入代理模式....");
		System.out.println("当前的代理类:"+obj.getClass().getName());
		System.out.println("当前执行的方法:"+method.getName());
//		System.out.println("方法参数："+args[0]);
		System.out.println("代理方法:"+proxy.getSuperName()); 
		return proxy.invokeSuper(obj, args);
//		return method.invoke(obj, args);
	}

}

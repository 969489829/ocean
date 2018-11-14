package testProxy.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import testProxy.inter.Service;
import net.sf.cglib.proxy.Enhancer;

public class ProxyFactory implements MethodInterceptor{

	private Enhancer en = new Enhancer();
	
	public Service getProxyBean() {
		en.setInterfaces(Service.class.getInterfaces());
		en.setCallback(this);
		return Service.class.cast(en.create());
	}
	
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxyMethod) throws Throwable {
		System.out.println("开始执行方法"+method);
		for (Object object : args) {
			System.out.println("参数："+object);
		}
		method.invoke(obj, args);
		System.out.println(method+"执行完毕");
		System.out.println();
		return null;
	}

}

package 测试反射获取属性.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import 测试反射获取属性.inter.Service;
import net.sf.cglib.proxy.Enhancer;

public class ProxyFactory implements MethodInterceptor{

	private Enhancer Enhancer = new Enhancer();
	
	public Service getProxyBean() {
		System.out.println(Service.class.getInterfaces()[0]);
		System.out.println(Service.class.getInterfaces()[1]);
		System.out.println(Service.class.getInterfaces()[2]);
		Enhancer.setInterfaces(Service.class.getInterfaces());
		Enhancer.setCallback(this);
		return Service.class.cast(Enhancer.create());
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

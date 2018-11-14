package testProxy;

import testProxy.inter.Service;
import testProxy.proxy.ProxyFactory;

public class Test {
	public static void main(String[] args) throws Exception {
		test1();
	}
	
	public static void test() throws Exception {
	}
	
	public static void test1() {
		Service proxyBean = new ProxyFactory().getProxyBean();
		proxyBean.test("测试下");
	}
	
}

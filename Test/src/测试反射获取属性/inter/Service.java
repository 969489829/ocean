package 测试反射获取属性.inter;

public class Service implements Iservice{

	@Override
	public void test(String str) {
		System.out.println("呵呵"+str);
		test1();
	}

	@Override
	public void test1() {
		System.out.println("啧啧");
	}

}

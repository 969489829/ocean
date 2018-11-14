package 测试方法内变量作用域;

public class Test {
	public static void main(String[] args) {
		test();
	}
	public static void test() {
		Person person = new Person();
		person.setAge(10);
		person.setName("1");
		System.out.println(person);
		init(person);
		System.out.println(person);
		init2(person);
		System.out.println(person);
	}
	
	public static void init(Person per) {
		per = new Person();
		per.setAge(1);
		per.setName("asd");
	}
	
	public static void init2(Person per) {
		per.setAge(per.getAge()+100);
	}
}

package 测试内存分配;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		
		List<Object> asList = Arrays.asList(1,2,3,"40");
		List<Object> asList1 = asList;
		asList1.set(3, "4");
		asList.forEach(System.out::println);
	}
}

/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年7月30日
 * Author：jk
 ******************************************************************/

package lambda;

import java.util.function.*;


/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年7月30日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public class Test {
	
	private long asd;
	
	public static void main(String[] args) {
//		Ocean<String> o = (s) -> System.out.print(s);
//		o.test("123");
//		Consumer<String> s = (v) -> System.out.print(v); 
		
		Predicate<String> a = (s) -> {
			return s!=null;
		};
		System.out.println(a.test(null));
		
		Function<Integer,String> fun = (i) -> {
			return "当前的数字是"+i;
		};
		System.out.println(fun.apply(1000));
		
		
		Supplier<Test> q = Test::new;
		Test test = q.get();
		System.out.println(test.asd);
	}
}

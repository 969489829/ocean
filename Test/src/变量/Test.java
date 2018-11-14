/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年9月20日
 * Author：jk
 ******************************************************************/

package 变量;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年9月20日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public class Test {
	
	public static void main(String[] args) {
		HashMap<Object, Object> hashMap = new HashMap<>();
		hashMap.put("asd", 1);
		hashMap.put("asd", 1);
		hashMap.put("asd", 1);
		hashMap.put("asd", 1);
		hashMap.put("asd", 1);
		hashMap.put("asd", 1);
		hashMap.put("asd", 1);
		
		Function function = new Function() {
			
			@Override
			public void test(Object... args) {
				AtomicInteger a = (AtomicInteger) args[0];
				System.out.println(a.incrementAndGet());
				if(a.intValue()<10) {
					this.test(a);
				}
			}
		};
		
		hashMap.forEach(new BiConsumer<Object, Object>() {

			@Override
			public void accept(Object t, Object u) {
				AtomicInteger atomicInteger = new AtomicInteger(0);
				function.test(atomicInteger);
			}
		});
		
	}

}

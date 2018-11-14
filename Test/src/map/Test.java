/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年7月31日
 * Author：jk
 ******************************************************************/

package map;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.function.BiConsumer;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年7月31日
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
		
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("HHmmss");
		String format = simpleDateFormat1.format(date);
		System.out.println(format);
	}
	
	public static void test() {
		HashMap<Object, Object> hashMap = new HashMap<>();
		long currentTimeMillis = System.currentTimeMillis();
		hashMap.remove(0);
		long currentTimeMillis1 = System.currentTimeMillis();
		System.out.println(currentTimeMillis1-currentTimeMillis);
	}
	
	public static void test1() {
		HashMap<String, String> hashMap = new HashMap<String,String>();
		hashMap.put("asd", "asd");
		hashMap.put("asd1", "asd1");
		hashMap.put("asd2", "asd2");
		hashMap.put("asd3", "asd3");
		hashMap.put("asd4", "asd4");
		hashMap.forEach(new BiConsumer<String, String>() {
			@Override
			public void accept(String k, String v) {
				hashMap.put(v, k);
			}
		});
	}

}

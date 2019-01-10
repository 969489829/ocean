/******************************************************************
 * LRUTest.java
 * Copyright jk 2018
 * CreateDate：2018年11月14日
 * Author：jk
 ******************************************************************/

package 队列;

import java.util.LinkedHashMap;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年11月14日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public class LRUTest {

	public static void main(String[] args) {
		LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
		for (int i = 0; i < 10; i++) {
			linkedHashMap.put(i, "name" + i);
		}
		linkedHashMap.get(5);
		linkedHashMap.forEach((k,v) -> {
			System.out.println("key:"+k+"，value:"+v);
		});
	}
}

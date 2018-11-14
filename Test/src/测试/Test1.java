/******************************************************************
 * Test1.java
 * Copyright jk 2018
 * CreateDate：2018年9月20日
 * Author：jk
 ******************************************************************/

package 测试;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.TreeMap;

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
public class Test1 {
	
	public static void main(String[] args) throws Exception {
		String asd = "00000000000";
		
		Long valueOf = Long.valueOf(asd);
		System.out.println(valueOf == 0);
	}

}

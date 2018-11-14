/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年9月26日
 * Author：jk
 ******************************************************************/

package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年9月26日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public class Test {
	
	public static void main(String[] args) throws IOException {
		File file = new File("e:/new");
		recursiveDeleteFile(file);
	}
	public static void recursiveDeleteFile(File file) {
		if(file.isDirectory()) {
			File[] listFiles = file.listFiles();
			if(listFiles != null && listFiles.length>0) {
				for (File file2 : listFiles) {
					recursiveDeleteFile(file2);
				}
			}
			file.delete();
		}else {
			file.delete();
		}
	}

}

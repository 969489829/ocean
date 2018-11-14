/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年9月27日
 * Author：jk
 ******************************************************************/

package poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年9月27日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public class Test {

	public static void main(String[] args) throws Exception {
		FileInputStream fileInputStream = new FileInputStream(new File("e:/asd.xls"));
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fileInputStream);
		HSSFSheet sheetAt = hssfWorkbook.getSheetAt(0);
		int asd = 0;
		for (int i = 1; i < sheetAt.getLastRowNum(); i++) {
			HSSFRow row = sheetAt.getRow(i);
			if(row == null)
				continue;
			HSSFCell code = row.getCell(6);
			HSSFCell msg = row.getCell(8);
			if(code!=null && msg!=null) {
				if(code.getStringCellValue() == null || code.getStringCellValue() == "")
					continue;
				asd++;
				System.out.println("<prop key=\""+code.getStringCellValue()+"\">"+msg.getStringCellValue()+"</prop>");
			}
		}
		//<prop key="-171401010001">回调发起方确认划入资产失败</prop>
	}
}

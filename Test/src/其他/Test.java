/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年9月25日
 * Author：jk
 ******************************************************************/

package 其他;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年9月25日
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
		long asd = 1l;
		byte[] signature = "aa".getBytes();
		String sigsize = signature.length+"";
		for(;sigsize.length()<10;) {
			sigsize = "0"+sigsize;
		}
		byte[] miwen = "asdzxcqwedasczxcasdasxzxcqwedasdzxcasd".getBytes();
		System.out.println(miwen.length);
		byte[] arr = new byte[sigsize.length()+signature.length+miwen.length];
		System.out.println(arr.length);
		System.arraycopy(sigsize.getBytes(), 0, arr, 0, 10);
		System.arraycopy(signature, 0, arr, 10, signature.length);
		System.arraycopy(miwen, 0, arr, signature.length+10, miwen.length);
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
		}
//		System.out.println("长度");
//		System.out.println(signature.length);
//		System.out.println(sigsize.getBytes().length);
//		System.out.println(miwen.length);
//		System.out.println(arr.length);
		byte[] miw = new byte[miwen.length];
		System.arraycopy(arr, 0, miw, 0, 10);
		
		System.out.println(new String(arr));
	}

}

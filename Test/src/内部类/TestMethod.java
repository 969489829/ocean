/******************************************************************
 * TestMethod.java
 * Copyright jk 2018
 * CreateDate：2018年10月11日
 * Author：jk
 ******************************************************************/

package 内部类;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年10月11日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 方法内部类，局部内部类
 * </p>
 */
public class TestMethod {

	public static String testMethodClass(String name) {
		
		class Mine{
			private String name;
			public Mine(String name) {
				super();
				this.name = name;
			}
			/**
			 * <b>方法说明：</b>
			 * <ul>
			 * 获取
			 * </ul>
			 * @return the name
			 */
			public String getName() {
				return name;
			}
			public String convert(String str) {
				return "my"+str;
			}
		}
		
		Mine mine = new Mine(name);
		return mine.convert(mine.getName());
	}
	
	public static void main(String[] args) {
		String testMethodClass = testMethodClass("test");
		System.out.println(testMethodClass);
	}
	
}

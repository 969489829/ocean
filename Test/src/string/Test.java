/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年8月6日
 * Author：jk
 ******************************************************************/

package string;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年8月6日
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
		
//		testEquals2();
		testIntern();
	}
	
	  /**
     * .
     * ==判断引用是否相等.
     */
    public static void testEquals2() {
        String a = "a";
        final String c = "a";

        String b = a + "b";
        String d = c + "b";
        String e = getA() + "b";

        String compare = "ab";

        System.out.println(b == compare);
        System.out.println(d == compare);//编译优化，final能确定，所以指向同一个
        System.out.println(e == compare);
    }
	 /**
     * 测试用.
     * @return “a”
     */
    private static String getA() {
        return "a";
    }
    
    /**
     * 
     * <b>方法说明：</b>
     * <ul>
     * 当调用intern方法时，JVM会在常量池中通过equals()方法来匹配是否存在等值的String, 
     * 如果存在，则直接返回其地址。否则再新建. 所以，只要值相等，
     * 用.intern()==.intern()判断一定相等. 但是intern效率不高.
     * </ul>
     */
    private static void testIntern() {
        String a = "a";
        String b = a + "b";
        String c = "ab";
        String d = new String(b);

        System.out.println(b == c);
        System.out.println(c == d);
        System.out.println(c == d.intern());
        System.out.println(b.intern() == d.intern());
    }
}

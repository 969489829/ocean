/******************************************************************
 * Function.java
 * Copyright jk 2018
 * CreateDate：2018年12月27日
 * Author：jk
 ******************************************************************/

package 反射.深入;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年12月27日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public interface Function {

	void test();
}

class FunctionImpl implements Function{
	
	private String asd = "asd";

	@Override
	public void test() {
		System.out.println("shixian fangfa");
	}
	
	public void destroy() {
		System.out.println("接口实现类执行销毁");
	}
	
}

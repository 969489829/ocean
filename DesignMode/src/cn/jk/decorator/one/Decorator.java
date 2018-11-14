/******************************************************************
 * Decorator.java
 * Copyright jk 2018
 * CreateDate：2018年8月7日
 * Author：jk
 ******************************************************************/

package cn.jk.decorator.one;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年8月7日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public class Decorator implements Target{
	
	private Target t = new TargetImpl();

	@Override
	public void show() {
		System.out.println("先预预热");
		t.show();
		System.out.println("ok，结束了");
	}

}

/******************************************************************
 * Decorator.java
 * Copyright jk 2018
 * CreateDate：2018年8月7日
 * Author：jk
 ******************************************************************/

package cn.jk.decorator.two;

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
	
	private Target t;
	
	public Decorator(Target t) {
		super();
		this.t = t;
	}

	@Override
	public void show() {
		System.out.println("做正事之前干点别的");
		t.show();
		System.out.println("做完收工");
	}

}

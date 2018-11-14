/******************************************************************
 * Test.java
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
 * 装饰者模式
 * 目标类-> 实现目标类的接口->重写目标类的方法，依赖目标类
 * 在目标类的方法里加点料，执行前加点什么东西，执行后加点什么东西，如果方法是传入参数的，或者回调的，还可以改变点逻辑...
 * </p>
 */
public class Test {
	public static void main(String[] args) {
		Decorator decorator = new Decorator();
		decorator.show();
	}

}

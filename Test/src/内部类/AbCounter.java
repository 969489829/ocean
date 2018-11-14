/******************************************************************
 * AbCounter.java
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
 * 抽象类 与 接口同时实现同一个方法
 * 要么只能使用接口的方法，要么在接口的方法里调抽象类的方法
 * </p>
 */
public abstract class AbCounter {
	
	public int count = 0;

	public void count() {
		count ++ ;
		System.out.println("抽象类计数");
	}
	
	public static void main(String[] args) {
		CounterImpl counterImpl = new CounterImpl();
		counterImpl.count();
		System.out.println(counterImpl.count);
	}
}

class CounterImpl extends AbCounter implements Counter{
	
	@Override
	public void count() {
		super.count();
		System.out.println("接口计数");
	}
	
}
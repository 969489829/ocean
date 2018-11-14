/******************************************************************
 * AbCounter1.java
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
 * 内部类实现“多继承”，灵活方便</br>
 * 使用成员内部类，而非在方法里使用匿名内部类的原因是，
 * 我需要调用有参数的构造器，此外，该内部类可能会用到多次
 * </br>
 * 第一种写法将内部类定义在类中
 * 第二种方法将内部类定义在方法中</br>
 * 定义在方法中最常用
 * </p>
 */
public class Counter1 extends AbCounter{
	
	//写法1

	private class Inner implements Counter{
		
		public Inner(int count) {
			Counter1.this.count = count;
		}

		@Override
		public void count() {
			Counter1.this.count();
			System.out.println("接口的计数");
			count +=10;
			System.out.println(count);
		}
		
	}
	
	public Counter getInnerClass1(int count) {
		return new Inner(count);
	}
	
	
	//写法2
	
	public Counter getInnerClass2(int count) {
		@SuppressWarnings("hiding")
		class Inner implements Counter{
			
			public Inner(int count) {
				Counter1.this.count = count;
			}

			@Override
			public void count() {
				Counter1.this.count();
				System.out.println("接口的计数");
				Counter1.this.count +=10;
				System.out.println(Counter1.this.count);
			}
			
		}
		return new Inner(count);
	}
	
	
	public static void main(String[] args) {
		Counter1 counter1 = new Counter1();
//		counter1.count();
		counter1.getInnerClass2(5).count();
	}
	
}

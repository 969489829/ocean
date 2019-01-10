/******************************************************************
 * Bean.java
 * Copyright jk 2018
 * CreateDate：2018年12月28日
 * Author：jk
 ******************************************************************/

package 垃圾回收;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年12月28日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public class Bean {

	private String name;
	
	private Thread t;
	
	{
		name = "艾斯";
		t = new Thread(() -> {
			while(true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("线程中断咯");
					break;
				}
				System.out.println("执行工作也");
			}
		});
		t.start();
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		name = null;
		t.interrupt();
		t = null;
		System.out.println("清理" + this.getClass().getName());
	}
	
	
	
	
}

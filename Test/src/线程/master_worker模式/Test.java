/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年8月3日
 * Author：jk
 ******************************************************************/

package 线程.master_worker模式;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年8月3日
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
		Master master = new Master(new Worker(), 5);
		
		Task t;
		for (int i = 0; i <100; i++) {
			t = new Task();
			t.setEnd(i+10);
			t.setStart(i);
			t.setName("task"+i);
			master.addTask(t);
		}
		master.execute();
	}

}

/******************************************************************
 * Worker.java
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
 * ---- jk 2018年8月3日</li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p>
 * 
 * </p>
 */
public class Worker implements Runnable {

	private Master master;
	
	@Override
	public void run() {
		while(master.getTasks().size()>0) {
			doWork();
		}
	}
	


	private void doWork() {
		Task task = master.getTasks().poll();
		if(task == null) {
			return;
		}
		System.out.println(Thread.currentThread().getName()+"执行任务："+task.toString());
		Result result = new Result();
		result.setSum(task.getEnd()+task.getStart());
		result.setName(task.getName());
		master.getResults().put(result.getName(), result);
	}



	public Master getMaster() {
		return master;
	}



	public void setMaster(Master master) {
		this.master = master;
	}

	
}

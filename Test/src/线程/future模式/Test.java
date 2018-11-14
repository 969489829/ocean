/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年8月3日
 * Author：jk
 ******************************************************************/

package 线程.future模式;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

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
 * futuretask类，callable接口实现实际处理业务方法，task.get()方法会阻塞，一直到任务完成才执行，如果get方法指定时间，那么到了时间如果没有处理完，则会抛出异常
 * </p>
 */
public class Test {
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		TaskVO taskVO = new TaskVO();
		taskVO.setFirstName("z");
		taskVO.setLastName("yj");
		taskVO.setStart(1);
		taskVO.setEnd(9);
		/*Callable<TaskVO> callable = new Callable<TaskVO>() {
			@Override
			public TaskVO call() throws Exception {
				taskVO.setAll(taskVO.getEnd()+taskVO.getStart());
				Thread.sleep(3000);
				return taskVO;
			}
		};
		FutureTask<TaskVO> task = new FutureTask<>(callable);*/
		FutureTask<TaskVO> task = new FutureTask<>(new Call(taskVO));
//		Task task = new Task(new Call(taskVO));
		new Thread(task).start();
		System.out.println("任务执行完毕？"+task.isDone());
		System.out.println("做其他事");
		System.out.println("休眠4秒");
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i <= 4; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("当前第"+i+"秒");
					System.out.println("任务执行完毕？"+task.isDone());
				}
			}
		}).start();
		try {
			int all = task.get(1,TimeUnit.SECONDS).getAll();
			System.out.println("取得计算结果"+all);
		} catch (Exception e) {
			System.out.println("执行超时");
		}
		Thread.sleep(4000);
		System.out.println("休眠完毕");
		System.out.println("任务执行完毕？"+task.isDone());
		System.out.println("取得计算结果："+task.get().getAll());
		
	}

}

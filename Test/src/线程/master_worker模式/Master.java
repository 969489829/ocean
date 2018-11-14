/******************************************************************
 * Master.java
 * Copyright jk 2018
 * CreateDate：2018年8月3日
 * Author：jk
 ******************************************************************/

package 线程.master_worker模式;

import java.lang.Thread.State;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

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
public class Master {
	
	//任务队列
	private volatile ConcurrentLinkedQueue<Task> tasks = new ConcurrentLinkedQueue<>();
	
	//worker线程
	private HashMap<String, Thread> workers = new HashMap<>();

	// 处理结果集
	private ConcurrentHashMap<String, Result> results = new ConcurrentHashMap<>();
	
	/**
	 * 
	 * <b>构造方法</b>
	 * <br/>
	 * @param worker 工作线程
	 * @param count 数量
	 */
	public Master(Worker worker,int count) {
		worker.setMaster(this);
		for (int i = 1; i <= count; i++) {
			workers.put("worker"+i, new Thread(worker));
		}
	}

	/**
	 * 
	 * <b>方法说明：</b>
	 * <ul>
	 * 添加任务
	 * </ul>
	 * @param task
	 */
	public void addTask(Task task) {
		tasks.add(task);
	}
	
	/**
	 * 
	 * <b>方法说明：</b>
	 * <ul>
	 * wokers开始工作
	 * </ul>
	 */
	public void execute() {
		Set<Entry<String, Thread>> entrySet = workers.entrySet();
		for (Entry<String, Thread> entry : entrySet) {
			entry.getValue().start();
		}
	}
	
	/**
	 * 
	 * <b>方法说明：</b>
	 * <ul>
	 * 返回是否工作完成
	 * </ul>
	 * @return
	 */
	public boolean ifFinish() {
		Set<Entry<String, Thread>> entrySet = workers.entrySet();
		for (Entry<String, Thread> entry : entrySet) {
			if(entry.getValue().getState() != State.TERMINATED) {
				return false;
			}
		}
		return true;
	}

	public ConcurrentLinkedQueue<Task> getTasks() {
		return tasks;
	}

	public void setTasks(ConcurrentLinkedQueue<Task> tasks) {
		this.tasks = tasks;
	}

	public HashMap<String, Thread> getWorkers() {
		return workers;
	}

	public void setWorkers(HashMap<String, Thread> workers) {
		this.workers = workers;
	}

	public ConcurrentHashMap<String, Result> getResults() {
		return results;
	}

	public void setResults(ConcurrentHashMap<String, Result> results) {
		this.results = results;
	}

	
}

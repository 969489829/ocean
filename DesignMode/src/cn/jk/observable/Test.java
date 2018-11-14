/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年8月7日
 * Author：jk
 ******************************************************************/

package cn.jk.observable;

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
 * 观察者模式
 * 发布/订阅
 * 发布者，订阅者，
 * 推送主题消息，
 * 当发布者有改变，或者有什么东西变化的时候，推送给订阅者消息，
 * 推就是把消息发给订阅者，拉就是把发布者整个对象给订阅者，订阅者自己从中获取有用的消息
 * </p>
 */
public class Test {
	
	public static void main(String[] args) {
		MyObservable myObservable = new MyObservable();
		
		MyObserver myObserver = new MyObserver("订阅者1");
		MyObserver myObserver1 = new MyObserver("订阅者2");
		MyObserver myObserver2 = new MyObserver("订阅者3");
		MyObserver myObserver3 = new MyObserver("订阅者4");
		
		myObservable.addObserver(myObserver);
		myObservable.addObserver(myObserver1);
		myObservable.addObserver(myObserver2);
		myObservable.addObserver(myObserver3);
		
		myObservable.changeName("show出你的技能");
		
		myObservable.deleteObserver(myObserver);
		myObservable.deleteObserver(myObserver1);
		myObservable.deleteObserver(myObserver2);
		
		myObservable.changeName("show出你的技能1");
	}

}

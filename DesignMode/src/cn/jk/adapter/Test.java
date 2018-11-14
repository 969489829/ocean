/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年8月7日
 * Author：jk
 ******************************************************************/

package cn.jk.adapter;

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
 * 适配器模式，主要解决问题，当一个接口的实现方法需要被替换时，又不希望改变原代码即可使用适配器模式
 * 实现目标类的接口，然后重写方法，跟装饰模式同出一辙，只不过目的不一样
 * 装饰模式是在原有方法前面或者后面加点料，
 * 适配器模式是可能完全改变这个方法的逻辑，
 * 但实现这个思想的方法都是一样的
 * 
 * 大多设计模式无非就是利用了java的基本特性
 * 封装 封装内部细节，对外提供简单的访问接口
 * 继承 继承跟实现归为一类，通过继承，可以在不改变原来代码的情况下对方法重写
 * 多态 多态不就是泛型吗，更多的时候我们只需要提供一个接口，使用接口的特定方法，就像是回调一样
 * 抽象 抽象就是利用java的这些特性，搞出一套一套的设计模式来，设计模式本来就是为了解决特定情况的问题总结出来的方法，这些方法被抽象出来就是设计模式
 * 
 * </p>
 */
public class Test {

	public static void main(String[] args) {
		/**
		 * 以前电脑拿来打游戏，书籍拿来学习，现在我希望电脑能完成跟书籍一样的功能，拿来学习
		 */
		Computer c1 = new MyComputer();
		c1.playGames();
		
		Computer c2 = new Adapter();
		c2.playGames();
	}
}
/******************************************************************
 * FinalizeEspaceGC.java
 * Copyright jk 2018
 * CreateDate：2018年8月16日
 * Author：jk
 ******************************************************************/

package gc;


/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年8月16日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 1.对象可以在被gc时自救
 * 2.自救的机会只有一次，因为finalize方法只会被系统调用一次
 * </p>
 */
public class FinalizeEscapeGC {
	public static FinalizeEscapeGC SAVE_HOOK = null;
	
	public void isAlive() {
		System.out.println("yes,i am still alive:)");
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize method executed!");
		//关联引用
		FinalizeEscapeGC.SAVE_HOOK = this;
	}
	
	public static void main(String[] args) throws InterruptedException {
		SAVE_HOOK = new FinalizeEscapeGC();
		//对象第一次自救
		SAVE_HOOK = null;
		System.gc();
		//finalize方法优先级比较低，所以暂停0.5秒等待它
		Thread.sleep(500);
		if(SAVE_HOOK != null) {
			SAVE_HOOK.isAlive();
		}else {
			System.out.println("no ,i am dead:(");
		}
		//下面的代码跟上面一样，但无法再次自救了
		SAVE_HOOK =null;
		System.gc();
		Thread.sleep(500);
		if(SAVE_HOOK != null) {
			SAVE_HOOK.isAlive();
		}else {
			System.out.println("no ,i am dead:(");
		}
		
	}
	
	
}

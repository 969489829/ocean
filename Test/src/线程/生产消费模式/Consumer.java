/******************************************************************
 * Consumer.java
 * Copyright jk 2018
 * CreateDate：2018年8月3日
 * Author：jk
 ******************************************************************/

package 线程.生产消费模式;

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
 * 消费者
 * </p>
 */
public class Consumer {

	private Mediation mediation;
	
	/**
	 * 
	 * <b>方法说明：</b>
	 * <ul>
	 * 消费者买产品
	 * </ul>
	 * @return
	 */
	public Product buyProduct() {
		Product sellProduct = mediation.sellProduct();
		return sellProduct;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 获取
	 * </ul>
	 * @return the mediation
	 */
	public Mediation getMediation() {
		return mediation;
	}

	/**
	 * <b>方法说明：</b>
	 * <ul>
	 * 设置
	 * </ul>
	 * mediation
	 */
	public void setMediation(Mediation mediation) {
		this.mediation = mediation;
	}
	
}

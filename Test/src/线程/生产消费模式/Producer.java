/******************************************************************
 * Producer.java
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
 * 生产者
 * </p>
 */
public class Producer {
	
	private Mediation mediation;
	
	public Producer() {
		super();
	}



	/**
	 * 
	 * <b>方法说明：</b>
	 * <ul>
	 * 生产产品
	 * </ul>
	 */
	public void createProduct() {
		Product product = new Product("pro"+Math.random(),0);
		mediation.getProduct(product);
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

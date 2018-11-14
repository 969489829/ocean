package testProxy;

import java.io.Serializable;

public class Father implements Serializable{
	/**
	 * 序列号
	 */
	private static final long serialVersionUID = -5185452130550141714L;

	private String fa;
	
	private Integer fai;

	public String getFa() {
		return fa;
	}

	public void setFa(String fa) {
		this.fa = fa;
	}

	public Integer getFai() {
		return fai;
	}

	public void setFai(Integer fai) {
		this.fai = fai;
	}
	
	
}

/**
 * ����10:20:57
 * xingjia
 */
package com.user.entity;

import java.util.Date;

/**
 * @author xingjia
 *
 */
public class UserEntity {
	/** ��������ˮ��*/
	private String vcUid;
	
	/** �û�����*/
	private int intAge;
	
	/**�û���*/
	private String vcUname;
	
	/** �û����� */
	private String vcPwd;
	
	/**�û���������*/
	private Date dtBirday;

	/**
	 * @return vcUid
	 */
	public String getVcUid() {
		return vcUid;
	}

	/**
	 * @param vcUid Ҫ���õ� vcUid
	 */
	public void setVcUid(String vcUid) {
		this.vcUid = vcUid;
	}

	/**
	 * @return intAge
	 */
	public int getIntAge() {
		return intAge;
	}

	/**
	 * @param intAge Ҫ���õ� intAge
	 */
	public void setIntAge(int intAge) {
		this.intAge = intAge;
	}

	/**
	 * @return vcUname
	 */
	public String getVcUname() {
		return vcUname;
	}

	/**
	 * @param vcUname Ҫ���õ� vcUname
	 */
	public void setVcUname(String vcUname) {
		this.vcUname = vcUname;
	}

	/**
	 * @return vcPwd
	 */
	public String getVcPwd() {
		return vcPwd;
	}

	/**
	 * @param vcPwd Ҫ���õ� vcPwd
	 */
	public void setVcPwd(String vcPwd) {
		this.vcPwd = vcPwd;
	}

	/**
	 * @return dtBirday
	 */
	public Date getDtBirday() {
		return dtBirday;
	}

	/**
	 * @param dtBirday Ҫ���õ� dtBirday
	 */
	public void setDtBirday(Date dtBirday) {
		this.dtBirday = dtBirday;
	}

	

		
}

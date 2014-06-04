/**
 * 上午10:20:57
 * xingjia
 */
package com.user.entity;

import java.util.Date;

/**
 * @author xingjia
 *
 */
public class UserEntity {
	/** 主键，流水号*/
	private String vcUid;
	
	/** 用户年龄*/
	private int intAge;
	
	/**用户名*/
	private String vcUname;
	
	/** 用户密码 */
	private String vcPwd;
	
	/**用户出生日期*/
	private Date dtBirday;

	/**
	 * @return vcUid
	 */
	public String getVcUid() {
		return vcUid;
	}

	/**
	 * @param vcUid 要设置的 vcUid
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
	 * @param intAge 要设置的 intAge
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
	 * @param vcUname 要设置的 vcUname
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
	 * @param vcPwd 要设置的 vcPwd
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
	 * @param dtBirday 要设置的 dtBirday
	 */
	public void setDtBirday(Date dtBirday) {
		this.dtBirday = dtBirday;
	}

	

		
}

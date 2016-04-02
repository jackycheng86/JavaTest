/**
 * 2016年3月13日   jacky
 */
package com.json;


/**
 * @author jacky
 *
 */
public class JkLogInRequest extends RequestEntityBase {
	private String UserName;
	private String Password;

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return UserName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		UserName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}

}

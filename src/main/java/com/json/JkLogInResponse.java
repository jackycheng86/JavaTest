/**
 * 2016年3月13日   jacky
 */
package com.json;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @author jacky
 *
 */
public class JkLogInResponse extends ResponseEntityBase {

	private int HANDLE;
	
	

	public JkLogInResponse(String message, boolean result) {
		super(message, result);
		// TODO Auto-generated constructor stub
	}

	public JkLogInResponse(String message, boolean result, int hANDLE) {
		super(message, result);
		HANDLE = hANDLE;
	}

	public JkLogInResponse(int hANDLE) {
		super();
		HANDLE = hANDLE;
	}

	public JkLogInResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the hANDLE
	 */
	public int getHANDLE() {
		return HANDLE;
	}

	/**
	 * @param hANDLE
	 *            the hANDLE to set
	 */
	public void setHANDLE(int hANDLE) {
		HANDLE = hANDLE;
	}

}

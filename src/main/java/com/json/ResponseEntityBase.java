/**
 * 2016年3月13日   jacky
 */
package com.json;


/**
 * @author jacky
 *
 */
public class ResponseEntityBase {

	private String Message;
	private boolean Result;
	
	
	
	public ResponseEntityBase(String message, boolean result) {
		super();
		Message = message;
		Result = result;
	}
	public ResponseEntityBase() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return Message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		Message = message;
	}
	/**
	 * @return the result
	 */
	public boolean getResult() {
		return Result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(boolean result) {
		Result = result;
	}
	
}

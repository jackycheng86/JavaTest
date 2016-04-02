package com.time;

import java.sql.Timestamp;
import java.util.Date;

public class TimeStampTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String timestamp=getTimeStamp();
		System.out.println(timestamp);
	}

	public static String getTimeStamp(){
		Date date = new Date();
		long time = date.getTime();
		Timestamp timestamp=new Timestamp(time);
		String times=timestamp.getTime()+"";
		return times.substring(0,10);
	}
}

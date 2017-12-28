package com.ping;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

public class PingTest {

	/**
	 * @param args
	 */
	public static void pingTest(String[] args) {
		// TODO Auto-generated method stub
		String host="192.168.1.1";
		int timeOut = 3000; //
		try {
			System.out.println(new Date().toString());
			boolean status = InetAddress.getByName(host).isReachable(timeOut);
			System.out.println(status);
			System.out.println(new Date().toString());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			Runtime.getRuntime().exec("cmd /c start ping 127.0.0.1");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		//---------------
//		String line = null;
//        try
//        {
//            Process pro = Runtime.getRuntime().exec("ping 192.168.1.1" + args[0]);
//            BufferedReader buf = new BufferedReader(new InputStreamReader(pro.getInputStream()));
//            while((line = buf.readLine()) != null)
//                System.out.println(line);
//        }
//        catch(Exception ex)
//        {
//            System.out.println(ex.getMessage());
//        }
	}

}

package com.hex;

import java.io.UnsupportedEncodingException;

public class HexString {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		// String t1="{\"HANDLE\":1218125432,\"Result\":true,\"Message\":null}";
		// System.out.println(toHexString(t1));
		// System.out.println(t1.getBytes("UTF-8").length);
		// String
		// t2="7B2248414E444C45223A313231383132353433322C22526573756C74223A747275652C224D657373616765223A6E756C6C7D";
		// for(byte a:t1.getBytes("UTF-8")){
		// System.out.println(a);
		// }
		// System.out.println(toStringHex(t2));
		//printTest();
		String s1="{\"UserName\":\"EZCAS\",\"Password\":\"THTF\"}";
		System.out.println(toHexString(s1));
	}

	public static String toHexString(String s) {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			int ch = (int) s.charAt(i);
			String s4 = Integer.toHexString(ch).toUpperCase();
			str = str + s4;
		}
		return str;// 0x表示十六进制
	}

	// 转换十六进制编码为字符串
	public static String toStringHex(String s) {

		byte[] baKeyword = new byte[s.length() / 2];
		for (int i = 0; i < baKeyword.length; i++) {
			try {
				baKeyword[i] = (byte) (0xff & Integer.parseInt(s.substring(i * 2, i * 2 + 2), 16));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		try {
			s = new String(baKeyword, "utf-8");// UTF-16le:Not
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return s;
	}

	public static void printHexString(byte[] b) {
		for (int i = 0; i < b.length; i++) {
			String hex = Integer.toHexString(b[i] & 0xFF);
			if (hex.length() == 1) {
				hex = '0' + hex;
			}
			System.out.print(hex.toUpperCase());
		}
	}

	public static void printTest() throws UnsupportedEncodingException {
		String s = "{\"HANDLE\":1218093800,\"BH\":0,\"MC\":\"同方环境\",\"SJBH\":2,\"BZ\":\"环境\"}";
		byte[] ts = s.getBytes("UTF-8");
		System.out.println(ts);
		for (byte a : ts) {
			System.out.println(a);
		}
		System.out.println("~~~~~~~~~~~after~~~~~~~~~");
		int[] ss = new int[ts.length];
		for (int i = 0; i < ss.length; i++) {
			//System.out.println(Int2BytesLh(ts[i]));
			Int2BytesLH(ts[i]);
		}
	}
	
	/**
	 * 将int转为低字节在前，高字节在后的byte数组 转为C#需要的的数组顺序
	 * 
	 */
	public static byte[] Int2BytesLH(int n) {
		byte[] b = new byte[4];
		b[0] = (byte) (n & 0xff);
		b[1] = (byte) (n >> 8 & 0xff);
		b[2] = (byte) (n >> 16 & 0xff);
		b[3] = (byte) (n >> 24 & 0xff);
		System.out.println("~~~~~~~~~~~~~~~~b[0]~~~~~~~~~~");
		System.out.println(b[0]);
		System.out.println("~~~~~~~~~~~~~~~~b[1]~~~~~~~~~~");
		System.out.println(b[1]);
		System.out.println("~~~~~~~~~~~~~~~~b[2]~~~~~~~~~~");
		System.out.println(b[2]);
		System.out.println("~~~~~~~~~~~~~~~~b[3]~~~~~~~~~~");
		System.out.println(b[3]);
		return b;
	}
	
	/**
	 * from byte to int, because of byte in java is signed
	 */
	private static int toInt(int b) {
		return b >= 0 ? (int)b : (int)(b + 256);
	}

}

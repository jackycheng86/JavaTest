package com.hex;

public class ConverterUtil {


	/**
	 * 检查消息
	 * 
	 * @param bytes
	 * @return byte[]
	 */
	public static byte[] CheckMessage(byte[] bytes) {
		byte[] result = null;
		if (bytes != null) {
			int num = 0;
			for (int i = 1; i < bytes.length; i++) {
				if (bytes[i] == 127) {
					num = i;
					break;
				}
			}
			if (num != 0) {
				byte[] array = new byte[num + 1];
				System.arraycopy(bytes, 0, array, 0, array.length);
				result = array;
			}
		}
		return result;
	}

	/**
	 * 解码返回的消息头
	 * 
	 * @param source
	 * @return byte[]
	 */
	public static byte[] DecodingMessageHeader(byte[] source) {
		byte[] array = null;
		for (int i = 0; i < source.length; i++) {
			if (source[i] == 126) {
				array = CombineByteArray(array, new byte[] { (byte) (source[i + 1] ^ 32) });
				i++;
			} else {
				array = CombineByteArray(array, new byte[] { source[i] });
			}
		}
		return array;
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
		return b;
	}

	/**
	 * 将byte[]转为低字节在前，高字节在后的byte数组 从C#收包后转换为JAVA的数组顺序
	 */
	public static byte[] BytestoHL(byte[] n) {
		byte[] b = new byte[4];
		b[3] = n[0];
		b[2] = n[1];
		b[1] = n[2];
		b[0] = n[3];
		return b;
	}

	/**
	 * 将两个byte数组组合为一个byte数组
	 * 
	 * @param a
	 * @param b
	 * @return byte[]
	 */
	public static byte[] CombineByteArray(byte[] a, byte[] b) {
		byte[] result = null;
		if (a == null) {
			result = b;
		} else {
			if (b == null) {
				result = a;
			} else {
				byte[] c = new byte[a.length + b.length];
				System.arraycopy(a, 0, c, 0, a.length);
				System.arraycopy(b, 0, c, a.length, b.length);
				result = c;
			}
		}
		return result;
	}

	/**
	 * 加密消息头
	 * 
	 * @param source
	 * @return byte[]
	 */
	public static byte[] CodingMessageHeader(byte[] source) {
		byte[] array = new byte[] { source[0] };
		for (int i = 1; i < source.length - 1; i++) {
			byte b = source[i];
			switch (b) {
			case 126:
				array = CombineByteArray(array, new byte[] { 126, (byte) (b ^ 32) });
				break;
			case 127:
				array = CombineByteArray(array, new byte[] { 126, (byte) (b ^ 32) });
				break;
			default:
				array = CombineByteArray(array, new byte[] { 126 });
				break;
			}
		}
		return CombineByteArray(array, new byte[] { source[source.length - 1] });
	}

	/**
	 * 处理json数据头
	 * 
	 * @param datalen
	 * @param mti1
	 * @param mti2
	 * @return byte[]
	 */
	public static byte[] GetJsonMessageRequestHeader(int datalen, byte mti1, byte mti2) {
		byte[] array = new byte[] { 127, 74 };
		array = CombineByteArray(array, new byte[] { mti1, mti2 });
		array = CombineByteArray(array, Int2BytesLH(datalen));
		return CombineByteArray(array, new byte[] { 82, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 127 });
	}

}

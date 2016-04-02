package com.json;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "{\"HANDLE\":1218125432,\"Result\":true,\"Message\":null}";
		String ss=s.toLowerCase();
		ObjectMapper mapper = new ObjectMapper();
		try {
			JkLogInResponse ret = mapper.readValue(ss, JkLogInResponse.class);
			System.out.println(ret.getHANDLE());
			System.out.println(ret.getMessage());
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

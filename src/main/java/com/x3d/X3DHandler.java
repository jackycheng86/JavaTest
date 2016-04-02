/**
 * 
 */
package com.x3d;

import java.util.Stack;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author Administrator
 *
 */
public class X3DHandler extends DefaultHandler {
private Stack<String> stack = new Stack<String>();
	
	private String name;
	
	private String gender;
	
	private String age;
	
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException
	{
		stack.push(qName);
		System.out.println(qName);
		for(int i = 0; i < attributes.getLength(); i++)
		{
			String attrName = attributes.getQName(i);
			String attrValue = attributes.getValue(i);
			
			System.out.println(attrName + "=" + attrValue);
		}
	}
	
	public void characters(char[] ch, int start, int length)
			throws SAXException
	{
		String tag = stack.peek();
		
		if("姓名".equals(tag))
		{
			name = new String(ch, start,length);
		}
		else if("性别".equals(tag))
		{
			gender = new String(ch, start, length);
		}
		else if("年龄".equals(tag))
		{
			age = new String(ch, start, length);
		}
	}
	
	public void endElement(String uri, String localName, String qName)
			throws SAXException
	{
		stack.pop(); //表示该元素已经解析完毕，需要从栈中弹出
		
		if("学生".equals(qName))
		{
			System.out.println("姓名：" + name);
			System.out.println("性别：" + gender);
			System.out.println("年龄：" + age);
			
			System.out.println();
		}
		
	}
}

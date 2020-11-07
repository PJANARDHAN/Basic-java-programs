package com.besics;

import java.util.StringTokenizer;

public class StringTokenizerClass {

	public static void main(String[] args) {
		//String str="hai hello janardhan";
		String str1="hai,hello,janardhan, how are you what.are.you.doing";
		StringTokenizer st=new StringTokenizer(str1,"., ");
		
		while(st.hasMoreTokens())
		{
			String result=st.nextToken();
			System.out.println(result);
		}
	}

}

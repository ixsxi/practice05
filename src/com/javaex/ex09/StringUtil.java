package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String strArray[]){
    	
    	String result = "";
    	
    	for(int i=0; i<strArray.length; i++) {
        //메소드 내용작성{
    		result = result + strArray[i];
        
    }

    	return  result;
}
}

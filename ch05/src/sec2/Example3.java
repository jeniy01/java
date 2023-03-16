package sec2;

import java.util.Arrays;

public class Example3 {
	public static void main(String[] args) {
	//문자열과 문자 배열
	String str1="java program";
	char[]c_arr={'j','a','v','a',' ','p','r','o','g','r','a','m'};
	
	//문자열과 문자 배열의 비교
	//System.out.println(str1==c_arr); 불가능함
	System.out.println(str1.equals(c_arr));	//따라서 equals를 써줘야 한다.
	
	//문자 배열을 문자열로 변환1
	String str2=Arrays.toString(c_arr); //Arrays.toString(); 사용
	System.out.println(str1==str2);
	System.out.println(str1.equals(str2));
	
	//문자 배열을 문자열로 변환2
	//StringBuilder : String 또는 char의 배열 요소를 하나의 문자열로 변환
	StringBuilder strB3=new StringBuilder();
	for(int i=0;i<c_arr.length;i++){
		strB3.append(c_arr[i]);
	}
	String str3=strB3.toString();
	System.out.println(str1==str3);
	System.out.println(str3.equals(str1));
	System.out.println();
	
	//문자 배열을 문자열로 변환3(강추)
	String str4=new String(c_arr);
	System.out.println(str4==str1);
	System.out.println(str4.equals(str1));
	
	//문자열을 문자 배열로 변환1(charAt 이용)
	char[] c1=new char[str1.length()];
	for(int i=0;i<str1.length();i++){
		c1[i]=str1.charAt(i);
	}
	
	//문자열을 문자 배열로 변환2(toCharArray 이용)
	char[] c2=str1.toCharArray();
	
	
	}

}

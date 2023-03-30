package sec4;

import java.util.Arrays;

public class StringEx1 {
	public static void main(String[] args) {
		String data = "자바프로그래밍";
		
		byte[] arr = data.getBytes();	//문자열을 문자배열로
		System.out.println(data);
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+", ");
		}
		System.out.println();
		String str = new String(arr);	//문자배열을 문자열로
		System.out.println(str);
	}
}

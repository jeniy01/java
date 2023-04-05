package sec1;

import java.util.ArrayList;
import java.util.Arrays;

//배열을 ArrayList로 변환(Casting)
public class CastingListEx2 {
	public static void main(String[] args) {
		//배열
		String[] arr1 = {"정재현", "김도영", "김정우", "도재정"};
		for(String a : arr1){
			System.out.println(a);
		}
		
		//배열을 ArrayList로 바꾸는 방법1
		System.out.println();
		ArrayList<String> arrayList1 = new ArrayList<>();
		for(String a : arr1){	//요소마다 접근하여 하나씩 추가
			arrayList1.add(a);
		}
		System.out.println(arrayList1.toString());
		
		//배열을 ArrayList로 바꾸는 방법2
		//Arrays 클래스의 asList()를 활용하여 배열요소를 List로 변환
		System.out.println();
		ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList(arr1));
		System.out.println(arrayList2.toString());
		System.out.println();
	}
}

package sec1;

import java.util.ArrayList;

//ArrayList를 배열로 변환
public class CastingListEx1 {
	public static void main(String[] args) {
		//ArrayList
		ArrayList<String> arrayList1 = new ArrayList<>();	//List 선언
		arrayList1.add("정재현");
		arrayList1.add("김도영");
		arrayList1.add("김정우");
		arrayList1.add("도재정");
		System.out.println(arrayList1.toString());
		
		//ArrayList를 배열로 바꾸는 방법1
		System.out.println();
		String[] arr1 = new String[arrayList1.size()];
		int i=0;
		for(String tmp : arrayList1){
			arr1[i++]=tmp;
		}
		for(String a : arr1){
			System.out.println(a);
		}
		
		//ArrayList를 배열로 바꾸는 방법2
		System.out.println();
		String[] arr2 = arrayList1.toArray(new String[arrayList1.size()]);
		for(String a : arr2){
			System.out.println(a);
		}
	}
}

package sec1;

import java.util.ArrayList;

//Collection Framework : 하나의 데이터가 아닌 데이터 모음을 다루기 위한 제네릭
public class ArrayListEx1 {
	public static void main(String[] args) {
		//배열은 각 요소의 값들이 어떠한 특성을 가지고 있는 지 불분명하며, 선언 시 반드시 개수가 규정될 필요가 있음
		//ArrayList는 각 특성이 무엇인지 분명하고, 선언 시 개수를 규정할 필요 없이 원하는 만큼 요소의 값을 저장
		//제네릭명<타입> 객체명 = new 제네릭명<>();
		ArrayList<Integer> jum = new ArrayList<>();
		jum.add(100);	//.add(타입의값) : 요소의 추가
		jum.add(80);
		jum.add(90);
		jum.add(85);
		jum.remove(2);	//.remove(인덱스) : 특정 요소의 제거
		System.out.println("80을 가진 요소 존재 유무 : "+jum.contains(80));	//특정 값의 존재 유무
		jum.add(1, 95);	//특정 위치에 요소 추가
		System.out.println("85 값 위치(인덱스) : "+jum.indexOf(85));	//특정 값의 위치(해당하는 요소가 없으면 -1 출력)
		
		for(int i=0;i<jum.size();i++){	//.size() : 요소의 개수
			int a = jum.get(i);	//.get(인덱스) : 특정 요소의 접근
			System.out.println(a);
		}
		
		//더 쉬운 방법(개선된 for문)
		for(Integer i : jum){
			System.out.println("점수 : "+i);
		}
	}
}

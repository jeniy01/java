package sec3;

import java.util.Map.Entry;
import java.util.TreeMap;

//TreeMap : 이진트리를 기반으로 한 Map 인터페이스의 서브 클래스이며, TreeSet은 값만 저장되지만, TreeMap은 키와 값을 모두 저장함
//HashMap은 일반적인 상황에서 많이 사용, TreeMap은 정렬된 데이터를 조회해야 하는 범위 검색이 필요한 경우에 많이 사용
public class TreeMapEx1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();	//TreeMap 생성
		map1.put(1, "굿즈");	//요소 추가
		map1.put(2, "응원봉");
		map1.put(3, "슬로건");
		
		TreeMap<Integer, String> map2 = new TreeMap<Integer, String>(){{	//초기값 설정
			put(1,"굿즈");	//요소 추가
			put(2, "응원봉");
			put(3, "슬로건");
		}};
		
		map2.remove(1);	//key값 1 제거
		map2.clear();	//모든 값 제거
		
		System.out.println(map1);	//전체 출력 : {1=굿즈, 2=응원봉, 3=슬로건}
		System.out.println(map1.get(1));	//key값 1의 value 열기 : 굿즈
		System.out.println(map1.firstEntry());	//최소 Entry 출력 : 1-굿즈
		System.out.println(map1.firstKey());	//최소 Key 출력 : 1
		System.out.println(map1.lastEntry());	//최대 Entry 출력 : 3-슬로건
		System.out.println(map1.lastKey());	//최대 Key 출력 : 3
		
		//entrySet() 활용
		for(Entry<Integer, String> entry : map1.entrySet()){
			System.out.println("[Key]: "+entry.getKey()+"[Value]: "+entry.getValue());
		}
		//[Key]: 1 [Value]: 굿즈
		//[Key]: 2 [Value]: 응원봉
		//[Key]: 3 [Value]: 슬로건
		System.out.println();
		//KeySet() 활용
		for(Integer i : map1.keySet()){	//저장된 key값 확인
			System.out.println("[Key]: "+i+"[Value]: "+map1.get(i));
		}
	}
}

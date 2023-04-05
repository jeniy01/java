package sec2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//set은 데이터 중복이 없으며, 인덱스가 없으므로 요소를 접근할 때 List처럼 특정 인덱스에 대한 get(인덱스) 접근이 불가
//인덱스가 없으므로 순서 유지를 보장하지 못함
public class HashSetEx1 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(80);
		set1.add(90);
		set1.add(80);
		set1.add(100);
		set1.add(90);
		System.out.println("set에서 80이 존재하는가? "+set1.contains(80));
		for(Integer s : set1){
			System.out.println(s);
		}
		set1.add(70);
		set1.remove(100);	//remove(값) : 요소제거
		
		System.out.println();
		Iterator<Integer> it = set1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println();
		System.out.println(set1.toString());
		/* get(인덱스)에 의한 접근이 불가
		for(int i=0;i<set1.size();i++){
		 	System.out.printIn(set1.get(i));
		}
		*/
	}
}

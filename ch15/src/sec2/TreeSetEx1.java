package sec2;

import java.util.TreeSet;

public class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet<Integer> set1 = new TreeSet<>();	//TreeSet 생성
		set1.add(70);	//요소 추가
		set1.add(40);	//40은 70보다 작으므로 왼쪽에 배치
		set1.add(90);	//90은 70보다 크므로 오른쪽에 배치
		set1.add(100);	//100은 90보다 크므로 90의 오른쪽에 배치
		set1.add(50);	//50은 40보다 크므로 40의 오른쪽에 배치
		set1.add(80);	//80은 90보다 작으므로 90의 왼쪽에 배치
		set1.add(90);	//중복 발생으로 인해 작업 안함
		set1.add(70);	//중복 발생으로 인해 작업 안함
		System.out.println("요소의 수 : "+set1.size());	//요소의 개수
		set1.remove(90);
		System.out.println("90의 존재 유무 : "+set1.contains(90));	//존재 유무
		set1.clear();	//비우기
		System.out.println("set1이 비어 있습니까? "+set1.isEmpty());	//비어있는 set인지 확인
	}
}

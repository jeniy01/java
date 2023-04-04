package sec1;

import java.util.LinkedList;
import java.util.List;

//속도 빠름 but, 중간에 요소 삽입하면 ArrayList 속도가 더 빠름
public class LinkedListEx1 {
	public static void main(String[] args) {
		List<Integer> i1 = new LinkedList<>();
		i1.add(90);
		i1.add(100);
		i1.add(90);	//요소 추가
		i1.add(1, 70);	//요소 삽입
		i1.remove(2);	//요소 제거
		for(Integer d : i1){
			System.out.println(d);
		}
		
		i1.clear();	//비우기
		
		List<String> i2 = new LinkedList<>();
		i2.add("이마크");
		i2.add("이제노");
		i2.add("나재민");	//요소 추가
		i2.add(0, "박지성");	//요소 삽입
		i2.remove(2);	//요소 제거
		
		for(String d : i2){
			System.out.println(d);
		}
		i2.clear();
		
		LinkedList<String> i3 = new LinkedList<>();
		Student st = new Student();
		st.setNo(9);
		st.setName("이마크");
		st.setKor(100);
		st.setEng(100);
		st.setMat(90);
		//i3.add(st);
		
		for(String s : i3){
			System.out.println(s.toString());
		}
	}
}

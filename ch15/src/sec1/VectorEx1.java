package sec1;

import java.util.*;
//Vector는 동기화되는 싱글쓰레드에서 사용, ArrayList는 멀티쓰레드, 싱글쓰레드 구분 없이 사용
public class VectorEx1 {
	public static void main(String[] args) {
		List<Integer> v1 = new Vector<Integer>();
		v1.add(90);	//요소 추가
		v1.add(100);
		v1.add(80);
		v1.add(1, 95);	//인덱스가 1인 곳에 삽입
		v1.remove(2);	//인덱스가 2인 요소 제거
		for(int i=0;i<v1.size();i++){
			System.out.println(v1.get(i));
		}
		System.out.println("-------------");
		for(Integer d : v1){
			System.out.println(d);
		}
		System.out.println("*************");
		v1.clear();	//비우기
		
		List<Student> v3 = new Vector<Student>();
		Student st = new Student();
		st.setNo(1);
		st.setName("이동혁");
		st.setKor(100);
		st.setEng(90);
		st.setMat(80);
		v3.add(st);
		for(Student s : v3){
			System.out.println(s.toString());
		}
		
		//Iterator를 활용한 요소 분리와 while 반복문
		List<String> v2 = new Vector<String>();
		Iterator iter = v2.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}

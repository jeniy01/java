package sec1;

import java.util.ArrayList;
//컬렉션 프레임워크 : 객체의 모음을 처리하기 위한 자료구조인 자바 클래스
//List : 목록과 같은 데이터를 저장하기에 적합 -> ArrayList, Vector, LinkedList
public class ArrayListEx2 {
	public static void main(String[] args) {
		//stArr은 Student의 집합체(목록)이므로 개별 요소 객체는 Student로 부터 만들어진 객체여야함
		ArrayList<Student> stArr = new ArrayList<>();
		
		//개별 요소인 Student의 객체를 생성하여 각 요소에 해당하는 겂을 저장한다.
		Student st1 = new Student();
		st1.setNo(1);
		st1.setName("이동혁");
		st1.setKor(100);
		st1.setEng(90);
		st1.setMat(80);
		stArr.add(st1);
		
		Student st2 = new Student();
		st2.setNo(2);
		st2.setName("황인준");
		st2.setKor(90);
		st2.setEng(90);
		st2.setMat(100);
		stArr.add(st2);
		
		Student st3 = new Student();
		st3.setNo(3);
		st3.setName("나재민");
		st3.setKor(80);
		st3.setEng(90);
		st3.setMat(100);
		stArr.add(st3);
		
		Student st4 = new Student();
		st4.setNo(4);
		st4.setName("이제노");
		st4.setKor(100);
		st4.setEng(90);
		st4.setMat(80);
		stArr.add(st4);
		
		//for문 둘 중에 하나 선택
		for(int i=0;i<stArr.size();i++){
			Student s = stArr.get(i);
			System.out.println(s.toString());
		}
		
		for(Student s : stArr){
			System.out.println(s.toString());
		}
	}
}

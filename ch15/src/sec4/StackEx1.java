package sec4;

import java.util.Stack;

public class StackEx1 {
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();
		Stack<String> s2 = new Stack<>();
		
		s1.push(90);	//요소 추가
		s1.push(70);
		s1.push(80);
		s1.push(100);
		s1.push(80);
		s1.push(60);
		s1.push(70);
		System.out.println("요소들 : "+s1.toString());
		System.out.println("요소의 크기 : "+s1.size());
		System.out.println("가장 마지막에 입력한 값 : "+s1.peek());	//.peek() : 가장 마지막 요소
		System.out.println("Stack에 90이 있는지 확인 : "+s1.contains(90));
		System.out.println("Stack이 비어 있는지 확인 : "+s2.empty());
		
		s1.pop();	//가장 마지막 요소 제거
		s2.clear();	//Stack 비우기
	}
}

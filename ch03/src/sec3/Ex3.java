package sec3;

public class Ex3 {
	public static void main(String[] args) {
		int pencils=534;
		int student=30;
		
		int pencilsStudent=pencils/student;
		System.out.println("학생 한 명이 가지는 연필 수 : "+pencilsStudent);
		
		int pencilsLeft=pencils%student;
		System.out.println("남은 연필 수  : "+pencilsLeft);
	}

}

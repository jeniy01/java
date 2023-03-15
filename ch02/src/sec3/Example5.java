package sec3;

import java.util.Scanner;

public class Example5 {
	public static void main(String[] args) {
		//키보드 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		System.out.println("국어 점수 입력[0-100] : ");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력[0-100] : ");
		int eng = sc.nextInt();
		System.out.println("수학 점수 입력[0-100] : ");
		int mat = sc.nextInt();
		
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("수학 : "+eng);
		System.out.println("영어 : "+mat);
		System.out.println("총점 : "+(kor+eng+mat));
		System.out.println("평균 : "+(kor+eng+mat)/3.0f);
	}

}

package sec1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx3 {
	public static void main(String[] args) {
		ArrayList<Student> stArr = new ArrayList<>();
		//List<Student> stArr = new ArrayList<>(); 도 가능함
		int cnt = 0;
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("작업 번호 [1-5] : 1.점수입력, 2.목록, 3.삭제, 4.편집, 5.종료");
			int job = Integer.parseInt(sc.nextLine());
			if(job==1){
				cnt++;
				Student st = new Student();
				st.setNo(cnt);
				System.out.println("이름 : ");
				st.setName(sc.nextLine());
				System.out.println("국어 : ");
				st.setKor(Integer.parseInt(sc.nextLine()));
				System.out.println("영어 : ");
				st.setEng(Integer.parseInt(sc.nextLine()));
				System.out.println("수학 : ");
				st.setMat(Integer.parseInt(sc.nextLine()));
			}
		}
	}
}

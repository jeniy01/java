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
				stArr.add(st);
			} else if(job==2){
				for(Student s : stArr){
					System.out.println(s.toString());
				}
			} else if(job==3){
				System.out.println("삭제할 번호(인덱스) 입력 : ");
				int a = Integer.parseInt(sc.nextLine());
				if(a >= stArr.size()){
					System.out.println("해당 번호의 데이터가 존재하지 않습니다.");
				} else {
					stArr.remove(a);
				}
			} else if(job==4){
				System.out.print("값을 변경할 번호(인덱스) 입력 : ");
				int a = Integer.parseInt(sc.nextLine());
				if(a >= stArr.size()){
					System.out.println("해당 번호의 데이터가 존재하지 않습니다.");
				} else {
					stArr.remove(a);
					Student st = new Student();
					st.setNo(cnt);
					System.out.print("이름 : ");
					st.setName(sc.nextLine());
					System.out.print("국어 : ");
					st.setKor(Integer.parseInt(sc.nextLine()));
					System.out.print("영어 : ");
					st.setEng(Integer.parseInt(sc.nextLine()));
					System.out.print("수학 : ");
					st.setMat(Integer.parseInt(sc.nextLine()));
					stArr.add(a, st);
				}
			} else if(job==5) {
				System.out.println("학생데이터를 모두 비웁니다.");
				cnt = 0;
				stArr.clear();	//ArrayList 비우기
			} else {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
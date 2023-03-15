package sec1;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		//switch~case~
		/*
		switch(변수){
			case 값1:
				실행문1;
				break;
			case 값2:
				실행문2;
				break;
			.....
			case 값n:
				실행문n;
				break;
			default:
				실행문;
		 */
	Scanner sc=new Scanner(System.in);
	Scanner sc2=new Scanner(System.in);
	int money;
	int balance=0;
	String id;
	boolean ps=true;
	while(ps){
		System.out.println("작업 번호[0:종료, 1:입금, 2:출금, 3:조회, 4:가입] : ");
		int su=sc.nextInt(); //0~4
		switch(su){
		case 0:
			System.out.println("종료");
			ps=false;
			break;
		case 1:
			System.out.println("입금 업무를 선택하였습니다.");
			System.out.println("입금할 금액을 입력하세요 : ");
			money=sc.nextInt();
			balance+=money;
			break;
		case 2:
			System.out.println("출금 업무를 선택하였습니다.");
			System.out.println("인출할 금액을 입력하세요 : ");
			money=sc.nextInt();
			balance-=money;
			break;
		case 3:
			System.out.println("조회 업무를 선택하였습니다.");
			System.out.println("현재 잔액 : "+balance);
			break;
		case 4:
			System.out.println("예금가입을 선택하였습니다.");
			System.out.println("가입할 계좌번호 입력 : ");
			id=sc2.nextLine();
			System.out.println("가입한 계좌번호");
			break;
		default:
			System.out.println("번호를 잘못 입력하였습니다.");
			break;
		}
	}
	}

}

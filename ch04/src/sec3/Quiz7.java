package sec3;

import java.util.Scanner;

public class Quiz7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		boolean sw = true;
		int money=0;
		int balance=0;
		while(sw){
			System.out.println("\n---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("---------------------------");
			System.out.print("선택> ");
			int num=sc.nextInt();
			switch(num){
			case 1:
				System.out.print("\n예금액> ");
				money=sc.nextInt();
				balance+=money;
				break;
			case 2:
				System.out.print("\n출금액> ");
				money=sc.nextInt();
				balance-=money;
				break;
			case 3:
				System.out.print("\n잔액> "+balance);
				money=sc.nextInt();
				break;
			case 4:
				System.out.print("\n종료> ");
				money=sc.nextInt();
				break;
			}
		}
	}

}

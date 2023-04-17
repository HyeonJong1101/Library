package kr.co.kopo.ui;

import java.util.Scanner;

public class LibraryUI extends BaseUI{

	public int menu() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n==============================");
		System.out.println("도서관");
		System.out.println("==============================");
		System.out.println("1.도서대여하기");
		System.out.println("2.도서반납하기");
		System.out.println("3.회원가입");
		System.out.println("4.프로그램 종료");
		System.out.print("항목을 선택하세요 : ");
		
		int type = sc.nextInt();
		sc.nextLine();
		
		return type;
	}
	
	@Override
	public void execute() {
		
		while(true) {
			int type = menu();
			
			switch(type) {
			case 1:
				System.out.println("\n도서대여 선택");
				RentBookUI ui = new RentBookUI();
				ui.execute();
				break;
			case 2:
				System.out.println("\n도서반납 선택");
				break;
			case 3:
				System.out.println("\n회원가입 선택");
				break;
			case 4:
				System.out.println("\n프로그램 종료");
				System.exit(0);
			default :
				System.out.println("\n잘못입력하셨습니다");
				break;
			}
		}
	}
}

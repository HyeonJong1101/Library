package kr.co.kopo.ui;

import java.util.Scanner;

public class RentBookUI extends BaseUI {

	public int menu() {
		System.out.println("=====================================");
		System.out.println("도서대여");
		System.out.println("=====================================");
		System.out.println("1.도서목록");
		System.out.println("2.도서검색");
		System.out.println("3.도서대출");
		System.out.println("4.종료");
		Scanner sc = new Scanner(System.in);
		System.out.print("항목을 선택하세요 : ");
		int type = sc.nextInt();
		sc.nextLine();

		return type;
	}

	@Override
	public void execute() {

		while (true) {
			int type = menu();

			ILibraryUI ui = null;
			switch (type) {
			case 1:
				System.out.println("\n도서목록 선택");
				ui = new SearchAllUI();
				break;
			case 2:
				System.out.println("\n도서검색 선택");
				ui = new SearchOneUI();
				break;
			case 3:
				System.out.println("\n도서대출 선택");
				ui = new RentBook();
				break;
			case 4:
				System.out.println("\n종료");
				System.exit(0);
			}

			if (ui != null) {
				ui.execute();
			} else {
				System.out.println("\n잘못입력하셨습니다");
			}

		}

	}

}

package kr.co.kopo.ui;

import kr.co.kopo.LibraryServiceFactory;
import kr.co.kopo.service.LibraryService;
import kr.co.kopo.vo.BookVO;

public class RentBook extends BaseUI {

	private LibraryService libraryService;
	
	public RentBook() {
		super();
		libraryService = LibraryServiceFactory.getInstance();
	}
	
	@Override
	public void execute() {
		
		String name = scanStr("대출할 책이름을 입력하세요 : ");
		BookVO book = libraryService.rentBook(name);
		
		if(book.getBook_rent() == 1) {
			System.out.println("대출완뇨...");
			book.setBook_rent(2);
		}else {
			System.out.println("이미 대출된 책입니다...");
		}
		
	}

}

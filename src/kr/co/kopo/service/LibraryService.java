package kr.co.kopo.service;

import java.util.List;

import kr.co.kopo.dao.LibraryDAO;
import kr.co.kopo.vo.BookVO;

public class LibraryService {
	
	private LibraryDAO libraryDao;

	public LibraryService() {
		super();
		libraryDao = new LibraryDAO();
	}
	
	public List<BookVO> selectAll(){
		List<BookVO> bookList = libraryDao.selectAllBook();
		return bookList;
	}
	
	public BookVO selectBook(String book_name) {
		BookVO book = libraryDao.selectBook(book_name);
		return book;
	}
	
	public BookVO rentBook(String book_name) {
		BookVO book = libraryDao.selectBook(book_name);
		return book;
	}
}

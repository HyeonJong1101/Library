package kr.co.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.co.kopo.util.ConnectionFactory;
import kr.co.kopo.vo.BookVO;

public class LibraryDAO {

	public LibraryDAO() {
		super();
	}

	public List<BookVO> selectAllBook() {

		List<BookVO> bookList = new ArrayList<>();
		
		StringBuilder sql = new StringBuilder();
		sql.append("select no, book_name, writer, book_rent");
		sql.append(" from t_book");

		try (
				Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		) {
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String book_name = rs.getString("book_name");
				String writer = rs.getString("writer");
				int book_rent = rs.getInt("book_rent");
				
				BookVO book = new BookVO();
				book.setNo(no);
				book.setBook_name(book_name);
				book.setWriter(writer);
				book.setBook_rent(book_rent);
				
				bookList.add(book);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return bookList;
	}

	public BookVO selectBook(String book_name) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("select no, book_name, writer, book_rent");
		sql.append(" from t_book");
		sql.append(" where book_name = ?");
		
		BookVO book = null;
		try(
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		){
			pstmt.setString(1,book_name);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				int no = rs.getInt("no");
				String book_n = rs.getString("book_name");
				String writer = rs.getString("writer");
				int rent = rs.getInt("book_rent");
				
				book = new BookVO();
				book.setNo(no);
				book.setBook_name(book_n);
				book.setWriter(writer);
				book.setBook_rent(rent);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return book;
	}
	
	public BookVO rentBook(String book_name) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("select no, book_name, writer, book_rent");
		sql.append(" from t_book");
		sql.append(" where book_name = ?");
		
		BookVO book = null;
		try(
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());	
		){
			pstmt.setString(1,book_name);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				int no = rs.getInt("no");
				String book_n = rs.getString("book_name");
				String writer = rs.getString("writer");
				int rent = rs.getInt("book_rent");
				
				book = new BookVO();
				book.setNo(no);
				book.setBook_name(book_n);
				book.setWriter(writer);
				book.setBook_rent(rent);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

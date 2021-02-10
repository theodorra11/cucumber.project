package uni.pu.fmi.services;

import java.util.ArrayList;
import java.util.List;

import uni.pu.fmi.Book;

public class SearchService {

	public static String search(String bookName) {
		
		if(bookName==null) {
			return "Enter a title";
		}
		
		List<Book> books= getBooks();
		boolean isBookExist = books.stream().anyMatch(book-> book.getName().equals(bookName));
		return isBookExist? "Available": "No Results";
	}
	
	public static List<Book> getBooks() {
		Book book = new Book();
		book.setName("Шерлок Холмс");
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(book);
		return books;
		
	}

}

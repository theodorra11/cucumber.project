package uni.pu.fmi;

import java.util.*;

/**
 * 
 */
public class Loan {

	private int id;
	private String clientName;
	private String status;
	private String email;
	private String phoneNumber;
	public Client client;
	public Library library;

	public Set<Book> book = new HashSet<Book>();

	/**
	 * Default constructor
	 */
	public Loan() {
	}

	/**
	 * 
	 */

	/**
	 * 
	 */
	

	/**
	 * @return
	 */
	public String getClientName() {
		
		return clientName;
	}

	/**
	 * @param clientName
	 * @return
	 */
	public void setClientName(String clientName) {
		this.clientName=clientName;

	}

	/**
	 * @return
	 */
	public String getStatus() {
		
		return status;
	}

	/**
	 * @param status
	 * @return
	 */
	public void setStatus(String status) {
		this.status=status;

	}

	/**
	 * 
	 */
	
	

	/**
	 * @return
	 */
	public Set<Book> getBook() {
		
		return book;
	}

	/**
	 * @param books
	 * @return
	 */
	public void setBook(Set<Book> book) {
		this.book=book;

	}

	/**
	 * @return
	 */
	public Library getLibrary() {
		
		return library;
	}

	/**
	 * @param library
	 * @return
	 */
	public void setLibrary(Library library) {
		this.library=library;

	}
	
public String getClientEmail() {
		
		return email;
	}

	
	public void setClientEmail(String email) {
		this.email=email;

	}
	
public String getClientPhoneNumber() {
		
		return phoneNumber;
	}

	
	public void setClientPhoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;

	}
	
	

}
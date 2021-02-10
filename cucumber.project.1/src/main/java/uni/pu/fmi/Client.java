package uni.pu.fmi;

import java.util.*;

/**
 * 
 */
public class Client {

	private String name;
	private String email;
	private String phoneNumber;

	public Set<Loan> loans = new HashSet<Loan>();



	/**
	 * Default constructor
	 */
	public Client() {
	}

	/**
	 * 
	 */

	/**
	 * 
	 */

	public String getName() {
		
		return name;
	}

	/**
	 * @param name
	 * @return
	 */
	public void setName(String name) {
		this.name=name;

	}

	/**
	 * @return
	 */
	public String getEmail() {
		
		return email;
	}

	/**
	 * @param email
	 * @return
	 */
	public void setEmail(String email) {
		this.email = email;

	}

	/**
	 * @return
	 */
	public String getPhoneNumber() {
		
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 * @return
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;

	}

	/**
	 * @return
	 */
	public Set<Loan> getLoans() {
		
		return loans;
	}

	/**
	 * not null instance of {link Set}
	 */

	public void setLoans(Set<Loan> loans) {
		this.loans = loans;
	}

	/**
	 * @param loans not NULL {@link Loan}
	 */
	public void addLoans(Loan loan) {
		loans.add(loan);
	}

}
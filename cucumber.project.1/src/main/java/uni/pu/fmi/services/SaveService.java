package uni.pu.fmi.services;

import java.util.ArrayList;
import java.util.List;
import uni.pu.fmi.Loan;

public class SaveService {

	
	public static String save(String clientName, String email, String phoneNumber) {
		if (clientName == null) {
			return "Въведете правилнo името си";
		}
		
		if (email == null) {
			return "Въведете правлно имейл";
		}
		
		if (phoneNumber == null) {
			return "Въведете правлно телефонен номер";
		}
		
		
		



		
		List<Loan> loans= getLoans();
		boolean loanExist = loans.stream()
				.anyMatch(loan ->
		(loan.getClientName().equals(clientName))
		&& (loan.getClientEmail().equals(email))
        && (loan.getClientPhoneNumber().equals(phoneNumber)));
        
			
		
		
		if(loanExist) {
			return "Успешно запазена книга";
		}
		
		boolean loanClientNameExist = loans.stream()
				.anyMatch(loan -> loan.getClientName().equals(clientName));
		if(!loanClientNameExist) {
			return "Неспешно запазена книга поради грешно въведено име";
		}
		
		boolean loanClientEmailExist = loans.stream()
				.anyMatch(loan -> loan.getClientEmail().equals(email));
		if(!loanClientEmailExist) {
			return "Неспешно запазена книга поради грешно въведен имейл";
		}
		
		boolean loanClientPhoneNumberExist = loans.stream()
				.anyMatch(loan -> loan.getClientPhoneNumber().equals(phoneNumber));
		if(!loanClientPhoneNumberExist) {
			return "Неспешно запазена книга поради грешно въведен телефонен номер";
		}
		
		
		
		return null;
	}
	
	

	public static List<Loan> getLoans(){
		Loan loan = new Loan();
		loan.setClientName("Теодора Пачелийска");
		loan.setClientEmail("pacheliyska@gmail.com");
		loan.setClientPhoneNumber("0895491123");
		ArrayList<Loan> loans = new ArrayList<Loan>();
		loans.add(loan);
		return loans;
	}

}

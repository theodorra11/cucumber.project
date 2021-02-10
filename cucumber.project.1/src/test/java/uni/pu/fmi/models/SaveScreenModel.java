package uni.pu.fmi.models;

import uni.pu.fmi.services.SaveService;

public class SaveScreenModel {
	private String clientName;
	private String email;
	private String phoneNumber;
	private String SuccessMessage;

	public void selectBook() {
		SuccessMessage = SaveService.save(clientName, email, phoneNumber);

	}

	public void addName(final String name) {
		this.clientName = name;

	}

	public void addEmail(final String email) {
		this.email=email;
		
	}

	public void addPhoneNumber(final String number) {
		this.phoneNumber=number;
		
	}

	public String getSuccessMessage() {
		
		return SuccessMessage;
	}

}

package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.models.SaveScreenModel;

public class saveSteps {
	
	SaveScreenModel saveScreen = new SaveScreenModel();
	
	@Given("^Читателят селектира желания резултат\\.$")
	public void selectBook() throws Throwable {
	    saveScreen.selectBook();
	}

	@When("^Въвежда своето име \"([^\"]*)\"$")
	public void addName(final String name) throws Throwable {
	   saveScreen.addName(name);

	}

	@When("^Въвежда своя имейл \"([^\"]*)\"$")
	public void addEmail(final String email) throws Throwable {
		saveScreen.addEmail(email);
	    
	}

	@When("^Въвежда своя телефонен номер \"([^\"]*)\"$")
	public void addNumber(final String number) throws Throwable {
		saveScreen.addPhoneNumber(number);
	}
	
	
	
	@When("^Читателят запазва чрез натискане на бутон\\.$")
	public void selectLoan() throws Throwable {
	    saveScreen.selectBook();
	    
	}

	@Then("^Изписва съобщение \"([^\"]*)\"$")
	public void checkSaveMessage(String SuccessMessage) throws Throwable {
		assertEquals(SuccessMessage, saveScreen.getSuccessMessage());
	    
	}

}

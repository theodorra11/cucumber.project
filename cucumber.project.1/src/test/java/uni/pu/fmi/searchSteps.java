package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.models.SearchScreenModel;

public class searchSteps {
	
	SearchScreenModel searchScreen = new SearchScreenModel();
	
	@Given("^Читателят отваря търсачката\\.$")
	public void openSearchBar() throws Throwable {
	    searchScreen.openSearchBar();
	   
	}

	@When("^Въвежда името на книгата \"([^\"]*)\"$")
	public void addBookName(final String bookName) throws Throwable {
		searchScreen.setBookName(bookName);
	   
	}

	@When("^Стартира търсенето\\.$")
	public void clickSearchButton() throws Throwable {
	    searchScreen.clickSearchButton();
	}

	@Then("^Читателят вижда \"([^\"]*)\"\\.$")
	public void loadResults(String expectedMessage) throws Throwable {
	   assertEquals(expectedMessage, searchScreen.getSearchMessage());
	}
	
	@Given("^Стартира търсенето без въведено заглавие\\.$")
	public void clickSearchButtonWithoutTitle() throws Throwable {
        searchScreen.clickSearchButtonWithoutTitle();

    }
	
	
	
	
	
}
	
	

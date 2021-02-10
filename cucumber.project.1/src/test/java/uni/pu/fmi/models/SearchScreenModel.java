package uni.pu.fmi.models;

import uni.pu.fmi.services.SearchService;

public class SearchScreenModel {

	private String bookName;
	private String message;

	public void openSearchBar() {
        message = SearchService.search(bookName);
    }
		
		
		
	

	public void setBookName(final String bookName) {
		this.bookName=bookName;
		
	}

	public void clickSearchButton() {
		message = SearchService.search(bookName);
		
	}

	public String getSearchMessage() {
		
		return message;
	}

	public void clickSearchButtonWithoutTitle() {
		// TODO Auto-generated method stub
		
	}
	

}

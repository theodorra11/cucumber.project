package uni.pu.fmi;

/**
 * 
 */
public class Library {

	private int libraryId;
	private String name;
	private String address;

	

	/**
	 * Default constructor
	 */
	public Library() {
	}

	/**
	 * 
	 */

	/**
	 * @return
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
	public String getAddress() {
		
		return address;
	}

	/**
	 * @param address
	 * @return
	 */
	public void setAddres(String address) {
		this.address=address;

	}

}
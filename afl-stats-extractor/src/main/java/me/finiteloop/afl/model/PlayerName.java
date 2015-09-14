/**
 * 
 */
package me.finiteloop.afl.model;

/**
 * @author klimaye
 *
 */
public class PlayerName {
	private String givenName;
	private String surname;

	/**
	 * 
	 */
	public PlayerName() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param givenName
	 * @param surname
	 */
	public PlayerName(String givenName, String surname) {
		super();
		this.givenName = givenName;
		this.surname = surname;
	}
	/**
	 * @return the givenName
	 */
	public String getGivenName() {
		return givenName;
	}
	/**
	 * @param givenName the givenName to set
	 */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
}

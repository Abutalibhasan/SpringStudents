package company.beans;

import javax.persistence.Embeddable;

/**
 * Arda Rugji arugji
 *  CIS171
 *  1 April 2020
 */
@Embeddable
public class School {
	private int zipCode;
	private String schoolName;
	/**
	 * 
	 */
	
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param zipCode
	 */
	public School(int zipCode) {
		super();
		this.zipCode = zipCode;
	}
	/**
	 * @param schoolName
	 */
	public School(String schoolName) {
		super();
		this.schoolName = schoolName;
	}
	/**
	 * @param zipCode
	 * @param schoolName
	 */
	public School(int zipCode, String schoolName) {
		super();
		this.zipCode = zipCode;
		this.schoolName = schoolName;
	}
	/**
	 * @return the zipCode
	 */
	public int getzipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setzipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	/**
	 * @return the schoolName
	 */
	public String getschoolName() {
		return schoolName;
	}
	/**
	 * @param schoolName the schoolName to set
	 */
	public void setschoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	@Override
	public String toString() {
		return "School [zipCode=" + zipCode + ", schoolName=" + schoolName + "]";
	}
	
	

}

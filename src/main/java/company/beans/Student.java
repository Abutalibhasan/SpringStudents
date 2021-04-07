package company.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Arda Rugji - arugji
 *  CIS171 
 * Mar 20, 2021
 */
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long studentID;
	private String sName;
	private String sLastName;
	@Autowired
	private School School;

	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the School
	 */
	public School getSchool() {
		return School;
	}
	/**
	 * @param School the School to set
	 */
	public void setSchool(School School) {
		this.School = School;
	}
	/**
	 * @param sName
	 * @param sLastName
	 */
	public Student(String sName, String sLastName) {
		super();
		this.sName = sName;
		this.sLastName = sLastName;
	}
	/**
	 * @param studentID
	 * @param sName
	 * @param sLastName
	 */
	public Student(long studentID, String sName, String sLastName) {
		super();
		this.studentID = studentID;
		this.sName = sName;
		this.sLastName = sLastName;
	}
	
	/**
	 * @return the studentID
	 */
	public long getstudentID() {
		return studentID;
	}
	/**
	 * @param studentID the studentID to set
	 */
	public void setstudentID(long studentID) {
		this.studentID = studentID;
	}
	/**
	 * @return the sName
	 */
	public String getsName() {
		return sName;
	}
	/**
	 * @param sName the sName to set
	 */
	public void setsName(String sName) {
		this.sName = sName;
	}
	/**
	 * @return the sLastName
	 */
	public String getsLastName() {
		return sLastName;
	}
	/**
	 * @param sLastName the sLastName to set
	 */
	public void setsLastName(String sLastName) {
		this.sLastName = sLastName;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", sName=" + sName + ", sLastName=" + sLastName
				+ ", School=" + School + "]";
	}
	

	

}

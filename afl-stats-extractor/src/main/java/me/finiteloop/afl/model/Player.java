/**
 * 
 */
package me.finiteloop.afl.model;

import java.util.Date;
import java.util.List;

/**
 * @author klimaye
 *
 */
public class Player {
	private String name;
	private Date dateOfBirth;
	private int debutWhenYearOld;
	private int debutDayInYear;
	private int height;
	private int weight;

	private List<AnnualRecord> records;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth
	 *            the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the debutWhenYearOld
	 */
	public int getDebutWhenYearOld() {
		return debutWhenYearOld;
	}

	/**
	 * @param debutWhenYearOld
	 *            the debutWhenYearOld to set
	 */
	public void setDebutWhenYearOld(int debutWhenYearOld) {
		this.debutWhenYearOld = debutWhenYearOld;
	}

	/**
	 * @return the debutDayInYear
	 */
	public int getDebutDayInYear() {
		return debutDayInYear;
	}

	/**
	 * @param debutDayInYear
	 *            the debutDayInYear to set
	 */
	public void setDebutDayInYear(int debutDayInYear) {
		this.debutDayInYear = debutDayInYear;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * @return the records
	 */
	public List<AnnualRecord> getRecords() {
		return records;
	}

	/**
	 * @param records
	 *            the records to set
	 */
	public void setRecords(List<AnnualRecord> records) {
		this.records = records;
	}

	/**
	 * 
	 * @param record
	 */
	public void add(AnnualRecord record){
		this.getRecords().add(record);
	}
	
	/**
	 * 
	 * @param record
	 * @return
	 */
	public boolean remove(AnnualRecord record){
		return this.getRecords().remove(record);
	}
}

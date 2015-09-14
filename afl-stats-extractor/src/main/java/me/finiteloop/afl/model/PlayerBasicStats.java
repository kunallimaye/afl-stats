/**
 * 
 */
package me.finiteloop.afl.model;

import java.util.Date;

/**
 * @author klimaye
 *
 */
public class PlayerBasicStats {
	private Date dob;
	private String draftYear;
	private int heightInCm;
	private int weightInKg;
	private String recruitedFrom;
	private String debutYear;

	
	/**
	 * 
	 */
	public PlayerBasicStats() {
	}
	
	/**
	 * @param dob
	 * @param draftYear
	 * @param heightInCm
	 * @param weightInKg
	 * @param recruitedFrom
	 * @param debutYear
	 */
	public PlayerBasicStats(Date dob, String draftYear, int heightInCm,
			int weightInKg, String recruitedFrom, String debutYear) {
		super();
		this.dob = dob;
		this.draftYear = draftYear;
		this.heightInCm = heightInCm;
		this.weightInKg = weightInKg;
		this.recruitedFrom = recruitedFrom;
		this.debutYear = debutYear;
	}


	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	/**
	 * @return the draftYear
	 */
	public String getDraftYear() {
		return draftYear;
	}
	/**
	 * @param draftYear the draftYear to set
	 */
	public void setDraftYear(String draftYear) {
		this.draftYear = draftYear;
	}
	/**
	 * @return the heightInCm
	 */
	public int getHeightInCm() {
		return heightInCm;
	}
	/**
	 * @param heightInCm the heightInCm to set
	 */
	public void setHeightInCm(int heightInCm) {
		this.heightInCm = heightInCm;
	}
	/**
	 * @return the weightInKg
	 */
	public int getWeightInKg() {
		return weightInKg;
	}
	/**
	 * @param weightInKg the weightInKg to set
	 */
	public void setWeightInKg(int weightInKg) {
		this.weightInKg = weightInKg;
	}
	/**
	 * @return the recruitedFrom
	 */
	public String getRecruitedFrom() {
		return recruitedFrom;
	}
	/**
	 * @param recruitedFrom the recruitedFrom to set
	 */
	public void setRecruitedFrom(String recruitedFrom) {
		this.recruitedFrom = recruitedFrom;
	}
	/**
	 * @return the debutYear
	 */
	public String getDebutYear() {
		return debutYear;
	}
	/**
	 * @param debutYear the debutYear to set
	 */
	public void setDebutYear(String debutYear) {
		this.debutYear = debutYear;
	}
	
}

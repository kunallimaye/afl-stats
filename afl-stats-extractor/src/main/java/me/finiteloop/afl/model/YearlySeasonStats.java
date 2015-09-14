package me.finiteloop.afl.model;

public class YearlySeasonStats {

	private String year;
	private String seasonId;
	private PlayerTotalAndAverages totalsAndAverages;
	/**
	 * 
	 */
	public YearlySeasonStats() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param year
	 * @param seasonId
	 * @param totalsAndAverages
	 */
	public YearlySeasonStats(String year, String seasonId,
			PlayerTotalAndAverages totalsAndAverages) {
		super();
		this.year = year;
		this.seasonId = seasonId;
		this.totalsAndAverages = totalsAndAverages;
	}
	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	/**
	 * @return the seasonId
	 */
	public String getSeasonId() {
		return seasonId;
	}
	/**
	 * @param seasonId the seasonId to set
	 */
	public void setSeasonId(String seasonId) {
		this.seasonId = seasonId;
	}
	/**
	 * @return the totalsAndAverages
	 */
	public PlayerTotalAndAverages getTotalsAndAverages() {
		return totalsAndAverages;
	}
	/**
	 * @param totalsAndAverages the totalsAndAverages to set
	 */
	public void setTotalsAndAverages(PlayerTotalAndAverages totalsAndAverages) {
		this.totalsAndAverages = totalsAndAverages;
	}
	
}

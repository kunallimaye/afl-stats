/**
 * 
 */
package me.finiteloop.afl.model;

/**
 * @author klimaye
 *
 */
public class PlayerTotalAndAverages {
	private PlayerSeasonStats averages;
	private PlayerSeasonStats totals;

	/**
	 * 
	 */
	public PlayerTotalAndAverages() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param averages
	 * @param totals
	 */
	public PlayerTotalAndAverages(PlayerSeasonStats averages,
			PlayerSeasonStats totals) {
		super();
		this.averages = averages;
		this.totals = totals;
	}
	/**
	 * @return the averages
	 */
	public PlayerSeasonStats getAverages() {
		return averages;
	}
	/**
	 * @param averages the averages to set
	 */
	public void setAverages(PlayerSeasonStats averages) {
		this.averages = averages;
	}
	/**
	 * @return the totals
	 */
	public PlayerSeasonStats getTotals() {
		return totals;
	}
	/**
	 * @param totals the totals to set
	 */
	public void setTotals(PlayerSeasonStats totals) {
		this.totals = totals;
	}
	
}

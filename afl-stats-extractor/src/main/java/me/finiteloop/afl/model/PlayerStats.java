/**
 * 
 */
package me.finiteloop.afl.model;

/**
 * @author klimaye
 *
 */
public class PlayerStats {
	private int centreClearances;
	private int stoppageClearances;
	private int totalClearances;
	
	
	/**
	 * @param centreClearances
	 * @param stoppageClearances
	 * @param totalClearances
	 */
	public PlayerStats(int centreClearances, int stoppageClearances,
			int totalClearances) {
		super();
		this.centreClearances = centreClearances;
		this.stoppageClearances = stoppageClearances;
		this.totalClearances = totalClearances;
	}
	/**
	 * 
	 */
	public PlayerStats() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the centreClearances
	 */
	public int getCentreClearances() {
		return centreClearances;
	}
	/**
	 * @param centreClearances the centreClearances to set
	 */
	public void setCentreClearances(int centreClearances) {
		this.centreClearances = centreClearances;
	}
	/**
	 * @return the stoppageClearances
	 */
	public int getStoppageClearances() {
		return stoppageClearances;
	}
	/**
	 * @param stoppageClearances the stoppageClearances to set
	 */
	public void setStoppageClearances(int stoppageClearances) {
		this.stoppageClearances = stoppageClearances;
	}
	/**
	 * @return the totalClearances
	 */
	public int getTotalClearances() {
		return totalClearances;
	}
	/**
	 * @param totalClearances the totalClearances to set
	 */
	public void setTotalClearances(int totalClearances) {
		this.totalClearances = totalClearances;
	}
	
	
}

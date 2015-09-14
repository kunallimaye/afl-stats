/**
 * 
 */
package me.finiteloop.afl.model;

/**
 * @author klimaye
 *
 */
public class PlayerSeasonStats {
	private PlayerStats stats;
	private PlayerInfoDuringSeason player;
	private String teamId;
	private int gamesPlayed;
	private int timeOnGroundPercentage;
	/**
	 * 
	 */
	public PlayerSeasonStats() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param stats
	 * @param player
	 * @param teamId
	 * @param gamesPlayed
	 * @param timeOnGroundPercentage
	 */
	public PlayerSeasonStats(PlayerStats stats, PlayerInfoDuringSeason player,
			String teamId, int gamesPlayed, int timeOnGroundPercentage) {
		super();
		this.stats = stats;
		this.player = player;
		this.teamId = teamId;
		this.gamesPlayed = gamesPlayed;
		this.timeOnGroundPercentage = timeOnGroundPercentage;
	}
	/**
	 * @return the stats
	 */
	public PlayerStats getStats() {
		return stats;
	}
	/**
	 * @param stats the stats to set
	 */
	public void setStats(PlayerStats stats) {
		this.stats = stats;
	}
	/**
	 * @return the player
	 */
	public PlayerInfoDuringSeason getPlayer() {
		return player;
	}
	/**
	 * @param player the player to set
	 */
	public void setPlayer(PlayerInfoDuringSeason player) {
		this.player = player;
	}
	/**
	 * @return the teamId
	 */
	public String getTeamId() {
		return teamId;
	}
	/**
	 * @param teamId the teamId to set
	 */
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	/**
	 * @return the gamesPlayed
	 */
	public int getGamesPlayed() {
		return gamesPlayed;
	}
	/**
	 * @param gamesPlayed the gamesPlayed to set
	 */
	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}
	/**
	 * @return the timeOnGroundPercentage
	 */
	public int getTimeOnGroundPercentage() {
		return timeOnGroundPercentage;
	}
	/**
	 * @param timeOnGroundPercentage the timeOnGroundPercentage to set
	 */
	public void setTimeOnGroundPercentage(int timeOnGroundPercentage) {
		this.timeOnGroundPercentage = timeOnGroundPercentage;
	}
	
}

/**
 * 
 */
package me.finiteloop.afl.model;

/**
 * @author klimaye
 *
 */
public class PlayerInfoDuringSeason {
	private String playerId;
	private PlayerName playerName;
	private boolean captain;
	private int playerJumperNumber;
	
	
	/**
	 * 
	 */
	public PlayerInfoDuringSeason() {
	}
	
	/**
	 * @param playerId
	 * @param playerName
	 * @param captain
	 * @param playerJumperNumber
	 */
	public PlayerInfoDuringSeason(String playerId, PlayerName playerName,
			boolean captain, int playerJumperNumber) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.captain = captain;
		this.playerJumperNumber = playerJumperNumber;
	}
	/**
	 * @return the playerId
	 */
	public String getPlayerId() {
		return playerId;
	}
	/**
	 * @param playerId the playerId to set
	 */
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	/**
	 * @return the playerName
	 */
	public PlayerName getPlayerName() {
		return playerName;
	}
	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(PlayerName playerName) {
		this.playerName = playerName;
	}
	/**
	 * @return the captain
	 */
	public boolean isCaptain() {
		return captain;
	}
	/**
	 * @param captain the captain to set
	 */
	public void setCaptain(boolean captain) {
		this.captain = captain;
	}
	/**
	 * @return the playerJumperNumber
	 */
	public int getPlayerJumperNumber() {
		return playerJumperNumber;
	}
	/**
	 * @param playerJumperNumber the playerJumperNumber to set
	 */
	public void setPlayerJumperNumber(int playerJumperNumber) {
		this.playerJumperNumber = playerJumperNumber;
	}
	
	
}

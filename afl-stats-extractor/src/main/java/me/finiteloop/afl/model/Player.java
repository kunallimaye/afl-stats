/**
 * 
 */
package me.finiteloop.afl.model;


/**
 * @author klimaye
 *
 */
public class Player {
	private String id;
	private String position;
	private int jumperNumber;
	private String milestones;
	private PlayerCareerStats careerAverages;
	private String firstName;
	private String bio;
	private String photoUrl;
	private String aflAwards;
	private String clubAwards;
	private String qa;
	private String sponsor;
	private PlayerBasicStats basicStats;
	private PlayerCareerStats careerStats;
	private PlayerSeasonStats[] yearlySeasonStats;
	private PlayerCareerStats seasonStats;
	private int latestPlayerRating;
	private int careerGamesPlayed;
	/**
	 * 
	 */
	public Player() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param position
	 * @param jumperNumber
	 * @param milestones
	 * @param careerAverages
	 * @param firstName
	 * @param bio
	 * @param photoUrl
	 * @param aflAwards
	 * @param clubAwards
	 * @param qa
	 * @param sponsor
	 * @param basicStats
	 * @param careerStats
	 * @param yearlySeasonStats
	 * @param seasonStats
	 * @param latestPlayerRating
	 * @param careerGamesPlayed
	 */
	public Player(String id, String position, int jumperNumber,
			String milestones, PlayerCareerStats careerAverages,
			String firstName, String bio, String photoUrl, String aflAwards,
			String clubAwards, String qa, String sponsor,
			PlayerBasicStats basicStats, PlayerCareerStats careerStats,
			PlayerSeasonStats[] yearlySeasonStats,
			PlayerCareerStats seasonStats, int latestPlayerRating,
			int careerGamesPlayed) {
		this.id = id;
		this.position = position;
		this.jumperNumber = jumperNumber;
		this.milestones = milestones;
		this.careerAverages = careerAverages;
		this.firstName = firstName;
		this.bio = bio;
		this.photoUrl = photoUrl;
		this.aflAwards = aflAwards;
		this.clubAwards = clubAwards;
		this.qa = qa;
		this.sponsor = sponsor;
		this.basicStats = basicStats;
		this.careerStats = careerStats;
		this.yearlySeasonStats = yearlySeasonStats;
		this.seasonStats = seasonStats;
		this.latestPlayerRating = latestPlayerRating;
		this.careerGamesPlayed = careerGamesPlayed;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	/**
	 * @return the jumperNumber
	 */
	public int getJumperNumber() {
		return jumperNumber;
	}
	/**
	 * @param jumperNumber the jumperNumber to set
	 */
	public void setJumperNumber(int jumperNumber) {
		this.jumperNumber = jumperNumber;
	}
	/**
	 * @return the milestones
	 */
	public String getMilestones() {
		return milestones;
	}
	/**
	 * @param milestones the milestones to set
	 */
	public void setMilestones(String milestones) {
		this.milestones = milestones;
	}
	/**
	 * @return the careerAverages
	 */
	public PlayerCareerStats getCareerAverages() {
		return careerAverages;
	}
	/**
	 * @param careerAverages the careerAverages to set
	 */
	public void setCareerAverages(PlayerCareerStats careerAverages) {
		this.careerAverages = careerAverages;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the bio
	 */
	public String getBio() {
		return bio;
	}
	/**
	 * @param bio the bio to set
	 */
	public void setBio(String bio) {
		this.bio = bio;
	}
	/**
	 * @return the photoUrl
	 */
	public String getPhotoUrl() {
		return photoUrl;
	}
	/**
	 * @param photoUrl the photoUrl to set
	 */
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	/**
	 * @return the aflAwards
	 */
	public String getAflAwards() {
		return aflAwards;
	}
	/**
	 * @param aflAwards the aflAwards to set
	 */
	public void setAflAwards(String aflAwards) {
		this.aflAwards = aflAwards;
	}
	/**
	 * @return the clubAwards
	 */
	public String getClubAwards() {
		return clubAwards;
	}
	/**
	 * @param clubAwards the clubAwards to set
	 */
	public void setClubAwards(String clubAwards) {
		this.clubAwards = clubAwards;
	}
	/**
	 * @return the qa
	 */
	public String getQa() {
		return qa;
	}
	/**
	 * @param qa the qa to set
	 */
	public void setQa(String qa) {
		this.qa = qa;
	}
	/**
	 * @return the sponsor
	 */
	public String getSponsor() {
		return sponsor;
	}
	/**
	 * @param sponsor the sponsor to set
	 */
	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}
	/**
	 * @return the basicStats
	 */
	public PlayerBasicStats getBasicStats() {
		return basicStats;
	}
	/**
	 * @param basicStats the basicStats to set
	 */
	public void setBasicStats(PlayerBasicStats basicStats) {
		this.basicStats = basicStats;
	}
	/**
	 * @return the careerStats
	 */
	public PlayerCareerStats getCareerStats() {
		return careerStats;
	}
	/**
	 * @param careerStats the careerStats to set
	 */
	public void setCareerStats(PlayerCareerStats careerStats) {
		this.careerStats = careerStats;
	}
	/**
	 * @return the yearlySeasonStats
	 */
	public PlayerSeasonStats[] getYearlySeasonStats() {
		return yearlySeasonStats;
	}
	/**
	 * @param yearlySeasonStats the yearlySeasonStats to set
	 */
	public void setYearlySeasonStats(PlayerSeasonStats[] yearlySeasonStats) {
		this.yearlySeasonStats = yearlySeasonStats;
	}
	/**
	 * @return the seasonStats
	 */
	public PlayerCareerStats getSeasonStats() {
		return seasonStats;
	}
	/**
	 * @param seasonStats the seasonStats to set
	 */
	public void setSeasonStats(PlayerCareerStats seasonStats) {
		this.seasonStats = seasonStats;
	}
	/**
	 * @return the latestPlayerRating
	 */
	public int getLatestPlayerRating() {
		return latestPlayerRating;
	}
	/**
	 * @param latestPlayerRating the latestPlayerRating to set
	 */
	public void setLatestPlayerRating(int latestPlayerRating) {
		this.latestPlayerRating = latestPlayerRating;
	}
	/**
	 * @return the careerGamesPlayed
	 */
	public int getCareerGamesPlayed() {
		return careerGamesPlayed;
	}
	/**
	 * @param careerGamesPlayed the careerGamesPlayed to set
	 */
	public void setCareerGamesPlayed(int careerGamesPlayed) {
		this.careerGamesPlayed = careerGamesPlayed;
	}
	
}

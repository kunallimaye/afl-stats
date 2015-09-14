/**
 * 
 */
package me.finiteloop.afl.model;

/**
 * @author klimaye
 *
 */
public class PlayerCareerStats {
	private int goals;
	private int behinds;
	private int superGoals;
	private int kicks;
	private int handballs;
	private int disposals;
	private int marks;
	private int bounces;
	private int tackles;
	private int contestedPossessions;
	private int unContestedPossessions;
	private int totalPossessions;
	private int inside50s;
	private int marksInside50;
	private int contestedMarks;
	private int hitouts;
	private int onePercenters;
	private int disposalEfficiency;
	private int clangers;
	private int freeFors;
	private int freeAgainst;
	private int dreamTeamPoints;
	private PlayerStats clearances;
	private int rebound50s;
	private int goalAssists;
	private int goalAccuracy;
	private int ratingPoints;
	private int ranking;
	private int interchangeCounts;

	/**
	 * 
	 */
	public PlayerCareerStats() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param goals
	 * @param behinds
	 * @param superGoals
	 * @param kicks
	 * @param handballs
	 * @param disposals
	 * @param marks
	 * @param bounces
	 * @param tackles
	 * @param contestedPossessions
	 * @param unContestedPossessions
	 * @param totalPossessions
	 * @param inside50s
	 * @param marksInside50
	 * @param contestedMarks
	 * @param hitouts
	 * @param onePercenters
	 * @param disposalEfficiency
	 * @param clangers
	 * @param freeFors
	 * @param freeAgainst
	 * @param dreamTeamPoints
	 * @param clearances
	 * @param rebound50s
	 * @param goalAssists
	 * @param goalAccuracy
	 * @param ratingPoints
	 * @param ranking
	 * @param interchangeCounts
	 */
	public PlayerCareerStats(int goals, int behinds, int superGoals, int kicks,
			int handballs, int disposals, int marks, int bounces, int tackles,
			int contestedPossessions, int unContestedPossessions,
			int totalPossessions, int inside50s, int marksInside50,
			int contestedMarks, int hitouts, int onePercenters,
			int disposalEfficiency, int clangers, int freeFors,
			int freeAgainst, int dreamTeamPoints,
			PlayerStats clearances, int rebound50s, int goalAssists,
			int goalAccuracy, int ratingPoints, int ranking,
			int interchangeCounts) {
		super();
		this.goals = goals;
		this.behinds = behinds;
		this.superGoals = superGoals;
		this.kicks = kicks;
		this.handballs = handballs;
		this.disposals = disposals;
		this.marks = marks;
		this.bounces = bounces;
		this.tackles = tackles;
		this.contestedPossessions = contestedPossessions;
		this.unContestedPossessions = unContestedPossessions;
		this.totalPossessions = totalPossessions;
		this.inside50s = inside50s;
		this.marksInside50 = marksInside50;
		this.contestedMarks = contestedMarks;
		this.hitouts = hitouts;
		this.onePercenters = onePercenters;
		this.disposalEfficiency = disposalEfficiency;
		this.clangers = clangers;
		this.freeFors = freeFors;
		this.freeAgainst = freeAgainst;
		this.dreamTeamPoints = dreamTeamPoints;
		this.clearances = clearances;
		this.rebound50s = rebound50s;
		this.goalAssists = goalAssists;
		this.goalAccuracy = goalAccuracy;
		this.ratingPoints = ratingPoints;
		this.ranking = ranking;
		this.interchangeCounts = interchangeCounts;
	}
	/**
	 * @return the goals
	 */
	public int getGoals() {
		return goals;
	}
	/**
	 * @param goals the goals to set
	 */
	public void setGoals(int goals) {
		this.goals = goals;
	}
	/**
	 * @return the behinds
	 */
	public int getBehinds() {
		return behinds;
	}
	/**
	 * @param behinds the behinds to set
	 */
	public void setBehinds(int behinds) {
		this.behinds = behinds;
	}
	/**
	 * @return the superGoals
	 */
	public int getSuperGoals() {
		return superGoals;
	}
	/**
	 * @param superGoals the superGoals to set
	 */
	public void setSuperGoals(int superGoals) {
		this.superGoals = superGoals;
	}
	/**
	 * @return the kicks
	 */
	public int getKicks() {
		return kicks;
	}
	/**
	 * @param kicks the kicks to set
	 */
	public void setKicks(int kicks) {
		this.kicks = kicks;
	}
	/**
	 * @return the handballs
	 */
	public int getHandballs() {
		return handballs;
	}
	/**
	 * @param handballs the handballs to set
	 */
	public void setHandballs(int handballs) {
		this.handballs = handballs;
	}
	/**
	 * @return the disposals
	 */
	public int getDisposals() {
		return disposals;
	}
	/**
	 * @param disposals the disposals to set
	 */
	public void setDisposals(int disposals) {
		this.disposals = disposals;
	}
	/**
	 * @return the marks
	 */
	public int getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}
	/**
	 * @return the bounces
	 */
	public int getBounces() {
		return bounces;
	}
	/**
	 * @param bounces the bounces to set
	 */
	public void setBounces(int bounces) {
		this.bounces = bounces;
	}
	/**
	 * @return the tackles
	 */
	public int getTackles() {
		return tackles;
	}
	/**
	 * @param tackles the tackles to set
	 */
	public void setTackles(int tackles) {
		this.tackles = tackles;
	}
	/**
	 * @return the contestedPossessions
	 */
	public int getContestedPossessions() {
		return contestedPossessions;
	}
	/**
	 * @param contestedPossessions the contestedPossessions to set
	 */
	public void setContestedPossessions(int contestedPossessions) {
		this.contestedPossessions = contestedPossessions;
	}
	/**
	 * @return the unContestedPossessions
	 */
	public int getUnContestedPossessions() {
		return unContestedPossessions;
	}
	/**
	 * @param unContestedPossessions the unContestedPossessions to set
	 */
	public void setUnContestedPossessions(int unContestedPossessions) {
		this.unContestedPossessions = unContestedPossessions;
	}
	/**
	 * @return the totalPossessions
	 */
	public int getTotalPossessions() {
		return totalPossessions;
	}
	/**
	 * @param totalPossessions the totalPossessions to set
	 */
	public void setTotalPossessions(int totalPossessions) {
		this.totalPossessions = totalPossessions;
	}
	/**
	 * @return the inside50s
	 */
	public int getInside50s() {
		return inside50s;
	}
	/**
	 * @param inside50s the inside50s to set
	 */
	public void setInside50s(int inside50s) {
		this.inside50s = inside50s;
	}
	/**
	 * @return the marksInside50
	 */
	public int getMarksInside50() {
		return marksInside50;
	}
	/**
	 * @param marksInside50 the marksInside50 to set
	 */
	public void setMarksInside50(int marksInside50) {
		this.marksInside50 = marksInside50;
	}
	/**
	 * @return the contestedMarks
	 */
	public int getContestedMarks() {
		return contestedMarks;
	}
	/**
	 * @param contestedMarks the contestedMarks to set
	 */
	public void setContestedMarks(int contestedMarks) {
		this.contestedMarks = contestedMarks;
	}
	/**
	 * @return the hitouts
	 */
	public int getHitouts() {
		return hitouts;
	}
	/**
	 * @param hitouts the hitouts to set
	 */
	public void setHitouts(int hitouts) {
		this.hitouts = hitouts;
	}
	/**
	 * @return the onePercenters
	 */
	public int getOnePercenters() {
		return onePercenters;
	}
	/**
	 * @param onePercenters the onePercenters to set
	 */
	public void setOnePercenters(int onePercenters) {
		this.onePercenters = onePercenters;
	}
	/**
	 * @return the disposalEfficiency
	 */
	public int getDisposalEfficiency() {
		return disposalEfficiency;
	}
	/**
	 * @param disposalEfficiency the disposalEfficiency to set
	 */
	public void setDisposalEfficiency(int disposalEfficiency) {
		this.disposalEfficiency = disposalEfficiency;
	}
	/**
	 * @return the clangers
	 */
	public int getClangers() {
		return clangers;
	}
	/**
	 * @param clangers the clangers to set
	 */
	public void setClangers(int clangers) {
		this.clangers = clangers;
	}
	/**
	 * @return the freeFors
	 */
	public int getFreeFors() {
		return freeFors;
	}
	/**
	 * @param freeFors the freeFors to set
	 */
	public void setFreeFors(int freeFors) {
		this.freeFors = freeFors;
	}
	/**
	 * @return the freeAgainst
	 */
	public int getFreeAgainst() {
		return freeAgainst;
	}
	/**
	 * @param freeAgainst the freeAgainst to set
	 */
	public void setFreeAgainst(int freeAgainst) {
		this.freeAgainst = freeAgainst;
	}
	/**
	 * @return the dreamTeamPoints
	 */
	public int getDreamTeamPoints() {
		return dreamTeamPoints;
	}
	/**
	 * @param dreamTeamPoints the dreamTeamPoints to set
	 */
	public void setDreamTeamPoints(int dreamTeamPoints) {
		this.dreamTeamPoints = dreamTeamPoints;
	}
	/**
	 * @return the clearances
	 */
	public PlayerStats getClearances() {
		return clearances;
	}
	/**
	 * @param clearances the clearances to set
	 */
	public void setClearances(PlayerStats clearances) {
		this.clearances = clearances;
	}
	/**
	 * @return the rebound50s
	 */
	public int getRebound50s() {
		return rebound50s;
	}
	/**
	 * @param rebound50s the rebound50s to set
	 */
	public void setRebound50s(int rebound50s) {
		this.rebound50s = rebound50s;
	}
	/**
	 * @return the goalAssists
	 */
	public int getGoalAssists() {
		return goalAssists;
	}
	/**
	 * @param goalAssists the goalAssists to set
	 */
	public void setGoalAssists(int goalAssists) {
		this.goalAssists = goalAssists;
	}
	/**
	 * @return the goalAccuracy
	 */
	public int getGoalAccuracy() {
		return goalAccuracy;
	}
	/**
	 * @param goalAccuracy the goalAccuracy to set
	 */
	public void setGoalAccuracy(int goalAccuracy) {
		this.goalAccuracy = goalAccuracy;
	}
	/**
	 * @return the ratingPoints
	 */
	public int getRatingPoints() {
		return ratingPoints;
	}
	/**
	 * @param ratingPoints the ratingPoints to set
	 */
	public void setRatingPoints(int ratingPoints) {
		this.ratingPoints = ratingPoints;
	}
	/**
	 * @return the ranking
	 */
	public int getRanking() {
		return ranking;
	}
	/**
	 * @param ranking the ranking to set
	 */
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	/**
	 * @return the interchangeCounts
	 */
	public int getInterchangeCounts() {
		return interchangeCounts;
	}
	/**
	 * @param interchangeCounts the interchangeCounts to set
	 */
	public void setInterchangeCounts(int interchangeCounts) {
		this.interchangeCounts = interchangeCounts;
	}
	
}

/**
 * 
 */
package me.finiteloop.afl.constants;

/**
 * @author klimaye
 *
 */
public enum HTMLColumnHeaders {

	Year("Year"),
	TM("Team"),
	JUMPER("Jumper"),
	GM("Games"),
	Win("Wins"),
	Draw("Draws"),
	Loss("Losses"),
	KI("Kicks"),
	MK("Marks"),
	HB("Handballs"),
	DI("Disposals"),
	GL("Goals"),
	BH("Behinds"),
	HO("Hit Outs"),
	TK("Tackles"),
	RB("Rebound 50s"),
	IF("Inside 50s"),
	CL("Clearences"),
	CG("Clangers"),
	FF("Freekicks For"),
	FA("Freekicks Against"),
	BR("Brownlow Votes"),
	CP("Contested possessions"),
	UP("Uncontested possessions"),
	CM("Contested marks"),
	MI("Marks inside 50"),
	OneP("One precenters"),
	BO("Bounces"),
	GA("Goal assists"),
	SU("Substitute");
	
	private final String value;
	
	private HTMLColumnHeaders(final String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
	
	@Override
	public String toString(){
		return this.getValue();
	}
	
}

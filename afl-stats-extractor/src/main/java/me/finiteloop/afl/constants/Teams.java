/**
 * 
 */
package me.finiteloop.afl.constants;

/**
 * @author klimaye
 *
 */
public enum Teams {
	
	GE("Geelong"),
	ME("Melbourne"),
	ES("Essendon"),
	CW("Collingwood"),
	CA("Carlton"),
	SM("South Melbourne"),
	FI("Fitzroy"),
	SK("St Kilda"),
	HA("Hawthorn"),
	FO("Footscray"),
	RI("Richmond");
	
	private final String value;
	
	private Teams(String value){
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

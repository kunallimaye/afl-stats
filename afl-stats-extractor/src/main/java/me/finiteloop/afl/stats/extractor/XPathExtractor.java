/**
 * 
 */
package me.finiteloop.afl.stats.extractor;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.apache.camel.builder.xml.XPathBuilder;

import me.finiteloop.afl.model.Player;

/**
 * @author klimaye
 *
 */
public class XPathExtractor {

	private static final Logger logger = Logger.getLogger(XPathExtractor.class.getCanonicalName());
	/**
	 * 
	 */
	public XPathExtractor(){
		
	}
	
	public List<Player> convertToPlayerInformation(String body){
		List<Player> players = new ArrayList<Player>();
		XPathBuilder values = XPathBuilder.xpath("/tbody/tr/td");
		//values.
		return players;
	}
}

/**
 * 
 */
package me.finiteloop.afl.stats.extractor;

import java.util.logging.Logger;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.main.Main;
import org.apache.camel.builder.RouteBuilder;

/**
 * @author klimaye
 *
 */
public class ExtractRoute extends RouteBuilder {

	private static final Logger logger = Logger.getLogger(ExtractRoute.class.getCanonicalName());
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		new ExtractRoute().boot();
	}

	public void boot() throws Exception{
		Main main = new Main();
		main.enableHangupSupport();
		main.addRouteBuilder(new ExtractRoute());
		logger.info("Starting Camel....");
		main.run();
	}
	
	@Override
	public void configure() throws Exception {
		from("file:src/data/?noop=true")
		.unmarshal().tidyMarkup()
		//.transform()
		.split()
			.xpath("//table/tbody/tr/td/a/@href")
				.recipientList(simple("http4://afltables.com/afl/stats/${in.body}"))
//		.process(new Processor() {
//			
//			@Override
//			public void process(Exchange exchange) throws Exception {
//				exchange.getIn().getBody();
//				
//			}
//		})
			.log("${body}");
		
	}

}

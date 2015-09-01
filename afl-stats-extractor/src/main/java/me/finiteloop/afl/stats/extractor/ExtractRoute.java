/**
 * 
 */
package me.finiteloop.afl.stats.extractor;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * @author klimaye
 *
 */
public class ExtractRoute extends RouteBuilder {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		CamelContext context = new DefaultCamelContext();
		context.addRoutes(new ExtractRoute());
		context.start();
	}

	@Override
	public void configure() throws Exception {
		from("file:src/data/?noop=true")
		//.to("file:target/new");
			.log("Read the file");
		
	}

}

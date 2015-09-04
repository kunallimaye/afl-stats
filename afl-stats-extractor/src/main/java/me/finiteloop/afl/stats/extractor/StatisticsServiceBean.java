/**
 * 
 */
package me.finiteloop.afl.stats.extractor;

import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.builder.RouteBuilder;

/**
 * @author klimaye
 *
 */
@Stateless
//@WebService(serviceName = "statistics")
@Path("/statistics")
public class StatisticsServiceBean{

	private static final Logger logger = Logger
			.getLogger(StatisticsServiceBean.class.getCanonicalName());

	@GET
	@Path("/season/{year:[0-9][0-9][0-9][0-9]}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCompetition(@PathParam("year") String year){
		Response.ResponseBuilder responseBuilder = null;
		final String fromEndpoint = "direct:getseason";
		CamelContext context = new DefaultCamelContext();
		try {
			context.addRoutes(new RouteBuilder() {

				@Override
				public void configure() throws Exception {
					from(fromEndpoint)
						.setHeader("X-media-mis-token",
								//TODO: Work out a way to get this value auto-magically with a call to afl.com.au
								// At the moment we have to manually inspect headers to extract this value
							constant("ef65e0c7bd2946c03174e3ab7a018cd1"))
						.recipientList(
							simple("http4:www.afl.com.au/api/cfs/afl/season?seasonId=CD_S${body}014"))
							// URL for a season
							// http://www.afl.com.au/api/cfs/afl/season?seasonId=CD_S2014014
							// URL for a player
							// http4:www.afl.com.au/api/cfs/afl/statsCentre/players?competitionId=CD_S${body}014
						;

				}
			});
			context.start();
	
			ProducerTemplate producer = context.createProducerTemplate();
			String res = (String) producer.requestBody(fromEndpoint, year, String.class);
			
			logger.info(res);
			context.stop();
			responseBuilder = Response.status(Response.Status.OK).entity(res);
			
		} catch (Exception e) {
			e.printStackTrace();
			responseBuilder = Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage());
		}
		
		return responseBuilder.build();
	}
	
	@GET
	@Path("/players/{year:[0-9][0-9][0-9][0-9]}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPlayersInYear(@PathParam("year") String year){
		Response.ResponseBuilder responseBuilder = null;
		final String fromEndpoint = "direct:getPlayerBySeason";
		CamelContext context = new DefaultCamelContext();
		try {
			context.addRoutes(new RouteBuilder() {

				@Override
				public void configure() throws Exception {
					from(fromEndpoint)
						.setHeader("X-media-mis-token",
								//TODO: Work out a way to get this value auto-magically with a call to afl.com.au
								// At the moment we have to manually inspect headers to extract this value
							constant("ef65e0c7bd2946c03174e3ab7a018cd1"))
						.recipientList(
							simple("http4:www.afl.com.au/api/cfs/afl/statsCentre/players?competitionId=CD_S${body}014"))
							// URL for a season
							// http://www.afl.com.au/api/cfs/afl/season?seasonId=CD_S2014014
							// URL for a player
							// http4:www.afl.com.au/api/cfs/afl/statsCentre/players?competitionId=CD_S${body}014
						;

				}
			});
			context.start();
	
			ProducerTemplate producer = context.createProducerTemplate();
			String res = (String) producer.requestBody(fromEndpoint, year, String.class);
			
			logger.info(res);
			context.stop();
			responseBuilder = Response.status(Response.Status.OK).entity(res);
			
		} catch (Exception e) {
			e.printStackTrace();
			responseBuilder = Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage());
		}
		
		return responseBuilder.build();
	}
}

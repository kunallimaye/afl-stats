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
import org.apache.camel.Exchange;
import org.apache.camel.Main;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.http4.HttpMethods;

/**
 * @author klimaye
 *
 */
@Stateless
@Path("/statistics")
public class StatisticsServiceBean{

	private static final Logger logger = Logger
			.getLogger(StatisticsServiceBean.class.getCanonicalName());
	
	private String getToken()
		throws Exception{
		
		String token = "";
		final String fromEndpoint = "direct:gettoken";
		CamelContext context = new DefaultCamelContext();
			context.addRoutes(new RouteBuilder() {

			@Override
			public void configure() throws Exception {
				from(fromEndpoint)
					.setHeader(Exchange.HTTP_METHOD, constant(HttpMethods.POST))
					.to("http4:www.afl.com.au/api/cfs/afl/WMCTok")
					.transform().jsonpath("token", String.class)
					;

			}
		});
		context.start();

		ProducerTemplate producer = context.createProducerTemplate();
		token = (String) producer.requestBody(fromEndpoint, "'token'", String.class);
		
		logger.info(token);
		context.stop();
		return token;
			
	}

	@GET
	@Path("load-data")
	public Response loadData(){
		Response.ResponseBuilder responseBuilder = null;
		final String fromEndpoint = "direct:loadData";
		CamelContext context = new DefaultCamelContext();
		try {
			context.addRoutes(new RouteBuilder() {
				@Override
				public void configure() throws Exception {
					from(fromEndpoint)
						.recipientList(
							simple("http4:www.afl.com.au/api/cfs/afl/season?seasonId=CD_S${body}014"))
						;

				}
			});
			context.start();
	
			ProducerTemplate producer = context.createProducerTemplate();
			String res = (String) producer.requestBody(fromEndpoint, "", String.class);
			
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
	@Path("/season/{year:[0-9][0-9][0-9][0-9]}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCompetition(@PathParam("year") String year){
		Response.ResponseBuilder responseBuilder = null;
		final String fromEndpoint = "direct:getseason";
		CamelContext context = new DefaultCamelContext();
		try {
			final String token = this.getToken();
			context.addRoutes(new RouteBuilder() {

				@Override
				public void configure() throws Exception {
					from(fromEndpoint)
						.setHeader(Exchange.HTTP_METHOD, constant(HttpMethods.GET))
						.setHeader("X-media-mis-token",
							constant(token))
						.recipientList(
							simple("http4:www.afl.com.au/api/cfs/afl/season?seasonId=CD_S${body}014"))
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
	
	/*
	 * Example URL
	 * Player profile for Dustin Fletcher
	 * http://www.afl.com.au/api/cfs/afl/playerProfile/CD_I960197	
	 */
	@GET
	@Path("/player-profile/{playerId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPlayerProfile(@PathParam("playerId") String playerId){
		Response.ResponseBuilder responseBuilder = null;
		final String fromEndpoint = "direct:getPlayerProfile";
		CamelContext context = new DefaultCamelContext();
		try {
			final String token = this.getToken();
			context.addRoutes(new RouteBuilder() {

				@Override
				public void configure() throws Exception {
					from(fromEndpoint)
					.setHeader(Exchange.HTTP_METHOD, constant(HttpMethods.GET))
					.setHeader("X-media-mis-token",
						constant(token))
					.recipientList(
						simple("http4:www.afl.com.au/api/cfs/afl/playerProfile/${body}")
						)
					;

				}
			});
			context.start();
	
			ProducerTemplate producer = context.createProducerTemplate();
			String res = (String) producer.requestBody(fromEndpoint, playerId, String.class);
			
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
			final String token = this.getToken();
			context.addRoutes(new RouteBuilder() {

				@Override
				public void configure() throws Exception {
					from(fromEndpoint)
						.setHeader(Exchange.HTTP_METHOD, constant(HttpMethods.GET))
						.setHeader("X-media-mis-token",
							constant(token))
						.recipientList(
							simple("http4:www.afl.com.au/api/cfs/afl/statsCentre/players?competitionId=CD_S${body}014")
							)
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
	
	/**
	 * Extracts individual player IDs from each season giving you a list of all the players
	 * that were on a club list during a particular season.
	 */
	public void extractPlayerIdsFromPlayers(String args[]) throws Exception{
//	public static void main(String args[]) throws Exception{
		final String fromEndpoint = "file:src/data/afl/players/?noop=true";
		Main main = new Main();
		main.enableHangupSupport();
		main.addRouteBuilder(new RouteBuilder() {

			@Override
			public void configure() throws Exception {
				from(fromEndpoint)
				.transform().jsonpath("lists[*].player.playerId", String.class)
				.transform(body().regexReplaceAll("\\[", "").regexReplaceAll("\\]", ""))
				.transform(body().regexReplaceAll("\"", ""))
				.transform(body().regexReplaceAll(",", "\n"))
				.to("file://src/data/afl/players/list?fileExist=Append");

			}
		});
		logger.info("Starting Camel....");
		main.run();		
		return ;
	}

	/**
	 * Get individual record for each player
	 * @param args
	 * @throws Exception
	 */
//	public static void main(String args[]) throws Exception{
	public static void getIndividualRecordOfEachPlayer(String args[]) throws Exception{
		final String fromEndpoint = "file:src/data/afl/players/list?fileName=playerList.txt&noop=true";
		final String token = new StatisticsServiceBean().getToken();
		Main main = new Main();
		main.enableHangupSupport();
		main.addRouteBuilder(new RouteBuilder() {

			@Override
			public void configure() throws Exception {
				from(fromEndpoint)
				.split(body().tokenize("\n"))
					.setHeader(Exchange.HTTP_METHOD, constant(HttpMethods.GET))
					.setHeader("CamelFileName", simple("${body}"))
						.setHeader("X-media-mis-token",
							constant(token))
						.recipientList(
							simple("http4:www.afl.com.au/api/cfs/afl/playerProfile/${body}")
							)
				.to("file://src/data//afl/player-profile")
				;

			}
		});
		logger.info("Starting Camel....");
		main.run();		
		return ;
	}
}

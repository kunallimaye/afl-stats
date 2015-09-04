/**
 * 
 */
package me.finiteloop.afl.stats.extractor;

import java.net.URL;

import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author klimaye
 *
 */
@RunWith(Arquillian.class)
public class TestStatisticsServiceBean {
    @Deployment
    public static Archive<?> createTestArchive() {

        return ShrinkWrap.create(WebArchive.class, "test-afl-extraction.war")
                .addClasses(JaxRsActivator.class)
                .addClasses(StatisticsServiceBean.class)
                .addAsLibraries(Maven.resolver().resolve(
                		//TODO: find an elegant way to resolving this dependency instead of hardcoding below.
//						"org.infinispan:infinispan-core:6.0.0.Final",
//						"com.thetransactioncompany:cors-filter:1.3.2",
                		"org.apache.camel:camel-core:2.15.2",
                		"org.apache.camel:camel-http4:2.15.2",
                		"org.apache.camel:camel-jsonpath:2.15.2",
						"org.apache.cxf:cxf-rt-rs-client:3.0.0-milestone1"
						).withTransitivity().asFile())                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
    }
    
    @Test
    @RunAsClient
    public void testGetSeasonStatistics(@ArquillianResource URL contextRoot) throws Exception {
    	WebClient client = WebClient.create("http://localhost:8080/test-afl-extraction/statistics/season/2015");
		client.type("application/json").accept("application/json");
		Response response = client.get();
		System.out.println("OUTPUT: " + response.toString());
		Assert.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
    }

    @Test
    @RunAsClient
    public void testGetPlayersInSeasonStatistics(@ArquillianResource URL contextRoot) throws Exception {
    	WebClient client = WebClient.create("http://localhost:8080/test-afl-extraction/statistics/players/2015");
		client.type("application/json").accept("application/json");
		Response response = client.get();
		System.out.println("OUTPUT: " + response.toString());
		Assert.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
    }
}

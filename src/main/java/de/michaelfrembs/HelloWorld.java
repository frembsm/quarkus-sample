package de.michaelfrembs;

import java.util.concurrent.ThreadLocalRandom;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Gauge;
import org.eclipse.microprofile.metrics.annotation.Timed;

@Path("/hello")
public class HelloWorld {
    
    @GET
    @Counted(
        name = "performedChecks",
        description = "How many primality checks have been performed."
    )
    @Timed(
        name = "checksTimer",
        description = "A measure of how long it takes to perform the helloWorld method.", unit = MetricUnits.MILLISECONDS
    )
    public String helloWorld(){
        return "Hello World";
    }

    @Gauge(
        name = "random",
        description = "Returns a random number between 0 and 10",
        unit = MetricUnits.NONE
    )
    @GET
    @Path("random")
    public int random(){
        return ThreadLocalRandom.current().nextInt(0, 10 + 1);
    }
}

import org.apache.camel.BindToRegistry;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.Exchange;
import org.apache.camel.AggregationStrategy;
import java.util.ArrayList;

@BindToRegistry("process")
public class Process{

    public void processData(Exchange exchange) {
       
        String oldBody = exchange.getIn().getBody(String.class);
        System.out.println("Old Body: " + oldBody);
    }
}
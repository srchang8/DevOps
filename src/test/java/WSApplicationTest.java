
import com.stephenWS.rest.RestService;
import org.jboss.resteasy.core.Dispatcher;
import org.jboss.resteasy.mock.MockDispatcherFactory;
import org.jboss.resteasy.mock.MockHttpRequest;
import org.jboss.resteasy.mock.MockHttpResponse;
import org.jboss.resteasy.plugins.server.resourcefactory.POJOResourceFactory;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;

public class WSApplicationTest {

    private static Dispatcher dispatcher;
    private static POJOResourceFactory noDefaults;

    // This code here gets run before our tests begin
    @BeforeClass
    public static void setup() {
        dispatcher = MockDispatcherFactory.createDispatcher();
        noDefaults = new POJOResourceFactory(RestService.class);
        dispatcher.getRegistry().addResourceFactory(noDefaults);
    }

    // One of our actual tests!
    @Test
    public void helloTest() {
        try {
            // Specify the endpoint we want to test, for our example, we use "/test"
            MockHttpRequest request = MockHttpRequest.get("/test");
            MockHttpResponse response = new MockHttpResponse();
            // Invoke the request
            dispatcher.invoke(request, response);
            // Check the status code
            Assert.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());

            // Check that the message we receive is "Rest Service is working"
            Assert.assertEquals("Rest Service is working.", response.getContentAsString());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

}

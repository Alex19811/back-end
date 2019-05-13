package Definition;

import com.brainacad.HttpClientHelper;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.http.HttpResponse;
import org.junit.Assert;

import java.io.IOException;

import static javafx.scene.input.DataFormat.URL;

public class CucumberDefinitionJava {

    private static String URL;
    private static HttpResponse response;


    @Given("I have server by url {string}")
    public void i_have_server_by_url(String url) {
        URL=url;

    }

    @When("I send GET request on endpoint {string} and parameters {string}")
    public void i_send_GET_request_on_endpoint_and_parameters(String endpoint, String parameters) throws IOException{
    response = HttpClientHelper.get (URL+endpoint, parameters);
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("I get response status code {int}")
    public void i_get_response_status_code(int responceCode) {

        Assert.assertEquals(
                String.format("Response code should be %S", responceCode),
        //"Response code should be" + responseCode
                response.getStatusLine().getStatusCode(), responceCode
        );
    }


    @When("I send GET request on endpoint {string} and requestBody {string}")
    public void iSendGETRequestOnEndpointAndRequestBodyNameMorpheusJobLeader(String endpoint, String body)  {

        Assert.assertNotEquals("Body shouldn't be %s", null, body);

    }

    @Then("I get response status bode not null")
    public void iGetResponseStatusBodeNotNull(String body) {
        Assert.assertNotEquals("Body shouldn't be null", null, body);

    }

    @Then("I get fom body {string} and JSONBPath {string} list of names")
    public void iGetFomBodyAndJSONBPathListOfNames(String,  list names) {
    }
}

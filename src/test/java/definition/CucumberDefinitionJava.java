package definition;

import com.brainacad.HttpClientHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.http.HttpResponse;
import org.junit.Assert;

import java.io.IOException;
import java.util.List;

import static com.brainacad.JsonUtils.listFromJSONByPath;

public class CucumberDefinitionJava {

    private static String URL;
    private static HttpResponse response;


    @Given("I have server by url {string}")
    public void i_have_server_by_url(String url) {
        URL = url;

    }

    @When("I send GET request on endpoint {string} and parameters {string}")
    public void i_send_GET_request_on_endpoint_and_parameters(String endpoint, String parameters) throws IOException {
        response = HttpClientHelper.get(URL + endpoint, parameters);
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("I get response status code {int}")
    public void i_get_response_status_code(int responceCode) {
        int statusCode = response.getStatusLine().getStatusCode();
        Assert.assertEquals("Response status code should be 200", responceCode, statusCode);
    }


    @When("I send GET request on endpoint {string} and requestBody {string}")
    public void iSendGETRequestOnEndpointAndRequestBodyNameMorpheusJobLeader(String endpoint, String body) {
        Assert.assertNotEquals("Body shouldn't be %s", null, body);
    }


    @Then("I get from body and JSONBPath {string} list of names")
    public void iGetFromBodyAndJSONBPathListOfNames(String jsonPath, List<String> expectedNames) throws IOException {
        String body = HttpClientHelper.getBodyFromResponse(response);
        List<String> firstNames = listFromJSONByPath(body, jsonPath);
        Assert.assertEquals("First Name should be " + expectedNames, expectedNames, firstNames);
    }


    @Then("^I get response status body not (.*)$")
    public void iGetResponseStatusBodyNotNull(String isNull) throws IOException {
        String body = HttpClientHelper.getBodyFromResponse(response);
        Assert.assertNotEquals("Body shouldn't be null", isNull, body);
    }


}

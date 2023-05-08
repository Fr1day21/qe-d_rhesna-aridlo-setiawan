package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.screenplay.rest.interactions.Put;
import org.json.simple.JSONObject;

import java.util.List;
import java.util.Map;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.emptyString;
import static org.hamcrest.Matchers.not;


public class TestAPIStepDefinitions {

    String baseURL = "https://fakestoreapi.com";


    @Given("{actor} call api {string} with method {string} with payload below")
    public void callAPI(Actor actor, String path, String method, DataTable table) {
        actor.whoCan(CallAnApi.at(baseURL));

        JSONObject bodyRequest = new JSONObject();

        List<List<String>> rowlist = table.asLists(String.class);
        List<String> headerlist = rowlist.get(0);

        List<Map<String, String>> rowMap = table.asMaps(String.class, String.class);
        Map<String, String> valueList = rowMap.get(0);

        for (int i = 0; i< valueList.size(); i++){
            String key = headerlist.get(i);
            bodyRequest.put(key, valueList.get(key));
        }

        switch (method){
            case "GET":
                actor.attemptsTo(Get.resource(path));
                break;
            case "POST" :
                actor.attemptsTo(Post.to(path).with(request -> request.body(bodyRequest)));
                break;
            case "PUT" :
                actor.attemptsTo(Put.to(path).with(request -> request.body(bodyRequest)));
                break;
            case "DELETE" :
                actor.attemptsTo(Delete.from(path));
                break;
            default :
                throw new IllegalStateException("Unknown Method");
        }

    }

    @Given("{actor} call api {string} with method {string}")
    public void callAPI(Actor actor, String path, String method ){
        actor.whoCan(CallAnApi.at(baseURL));

        switch (method){
            case "GET" :
                actor.attemptsTo(Get.resource(path));
                break;
            case "POST":
                actor.attemptsTo(Post.to(path));
                break;
            case "PUT":
                actor.attemptsTo(Put.to(path));
                break;
            case "DELETE":
                actor.attemptsTo(Delete.from(path));
                break;
            default:
                throw new IllegalStateException("Unknown method");
        }
    }

    @Then("{actor} verify status code is {int}")
    public void userVerifyStatusCodeIs(Actor actor, int statusCode) {
        Response response = SerenityRest.lastResponse();
        response.then().statusCode(statusCode);
    }

    @Then("{actor} verify {string}")
    public void userVerify(Actor actor, String data) {
        Response response = SerenityRest.lastResponse();
        response.then().body(data, not(emptyString()));
    }

    @Then("{actor} verify response is match with json schema {string}")
    public void userVerifyResponseIsMatchWithJsonSchema(Actor actor, String schma) {
        Response response = SerenityRest.lastResponse();
        response.then().body(matchesJsonSchemaInClasspath(schma));
    }
}

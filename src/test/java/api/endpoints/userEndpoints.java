package api.endpoints;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import api.paylods.userPayloadPojo;
import api.test.testCreateUser;
import io.restassured.response.Response;

public class userEndpoints {
	

	 
	//Request creation for Post request
	public Response singleUserCreation(userPayloadPojo payload){
		
		Response res=given()
			.contentType("application/json")
			.headers("aqccept", "application/json")
			.body(payload)
		
		.when()
			.post(routes.post_url);
		return res;
		
	}
	public Response updateUserRecord(String s, userPayloadPojo payload) {
		
		Response res=given()
					.contentType("application/json")
					.headers("aqccept", "application/json")
					.body(payload)
					.pathParams("username", s)
				.when()
					.put(routes.put_url);
		
		
		return res;
		
	}
	
	public Response getUserData(String s) {
		
		Response res=given()
			.pathParam("username", s)
			
		.when()
			.get(routes.get_url);
		return res;
		
	}
	
	public void deleteUserRecord(String s) {
		
		given()
			.pathParam("username", s)
			
		.when()
			.delete(routes.delete_url);
		
		
	}
	
	
	

}

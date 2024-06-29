package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.userEndpoints;
import api.paylods.userPayloadPojo;
import io.restassured.response.Response;

public class testCreateUser {
	
	Faker faker= new Faker();
	userPayloadPojo testpayload= new userPayloadPojo();
	userEndpoints user=new userEndpoints();
	
	@BeforeClass
	public void payload(){
		testpayload.setEmail(faker.internet().emailAddress());
		testpayload.setFirstname(faker.name().firstName());
		testpayload.setLastname(faker.name().lastName());
		testpayload.setPassword(faker.internet().password());
		testpayload.setPhone("123456");
		testpayload.setUserStatus(0);
		testpayload.setId(0);
		testpayload.setUsername(faker.name().username());
		
		
	}
	
	@Test
	public void createSingleTestUser(){
		
		
		
		Response res=user.singleUserCreation(testpayload);
		Assert.assertEquals(res.getStatusCode(),200);
		
		System.out.print(res.body());
		
	}

}

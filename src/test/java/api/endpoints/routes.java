package api.endpoints;

public class routes {
//This Class stores only URLS
//	https://petstore.swagger.io/v2/user/user-->post
//		https://petstore.swagger.io/v2/user-->get
//			https://petstore.swagger.io/v2/user/1-->put
//				https://petstore.swagger.io/v2/user/1-->Delete
	
	//Users Module Endpoints
	
	static String base_url="https://petstore.swagger.io/v2/";
	
	public static String post_url=base_url+"user";
	public static String get_url=base_url+"user/{username}";
	public static String put_url=base_url+"user/{username}";
	public static String delete_url=base_url+"user/{username}";
	
	
	
}

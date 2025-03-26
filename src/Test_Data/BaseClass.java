package Test_Data;

import java.util.UUID;


public class BaseClass {
	
	public static String baseUrl="http://172.105.33.249:3000/sign-up";
	public static String randomString = UUID.randomUUID().toString().substring(0, 8);
	public static String email="user_" + randomString + "@gmail.com";
	public static String fname = "Rupali";
	public static String lname = "Hegade";
	public static String password = "Test@1234";

}

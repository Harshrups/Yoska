package Config;

import org.openqa.selenium.*;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
/*
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
*/
import java.io.FileInputStream;
import java.io.IOException;

public class Setup 
{

	public WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	/*
	@BeforeClass
	public static DatabaseReference initializeFirebase() {
        try {
            FileInputStream serviceAccount = new FileInputStream("serviceAccountKey.json");

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("http://172.105.33.249:3306/")
                    .build();

            FirebaseApp.initializeApp(options);
            return FirebaseDatabase.getInstance().getReference();
        } catch (IOException e) {
            System.out.println("Firebase Initialization Failed: " + e.getMessage());
            return null;
        }
    }
    */
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
}
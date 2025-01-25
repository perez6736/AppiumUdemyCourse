package dannyAppiumCourse;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBasics {
	
	@Test
	public void AppiumTest() throws MalformedURLException {
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), null);
		
	}

}

package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

public class HomePage extends base{

@Test
public void basePageNavigation() throws IOException {
	
	
	driver=initializeBrowser();
	driver.get("https://macfast.org/ ");
	
}



}

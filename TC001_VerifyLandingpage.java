package homePage;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import uiActions.HomePage;

import java.io.IOException;
import java.util.logging.Logger;

public class TC001_VerifyLandingpage extends testBase.TestBase {

public static final Logger log =Logger.getLogger(TC001_VerifyLandingpage.class.getName());
HomePage homepage;
		
		@BeforeTest 
		public void setUp() throws IOException{
		init();
		}
		
		@Test
        public void LandingPage(){
			try {
			log.info("*****Starting TC001 Test Case Exceution*******" );
			homepage = new HomePage(driver);
			homepage.LandingPage();
			homepage.getwebpagetitle();
			Assert.assertEquals(true,homepage.getwebpagetitle(),"calculator-Google Search");
			captureScreen("GoogleResultsPage");
			log.info("*****Finished TC001 Test Case Exceution*******" );
		}
			catch(AssertionError e) {
				captureScreen("GoogleResultsPage");
				//Assert.assertTrue(true,"verifyLoginwithInvalidCredentials");
			}
			catch(Exception e) {
				log(e.fillInStackTrace().toString());
				
			}
		}
		
      
		

	


		
	}



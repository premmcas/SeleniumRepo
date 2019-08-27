package myApplication;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import myApplication.HomePageObjects;
import myApplication.BasePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests {

	HomePageObjects homePage;
	BasePage bp;

	public HomePageTests() {
		homePage = new HomePageObjects();
		bp = new BasePage();

	}
	
	@Test
	public void verifyWomenTabIsdisplayed() {
		Assert.assertTrue(bp.elementFound(homePage.verifyWomenTabDisplay()));
	}
	
	@Test(priority=1)
	public void verifyDressesTabIsdisplayed() {
		Assert.assertTrue(bp.elementFound(homePage.verifyDressesTabDisplay()));
	}
	
	@Test(priority=2)
	public void verifyTshirtTabIsDisplayed() {
		Assert.assertTrue(bp.elementFound(homePage.verifyTshirtTabDisplay()));
	}

	@Test(priority =3)
	public void VerifyWomenTab() {
		Assert.assertTrue(bp.elementFound(homePage.clickWomenTab()));
		Assert.assertEquals(bp.getTitle(), "Women - My Store");
	}

	@Test(priority=5)
	public void VerifyDressesTab() {
		Assert.assertTrue(bp.elementFound(homePage.clickDressesTab()));
		Assert.assertEquals(bp.getTitle(), "Dresses - My Store");
	}

	@Test(priority=4)
	public void ClickTshirtTab() {
		Assert.assertTrue(bp.elementFound(homePage.clickTshirts()));
		Assert.assertEquals(bp.getTitle(), "T-shirts - My Store");

	}
	/*
	@Test
	public void enterNewsSletterEmail() {
		//Assert.assertTrue(bp.elementFound(homePage.setEmailOnNewsSletter("test2@test.com")));
	}
	*/
	/*@Test(priority = 1)
	public void clickNewsSletterBtn() {
		Assert.assertTrue(bp.elementFound(homePage.clickNewssletterBtn()));
	}*/
	
/*	@Test
	public void verifyMessageIsdisplayedAfterenteringemail() {
		homePage.setEmailOnNewsSletter("premkumarm.mca@gmail.com");
		String msg = homePage.getNewssletterValue();
		Assert.assertTrue(msg.contains("successfully"));
	}*/
	
	/*@Test
	public void Verifymail()
	 
    {

           homePage.setNewsLetter("divya080615@gmail.com");

          
    }
 @Test

    public void verifySubscription()

    {


        Assert.assertTrue(homePage.getTxtNewsletterMessage().contains("successful"), "Failed:Subscription message is not displayed");

    }
*/
	
	@Test(priority=5)
	public void enterNewsSletterEmail() {
		Assert.assertTrue(bp.elementFound(homePage.setEmailOnNewsSletter()));
	}

	@Test(priority = 6)
	public void clickNewsSletterBtn() {
		Assert.assertTrue(bp.elementFound(homePage.clickNewssletterBtn()));
	}

	@Test(priority = 7)
	public void verifyMessageIsdisplayedAfterenteringemail() {
		// String msg = homePage.getNewssletterValue();
		Assert.assertTrue(homePage.getNewssletterValue().contains("subscribed"),
				"Failed:Enter a valid email address.");
	}

	/*@Test(priority = 8)
	public void closeBrowser() {
		bp.quitDriver();
	}*/
	
	//*[@id="columns"]/p
}

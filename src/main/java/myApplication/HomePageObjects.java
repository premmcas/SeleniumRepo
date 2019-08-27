package myApplication;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage {

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement women;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	public WebElement dress;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
	public WebElement tshirt;
	
	@FindBy(xpath="//*[@id='newsletter-input']")
	private WebElement newssletter;
	
	@FindBy(xpath="//button[@class='btn btn-default button button-small']")
	private WebElement newssletterBtn;
	
	@FindBy(xpath="//*[@class='alert alert-success']")
	private WebElement alertMessage;

	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}

	public WebElement verifyWomenTabDisplay() {
		women.isDisplayed();
		return women;
		
	}
	
	public WebElement verifyDressesTabDisplay() {
		dress.isDisplayed();
		return dress;
	}
	
	public WebElement verifyTshirtTabDisplay() {
		tshirt.isDisplayed();
		return tshirt;
	}
	public WebElement clickWomenTab() {
		women.click();
		return women;
	}

	public WebElement clickDressesTab() {
		dress.click();
		return dress;
	}

	public WebElement clickTshirts() {
		tshirt.click();
		return tshirt;
	}
	
	/*public WebElement setEmailOnNewsSletter(String email) {
		newssletter.sendKeys("test1@test.co");
		//newssletterBtn.click();
		return newssletter;
	}
	
	public void clickNewssletterBtn() {
		newssletterBtn.click();
		//return newssletterBtn;
	}

	public String getNewssletterValue() {
		return newssletter.getText();
		
	}
	
	public void setNewsLetter(String email)
	 
    {
           newssletter.sendKeys(email);
          
           newssletterBtn.click();

    }


    public String getTxtNewsletterMessage()

    {
           return alertMessage.getText();
    }*/
	
	public WebElement setEmailOnNewsSletter() {
		newssletter.sendKeys("test8@email.com");
		return newssletter;
	}
	
	public WebElement clickNewssletterBtn() {
		newssletterBtn.click();
		return newssletterBtn;
	}

	public String getNewssletterValue() {
		return alertMessage.getText();
		
	}


}

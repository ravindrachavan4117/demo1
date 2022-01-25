package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class MyPageObject {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Test data']")
	public WebElement testData;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//span/span[normalize-space(.)='Test Title']")
	public WebElement title;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Sign in with Twitter']")
	public WebElement signInWithTwitter;
	@ButtonType()
	@FindBy(xpath = "//input[@id='allow']")
	public WebElement authorizeApp;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='newsTab__item']")
	public WebElement news;
	@TextType()
	@FindBy(xpath = "//input[@id='username_or_email']")
	public WebElement logInToTwitter;
	@ButtonType()
	@FindBy(xpath = "//input[@id='cancel']")
	public WebElement cancel;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Log a Call']")
	public WebElement new_;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Notifications']")
	public WebElement _0Notifications;
	@TextType()
	@FindBy(xpath = "//a[normalize-space(.)='Global Actions']/div/lightning-icon/lightning-primitive-icon")
	public WebElement _447_a;
			
}

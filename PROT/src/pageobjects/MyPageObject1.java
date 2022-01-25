package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject1"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class MyPageObject1 {

	@ButtonType()
	@FindBy(xpath = "//input[@id='allow']")
	public WebElement authorizeApp;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Sign in with Twitter']")
	public WebElement signInWithTwitter;
			
}

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
	@LinkType()
	@FindBy(xpath = "//span/a")
	public WebElement go_button;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Frames']")
	public WebElement frames;
	@PageFrame()
	public static class Frame {

		@FindBy(xpath = "//iframe")
		public Frame1 frame;
	}
	@FindBy(xpath = "//div[contains(@class, \"tab-content\")]/div[2]//iframe")
	public Frame frame;
	@PageFrame()
	public static class Frame1 {

		@TextType()
		@FindBy(xpath = "//input")
		public WebElement text;
	}
			
}

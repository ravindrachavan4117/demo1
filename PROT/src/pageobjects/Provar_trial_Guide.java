package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Provar_trial_Guide"                                
     , summary=""
     , relativeUrl=""
     , connection="pdf"
     )             
public class Provar_trial_Guide {

	@LinkType()
	@FindBy(linkText = "download the Provar Trial Guide")
	public WebElement downloadTheProvarTrialGuide;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Testing With Different Profiles']")
	public WebElement testingWithDifferentProfiles;
			
}

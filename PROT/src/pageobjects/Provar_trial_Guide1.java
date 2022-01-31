package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Provar_trial_Guide1"                                
     , summary=""
     , relativeUrl=""
     , connection="pdf"
     )             
public class Provar_trial_Guide1 {

	@JavascriptBy(jspath = "return document.querySelector('p:nth-child(2) > a')")
	@LinkType()
	public WebElement testingWithDifferentProfiles;
			
}

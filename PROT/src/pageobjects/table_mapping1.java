package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@Page( title="table_mapping1"                                
     , summary=""
     , relativeUrl=""
     , connection="w3s"
     )             
public class table_mapping1 {

	@PageRow()
	public static class Example {

		@TextType()
		@FindBy(xpath = "//td[1]")
		public WebElement column1;
		@TextType()
		@FindBy(xpath = "//td[2]")
		public WebElement column2;
		@TextType()
		@FindBy(xpath = "//td[3]")
		public WebElement column3;
		@TextType()
		@FindBy(xpath = "(//tr[4]/td[2])[1]")
		public WebElement column4_2;
		
	}

	@FacetFindBys(value = {
			@FacetFindBy(findBy = @FindBy(xpath = "(//table[@id='customers'])[1]//tr[position() > 1]"), facet = UiFacet.DATA_ROWS),
			@FacetFindBy(findBy = @FindBy(xpath = "((//table[@id='customers'])[1]//tr)"), facet = UiFacet.HEADER_ROW) })
	@FindBy(xpath = "(//table[@id='customers'])[1]")
	@PageTable(firstRowContainsHeaders = true, row = Example.class)
	public List<Example> example;
			
}

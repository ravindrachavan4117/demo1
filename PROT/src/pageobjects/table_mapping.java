package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@Page( title="table_mapping"                                
     , summary=""
     , relativeUrl=""
     , connection="w3s"
     )             
public class table_mapping {

	@PageRow()
	public static class Example {
	}

	@FacetFindBys(value = {
			@FacetFindBy(findBy = @FindBy(xpath = "(//table[@id='customers'])[1]//tr[position() > 1]"), facet = UiFacet.DATA_ROWS),
			@FacetFindBy(findBy = @FindBy(xpath = "((//table[@id='customers'])[1]//tr)[1]"), facet = UiFacet.HEADER_ROW) })
	@FindBy(xpath = "//table[@id=\"customers\"]")
	@PageTable(firstRowContainsHeaders = false, row = Example.class)
	public List<Example> example;
			
}

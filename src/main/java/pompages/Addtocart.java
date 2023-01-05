package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	
	@FindBy(id="add")
	private WebElement addbt;
	
	@FindBy(xpath=" //button[text()=' Add to Cart']")
	private WebElement addtocartbt;

	
	public Addtocart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getAddbt() {
		return addbt;
	}

	public void addtocartButton() {
		addtocartbt.click();
	}
}

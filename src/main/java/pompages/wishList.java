package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class wishList {
	@FindBy(xpath="//button[@aria-label=\"Play\"]")
	private WebElement Play;
	
	
	@FindBy(xpath="//button[@aria-label=\"Pause\"]")
	private WebElement Pause;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement wishlistbtn;
	
	@FindBy(xpath="//a[text()='X']")
	private WebElement close;
	
	public  wishList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void wishlist()
	{
		wishlistbtn.click();
		
	}
	
	public void playbtn() {
		Play.click();
	}
	
	public void pausebtn()
	{
		Pause.click();
	}

	public void closepopup() {
		close.click();
		
	}
}

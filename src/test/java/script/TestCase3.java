package script;

import java.io.IOException;

import org.testng.annotations.Test;

import genaricLib.StepGroup;
import pompages.Selenium;
import pompages.SkillraryLogin;
import pompages.wishList;

public class TestCase3 extends StepGroup{
	
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		SkillraryLogin s=new SkillraryLogin(driver);
		s.searchtextbox(pdata.getPropertydata("coursename"));
		s.searchbutton();
		
		Selenium se=new Selenium(driver);
		se.corejavaselenium();
		
		wishList w=new wishList(driver);
		w.closepopup();
		driverutilies.switchframe(driver);
		w.playbtn();
		Thread.sleep(1000);
		w.pausebtn();
		driverutilies.switchbackfrmae(driver);
		w.wishlist();
		
		
	}

}

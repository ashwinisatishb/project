package script;
import org.testng.annotations.Test;

import genaricLib.StepGroup;
import pompages.Addtocart;
import pompages.SkillraryDemoLogin;
import pompages.SkillraryLogin;

public class TestCase1 extends StepGroup {
	
	@Test
	public void tc1()
	{
		SkillraryLogin l=new SkillraryLogin(driver);
		l.gearsButton();
		l.demoskillraryapp();
		
		SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
		driverutilies.switchTabs(driver);
		driverutilies.mouseHover(driver,sd.getCoursetb());
		sd.seleniumtrainingtb();
		
		Addtocart ad=new Addtocart(driver);
		driverutilies.doubleClick(driver,ad.getAddbt());
		ad.addtocartButton();
		driverutilies.alertpopup(driver);
	}
}

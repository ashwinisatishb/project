package script;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genaricLib.StepGroup;
import pompages.SkillraryDemoLogin;
import pompages.SkillraryLogin;
import pompages.Testing;

public class testcase2 extends StepGroup{
		

	@Test
	public void tc() throws IOException {
		SkillraryLogin s=new SkillraryLogin(driver);
		s.gearsButton();
		s.demoskillraryapp();
		
		SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
		driverutilies.switchTabs(driver);
		driverutilies.dropdown(sd.getCoursedd(),pdata.getPropertydata("coursedd"));
		
		Testing t=new Testing(driver);
		driverutilies.dragandrop(driver,t.getSelenium(),t.getCart());
		Point loc=t.getFacebook().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		driverutilies.scrollBar(driver, x, y);
		t.facebookicon();
		
		
		
	}
	
	
	
	

}

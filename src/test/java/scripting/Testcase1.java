package scripting;

import org.apache.commons.math3.analysis.function.Add;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.Addtocartpage;
import pomPages.SkillraryDemoLogin;
import pomPages.Skillraryloginpage;

public class Testcase1 extends BaseClass{
	
	@Test
	public void tc1() {
	Skillraryloginpage sl=new Skillraryloginpage(driver);
	sl.gerasbutton();
	sl.skillrarydemoapp();
	
	driverutilies.switchtabs(driver);
	
	SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
	driverutilies.mouseHover(driver,sd.getCoursetab());
	sd.seleniumtrainingbtn();
	
	Addtocartpage ad=new Addtocartpage(driver);
	driverutilies.doubleclick(driver,ad.getPlus());
	ad.cartbutton();
	driverutilies.alertpopup(driver);
	
	}

}

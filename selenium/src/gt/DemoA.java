package gt;


import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoA {
	  
	@Test
	@Parameters({"sBrowser","un","pw"})
	public void loginTest(@Optional("firefox") String sBrowser , @Optional("sunil") String un,@Optional("TY") String pw) {
		Reporter.log("The Browser Name is--->"+sBrowser,true);
		Reporter.log("The USerName is--->"+un,true);
		Reporter.log("The Password is--->"+pw,true);
		
	}

}

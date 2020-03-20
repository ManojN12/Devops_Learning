package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import lib.selenium.PreAndPost;

public class Hook extends PreAndPost{

	@Before
	public void before(Scenario sc) {
		startTestCase(sc.getName(), sc.getId());
	}
	
	@After
	public void after() {
		closeAllBrowsers();
	}

}






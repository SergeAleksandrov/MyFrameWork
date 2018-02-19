package Infrastructure.base;

import Infrastructure.logger.TestLogger;
import Infrastructure.utils.TestServer;
import Infrastructure.webDriverManager.WebDriverManager;

public class TestBase {

  protected WebDriverManager wdm;
  protected String browser;
  protected TestLogger logger;

  // Before
  public void setUp(){
    logger = new TestLogger();
    wdm = new WebDriverManager();
    browser = wdm.create();
    String url = new TestServer().getUrl();
    logger.log("Open website: " + url);
    beforeTest();
  }

  // After
  public void cleanUp(){
    afterTest();
    logger.log("Close browser");
    wdm.destroy("browser");
  }

  protected void beforeTest(){}

  protected void afterTest(){}
}

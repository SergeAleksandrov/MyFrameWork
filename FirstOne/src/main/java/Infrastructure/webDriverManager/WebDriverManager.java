package Infrastructure.webDriverManager;

import Infrastructure.config.ConfigurationManager;

public class WebDriverManager {

  public String create(){
    String testBrowser = ConfigurationManager.getInstance().getTestBrowser();
    switch(testBrowser){
      case "chrome":
        return "GoogleChrome";
      case "firefox":
        return "Mozilla Firefox";
      case "safari":
        return "Apple Safari";
      case "ie":
        return "Internet Explorer";
      default:
        return "Invalid";
    }
  }
  public void destroy(String browser){
    System.out.println(browser + " was closed");
  }
}

package Infrastructure.config;

public class ConfigurationManager {

  public static ConfigurationManager Instance;

  private ConfigurationManager(){
  }

  public static ConfigurationManager getInstance(){
    if (Instance == null)
      Instance = new ConfigurationManager();
    return Instance;
  }

  public String getTestBrowser () {return getEnvironmentVariableOrDefault("testBrowser", "Google Chrome");}

  public String getTestEnv (){return getEnvironmentVariableOrDefault("testEnv", "production");}

  private String getEnvironmentVariableOrDefault (String envVar, String defaultValue){
    return System.getenv(envVar) != null ? System.getenv(envVar) : defaultValue;
  }
}

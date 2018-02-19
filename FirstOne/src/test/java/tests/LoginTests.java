package tests;

public class LoginTests extends AuthTestBase {

  @Override
  public void setUp() {
    super.setUp();
    logger.log("Click login button");
  }

  @Override
  public void afterTest() {
  }

  public static void main(String[] args) {
    LoginTests lg = new LoginTests();
    lg.setUp();
    lg.logger.log("Some steps");
  }
}

package tests;

import Infrastructure.base.TestBase;

import java.util.logging.Logger;

public class AuthTestBase extends TestBase {

  @Override
  protected void beforeTest() {
    logger.log("Open login page");
  }

  @Override
  protected void afterTest() {
    logger.log("Some steps");
  }
}

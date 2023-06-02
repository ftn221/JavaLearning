package org.example.lessonEight.tests.base;

import java.time.Duration;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.lessonEight.Pages.base.BasePage;
import org.example.lessonEight.Pages.google.GoogleMainPage;
import org.example.lessonEight.Pages.google.GoogleResultsPage;
import static org.example.lessonEight.common.CommonActions.createDriver;
import static org.example.lessonEight.constants.Constants.GOOGLE_MAIN_PAGE;
import static org.example.lessonEight.constants.Constants.LOGGER_NAME;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
  protected WebDriver driver = createDriver();
  protected BasePage basePage = new BasePage(driver);
  protected GoogleMainPage googleMainPage = new GoogleMainPage(driver);
  protected GoogleResultsPage googleResultsPage = new GoogleResultsPage(driver);
  protected static final Logger logger = LogManager.getLogger(LOGGER_NAME);

  @BeforeTest
  protected void setUp() {
    logger.log(Level.DEBUG, "Открываем главную страницу Google");
    basePage.open(GOOGLE_MAIN_PAGE);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterTest(alwaysRun = true)
  protected void close() {
    logger.log(Level.DEBUG, "Закрываем браузер");
    basePage.close();
  }
}

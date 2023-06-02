package org.example.lessonEight.Pages.google;

import java.time.Duration;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.lessonEight.Pages.base.BasePage;
import static org.example.lessonEight.constants.Constants.GOOGLE_MAIN_PAGE;
import static org.example.lessonEight.constants.Constants.LOGGER_NAME;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GoogleMainPage extends BasePage {
  public GoogleMainPage(WebDriver driver) {
    super(driver);
  }

  private final By searchInputOnMainPage = By.id("APjFqb");

  protected static final Logger logger = LogManager.getLogger(LOGGER_NAME);

  @BeforeMethod
  protected void setUp() {
    logger.log(Level.DEBUG, "Открываем главную страницу Google");
    open(GOOGLE_MAIN_PAGE);
  }

  @AfterMethod
  protected void closeBrowser() {
    logger.log(Level.DEBUG, "Закрываем браузер");
    close();
  }

  public void mainPageInputIsPresent() {
    logger.log(Level.DEBUG, "Проверяем наличие поля ввода на странице");
    WebElement element = driver.findElement(searchInputOnMainPage);
    waitWebElementIsVisible(element);
    Assert.assertTrue(element.isDisplayed(), "Поле поиска не отображается");
  }

  public void typeSearchRequest() {
    logger.log(Level.DEBUG, "Вводим данные в поисковую строку");

    WebElement element = driver.findElement(searchInputOnMainPage);
    waitWebElementIsVisible(element);

    element.clear();
    element.sendKeys("HeadHunter");
  }

  public void searchAction() {
    logger.log(Level.DEBUG, "Нажимаем ENTER на главной странице поиска");
    new Actions(driver)
        .keyDown(Keys.ENTER)
        .perform();
  }
}

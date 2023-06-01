package org.example.lessonEight;

import java.time.Duration;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.example.lessonEight.Elements.RESULT_COUNTER_TITLE;
import static org.example.lessonEight.Elements.SEARCH_INPUT_ON_MAIN_PAGE;
import static org.example.lessonEight.Properties.GOOGLE_MAIN_PAGE;
import static org.example.lessonEight.Properties.LOGGER_NAME;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GooglePage extends BaseClass {

  protected static final Logger logger = LogManager.getLogger(LOGGER_NAME);

  @BeforeMethod
  protected static void setUp() {
    logger.log(Level.DEBUG, "Открываем главную страницу Google");
    getPage(GOOGLE_MAIN_PAGE);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  protected static void close() {
    logger.log(Level.DEBUG, "Закрываем браузер");
    closeBrowser();
  }

  protected static void mainPageInputIsPresent() {
    logger.log(Level.DEBUG, "Проверяем наличие поля ввода на странице");
    boolean inputDisplayed = driver.findElement(SEARCH_INPUT_ON_MAIN_PAGE).isDisplayed();
    Assert.assertTrue(inputDisplayed, "Поле поиска не отображается");
  }

  protected static void typeSearchRequest() {
    logger.log(Level.DEBUG, "Вводим данные в поисковую строку");

    WebElement element = driver.findElement(SEARCH_INPUT_ON_MAIN_PAGE);

    element.clear();
    element.sendKeys("HeadHunter");
  }

  protected static void searchAction() {
    logger.log(Level.DEBUG, "Нажимаем ENTER на главной странице поиска");
    new Actions(driver)
        .keyDown(Keys.ENTER)
        .perform();
  }

  protected static void searchPageResultTitlePresent() {
    logger.log(Level.DEBUG, "Проверяем наличие информации о количестве найденных результатов поиска");
    WebElement element = driver.findElement(RESULT_COUNTER_TITLE);

    boolean titleDisplayed = element.isDisplayed();
    Assert.assertTrue(titleDisplayed, "Заголовок с подсчетом результатов поиска не отображается");
    Assert.assertTrue(element.getText().indexOf("Результатов: примерно") > -1, "В заголовке нет информации о найденных результатах");
  }
}

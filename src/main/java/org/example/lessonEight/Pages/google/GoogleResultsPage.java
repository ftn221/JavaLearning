package org.example.lessonEight.Pages.google;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.lessonEight.Pages.base.BasePage;
import static org.example.lessonEight.constants.Constants.LOGGER_NAME;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class GoogleResultsPage extends BasePage {
  public GoogleResultsPage(WebDriver driver) {
    super(driver);
  }

  protected static final Logger logger = LogManager.getLogger(LOGGER_NAME);
  private final By resultCounterTitle = By.id("result-stats");

  public void searchPageResultTitlePresent() {
    logger.log(Level.DEBUG, "Проверяем наличие информации о количестве найденных результатов поиска");
    WebElement element = driver.findElement(resultCounterTitle);
    waitWebElementIsVisible(element);

    boolean titleDisplayed = element.isDisplayed();
    Assert.assertTrue(titleDisplayed, "Заголовок с подсчетом результатов поиска не отображается");
    Assert.assertTrue(element.getText().indexOf("Результатов: примерно") > -1, "В заголовке нет информации о найденных результатах");
  }
}

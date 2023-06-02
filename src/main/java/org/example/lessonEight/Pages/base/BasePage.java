package org.example.lessonEight.Pages.base;

import static org.example.lessonEight.constants.Constants.IMPLICIT_WAIT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
  protected WebDriver driver;

  public BasePage(WebDriver driver){
    this.driver = driver;
  }

  public void open(String url){
    driver.get(url);
  }

  public void close(){
    driver.quit();
  }

  public WebElement waitWebElementIsVisible(WebElement element){
    new WebDriverWait(driver, IMPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
    return element;
  }
}

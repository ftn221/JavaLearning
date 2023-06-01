package org.example.lessonEight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
  protected static WebDriver driver = new ChromeDriver();

  protected static void getPage(String url) {
    driver.get(url);
  }

  protected static void closeBrowser() {
    driver.quit();
  }
}

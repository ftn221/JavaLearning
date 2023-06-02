package org.example.lessonEight.tests;

import org.example.lessonEight.tests.base.BaseTest;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest {
  @Test(description = "Тест проведения поиска в Google и подтверждения открытия страницы")
  public void googleSearchTest() {
    googleMainPage.mainPageInputIsPresent();
    googleMainPage.typeSearchRequest();
    googleMainPage.searchAction();
    googleResultsPage.searchPageResultTitlePresent();
  }
}

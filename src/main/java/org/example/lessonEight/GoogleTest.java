package org.example.lessonEight;

import org.testng.annotations.Test;

public class GoogleTest extends GooglePage {

  @Test(description = "Тест проведения поиска в Google и подтверждения открытия страницы")
  public static void test() {

    mainPageInputIsPresent();
    typeSearchRequest();
    searchAction();
    searchPageResultTitlePresent();
  }
}

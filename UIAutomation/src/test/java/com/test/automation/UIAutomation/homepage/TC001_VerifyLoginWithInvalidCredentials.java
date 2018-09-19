package com.test.automation.UIAutomation.homepage;

import org.testng.annotations.Test;

import com.test.automation.UIAutomation.testBase.basePage;
import com.test.automation.UIAutomation.uiActions.pageUI;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

public class TC001_VerifyLoginWithInvalidCredentials extends basePage{
  
	pageUI page;
	
	@Test
  public void f() throws Exception
  {
		page = new pageUI(driver);
		page.AccountCreate();
  }
	
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  Launch(loadData("Browser"), loadData("Url"));
  }

  @AfterMethod
  public void afterMethod() {
  }

}

package com.test.LG;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.LG.BaseTest;
import com.pom.LG.PomLG;


public class test extends BaseTest
{
	 @Test
	   public void login() throws IOException
	   {
		  PomLG login=new PomLG(driver);
		  login.loginMethod();
		  
	   }

}

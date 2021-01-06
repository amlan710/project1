package com.scripts.facebook;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.facebook.BaseTest;
import com.pom.facebook.PomSignup;

public class TestSignup extends BaseTest
{
@Test
public void facebook() throws IOException, InterruptedException
{
	PomSignup p=new PomSignup(driver);
	p.signup();
	
}
}

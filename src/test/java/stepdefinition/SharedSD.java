package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class SharedSD {

    @Given("I opened browser")
    public void i_opened_browser() throws Throwable {
        System.out.println("---------I opened browser---------");

    }

    @And("^I maximized it$")
    public void i_maximized_it() throws Throwable {
        System.out.println("---------I maximized it---------");
    }


    @Before("@userdetails")
    public void method1()
    {
        System.out.println("-----Before-----");
    }
    @After("@userdetails")
    public void method2()
    {
        System.out.println("-----After-----");
    }

}

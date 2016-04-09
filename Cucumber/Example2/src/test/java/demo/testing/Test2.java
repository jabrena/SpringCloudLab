package demo.testing;

import cucumber.api.java.en.Given;

public class Test2 {

    @Given("^I test it$")
    public void method1() throws Throwable {
        System.out.println("demo");
    }
}

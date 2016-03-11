package demo.testing.junit;

import cucumber.api.java.en.When;

public class LibraryTest {

    @When("^I run a failing step")
    public boolean I_run_a_failing_step() {
        Library library = new Library();
        return library.method1();
    }
	
}

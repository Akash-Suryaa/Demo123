import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DemoStep {

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.out.println("hi");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		System.out.println("hi");
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("hi");
	}

	@When("some other action")
	public void some_other_action() {
		System.out.println("hi");
	}

}

package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartSteps {


@Given("user is on products page")
public void user_is_on_products_page() {
    System.out.println("User is on Login Page");
}

@When("user selects one product")
public void user_selects_one_product() {
   System.out.println("User selects few products");
}

@When("user selects multiple product")
public void user_selects_multiple_product() {
   System.out.println("User selects few products");
}

@When("user clicks on Add to Card button")
public void user_clicks_on_add_to_card_button() {
	System.out.println("User clicks on Add to Cart button");
}

@Then("the product should get added to the user's cart")
public void the_product_should_get_added_to_the_user_s_cart() {
	System.out.println("Products are added to the cart");
}
}

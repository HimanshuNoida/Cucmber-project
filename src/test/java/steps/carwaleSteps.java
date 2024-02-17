package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.base.BasePage;
import pages.objects.CarBase;
import pages.objects.HomePage;
import pages.objects.NewCarsPage;
import pages.objects.ToyotCarPage;
import utils.SeleniumDriver;

public class carwaleSteps {

	HomePage home = new HomePage();
	NewCarsPage car;
	ToyotCarPage toyota;

	@Given("user navigates to carwale website")
	public void user_navigates_to_carwale_website() {
		SeleniumDriver.openPage(SeleniumDriver.config.getProperty("testsite"));
	}

	@When("user moushover to newcars")
	public void user_moushover_to_newcars() {
		home.mouseHoverNewCars();

	}

	@Then("user clicks on FindnewCars")
	public void user_clicks_on_findnew_cars() throws InterruptedException {

		car = home.FindNewcars();
		car.gotoKia();

	}

	@And("user clicks  on {string} car")
	public void user_clicks_on_car(String carBrand) throws InterruptedException {

		if (carBrand.equals("Toyota")) {
			toyota = car.gotoToyota();
		} else if (carBrand.equals("Kia")) {
			car.gotoKia();
		} else if (carBrand.equals("BMW")) {
			car.gotoBMW();
		} else if (carBrand.equals("Tata")) {
			car.gototata();
		}

	}

	@And("user validates carTiltle as {string} Cars")
	public void user_validates_car_tiltle(String carTitle) {

		System.out.println(BasePage.carBase.getCarTitle());
		Assert.assertTrue(BasePage.carBase.getCarTitle().equals(carTitle));

	}

}

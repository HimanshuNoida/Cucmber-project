package pages.objects;

import pages.base.BasePage;

public class NewCarsPage extends BasePage {

	public void gotoKia() {
		click("Kia_Link_XPATH");

	}

	public BMWCarPage gotoBMW() {
		
		click("bmw_Link_XPATH");
		return new BMWCarPage();
	}

	public ToyotCarPage gotoToyota() throws InterruptedException {
		
		click("toyota_Link_XPATH");
		return new ToyotCarPage();

	}

	public TataCarPage gototata() {
		click("Tata_Link_XPATH");
		return new TataCarPage();
	}
}

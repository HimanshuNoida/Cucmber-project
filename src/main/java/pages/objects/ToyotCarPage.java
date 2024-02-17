package pages.objects;

import pages.base.BasePage;

public class ToyotCarPage extends BasePage {

	
	public String getCarTitle() {
	return	getText("//h1[normalize-space()='Toyota Cars']");
		
	}
}

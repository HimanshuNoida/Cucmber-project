package pages.objects;

import pages.base.BasePage;

public class CarBase {
	public String getCarTitle() {
		return	BasePage.getText("getTitle_XPATH");
			
		}
}

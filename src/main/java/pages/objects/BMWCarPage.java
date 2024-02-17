package pages.objects;

import pages.base.BasePage;

public class BMWCarPage extends BasePage {

	public String getCarTitle() {
		String text = getText("getTitle_XPATH");
		return text;

	}
}

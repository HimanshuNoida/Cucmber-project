package pages.objects;

import org.openqa.selenium.interactions.Actions;

import pages.base.BasePage;

public class HomePage extends BasePage {
	
	
	public void mouseHoverNewCars() {
		mouseHover("NewCarMenu_XPATH");
		
	}
	
	public NewCarsPage FindNewcars() {
		click("findNewCars_XPATH");
		return new NewCarsPage();
		 	
	}
	
	
	public void searchedCars() {
		
		
	}
	
	
	public void gotToMaps() {
		
		
		
	}
}

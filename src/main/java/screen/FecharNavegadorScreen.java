package screen;

import util.Utils;

public class FecharNavegadorScreen extends Utils{
	
	public void fecharNavegador() throws InterruptedException {
		webDriver = getWebDriver();
		Thread.sleep(10000);
		webDriver.quit();
	}
}

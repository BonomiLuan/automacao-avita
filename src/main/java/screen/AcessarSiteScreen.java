package screen;

import util.Utils;

public class AcessarSiteScreen extends Utils{

	public void acessarSite() throws InterruptedException {
		webDriver = getWebDriverChrome();
		webDriver.get("http://www.avitaincorp.com.br/");
		setWebDriver(webDriver);
	}
}

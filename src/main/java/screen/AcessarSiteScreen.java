package screen;

import util.Utils;

public class AcessarSiteScreen extends Utils{

	public void acessarSite(String navegador) throws InterruptedException {
		webDriver = getWebDriverNavegador(navegador);
		webDriver.get("http://www.avitaincorp.com.br/");
		setWebDriver(webDriver);
	}
}

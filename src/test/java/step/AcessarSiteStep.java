package step;

import io.cucumber.java.pt.Dado;
import screen.AcessarSiteScreen;

public class AcessarSiteStep {

	@Dado("^que estou no site da Avita")
	public void acessarSite() throws InterruptedException {
		AcessarSiteScreen acessarSiteScreen = new AcessarSiteScreen();
		acessarSiteScreen.acessarSite();
	}
	
}

package step;

import io.cucumber.java.pt.Quando;
import screen.SelecionarMoradaMorumbiScreen;

public class SelecionarMoradaMorumbiStep {

	@Quando("^seleciono morada morumbi")
	public void selecionarMoradaMorumbi() {
		SelecionarMoradaMorumbiScreen selecionarMoradaMorumbiScreen = new SelecionarMoradaMorumbiScreen();
		selecionarMoradaMorumbiScreen.selecionarMoradaMorumbi();
	}
}

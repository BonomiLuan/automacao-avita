package step;

import io.cucumber.java.pt.Entao;
import screen.FecharNavegadorScreen;

public class FecharNavegadorStep {

	@Entao("^fecho navegador")
	public void fecharNavegador() throws InterruptedException {
		FecharNavegadorScreen fecharNavegadorScreen = new FecharNavegadorScreen();
		fecharNavegadorScreen.fecharNavegador();
	}
}

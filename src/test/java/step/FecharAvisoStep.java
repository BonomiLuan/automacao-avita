package step;

import io.cucumber.java.pt.Quando;
import screen.FecharAvisoScreen;

public class FecharAvisoStep {
	@Quando("^fechar o aviso do covid")
	public void acessarSite() throws InterruptedException {
		FecharAvisoScreen fecharAvisoScreen = new FecharAvisoScreen();
		fecharAvisoScreen.fecharAviso();
	}
}

package screen;

import org.openqa.selenium.By;

import util.Utils;

public class FecharAvisoScreen extends Utils{
	
	public void fecharAviso() {
		clicar(By.className("btFechar"));
	}
}

package screen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Utils;

public class FecharAvisoScreen extends Utils{
	
	public void fecharAviso() {
		webDriver = getWebDriver();
		WebDriverWait wait = new WebDriverWait(webDriver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("btFechar")));
		element.click();
		setWebDriver(webDriver);
	}
}

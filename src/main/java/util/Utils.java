package util;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends WebDriverUtil {

	/*
	 * como fazer para outros Browsers funcionarem tambem?
	 */

	public WebDriver getWebDriverNavegador(String navegador) {

		switch (navegador.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
			webDriver = new ChromeDriver();
			webDriver.manage().window().maximize();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\drivers\\geckodriver.exe");
			webDriver = new FirefoxDriver();
			webDriver.manage().window().maximize();
			break;
		case "ie":
			// IE esta com problemas no site que estamos automatizando!
			System.setProperty("webdriver.ie.driver", "src\\test\\resources\\drivers\\IEDriverServer.exe");
			webDriver = new InternetExplorerDriver();
			webDriver.manage().window().maximize();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", "src\\test\\resources\\drivers\\msedgedriver.exe");
			webDriver = new EdgeDriver();
			webDriver.manage().window().maximize();
			break;

		default:
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
			webDriver = new ChromeDriver();
			webDriver.manage().window().maximize();
			break;
		}

		return webDriver;
	}
	
	public void clicar(By by) {
		webDriver = getWebDriver();
		WebDriverWait wait = new WebDriverWait(webDriver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
		element.click();
		setWebDriver(webDriver);
	}
	
	public WebElement elemento(By by) {
		webDriver = getWebDriver();
		WebDriverWait wait = new WebDriverWait(webDriver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
		
		return element;
	}
	
	public List<WebElement> elementos(By by) {
		webDriver = getWebDriver();
		
		List<WebElement> elementos = new ArrayList<WebElement>();
		WebDriverWait wait = new WebDriverWait(webDriver, 20);
//		elementos = webDriver.findElements(By.xpath("//*[@id=\"ul_obra\"]/li"));
		elementos = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
		
		return elementos;
	}
	
	public void fechar() {
		webDriver = getWebDriver();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		webDriver.quit();
	}

}

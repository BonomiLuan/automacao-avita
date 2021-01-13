package screen;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Utils;

public class SelecionarMoradaMorumbiScreen extends Utils {

	public void selecionarMoradaMorumbi() {
		webDriver = getWebDriver();
		WebDriverWait wait = new WebDriverWait(webDriver, 10);
		WebElement element = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"listaEmprendimentos\"]/ul[4]/li/a")));
		element.click();

		try {

			List<WebElement> fotos = new ArrayList<WebElement>();
			fotos = webDriver.findElements(By.xpath("//*[@id=\"ul_obra\"]/li"));
			int qtd = 1;
			for (int i = 1; i <= fotos.size(); i++) {
				int qtdFotos = webDriver.findElements(By.xpath("//*[@id=\"ul_obra\"]/li[31]/a")).size();
				for (int j = 1; j < qtdFotos; j++) {
					WebElement logo;
					if (qtdFotos != 1) {
						logo = wait.until(ExpectedConditions
								.elementToBeClickable(By.xpath("//*[@id=\"ul_obra\"]/li[" + i + "]/a[" + j + "]")));
					} else {
						logo = wait.until(ExpectedConditions
								.elementToBeClickable(By.xpath("//*[@id=\"ul_obra\"]/li[" + i + "]/a")));
					}
					String logoSRC = logo.getAttribute("href");

					URL imageURL = new URL(logoSRC);
					BufferedImage saveImage = ImageIO.read(imageURL);

					ImageIO.write(saveImage, "png", new File("D:\\fotosAvita\\img_" + qtd + ".png"));
					qtd++;
				}
				if (fotos.size() != i) {
					WebElement element2 = wait.until(
							ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"boxObras\"]/div[2]/a[2]")));
					element2.click();
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		setWebDriver(webDriver);
	}

}

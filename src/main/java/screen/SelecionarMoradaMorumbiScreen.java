package screen;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.Utils;

public class SelecionarMoradaMorumbiScreen extends Utils {

	public void selecionarMoradaMorumbi() {

		clicar(By.partialLinkText("Morada Morumbi"));

		try {

			List<WebElement> fotos = elementos(By.xpath("//*[@id=\"ul_obra\"]/li"));
			int qtd = 1;
			for (int i = 1; i <= fotos.size(); i++) {
				int qtdFotos = elementos(By.xpath("//*[@id=\"ul_obra\"]/li[" + i + "]/a")).size();
				for (int j = 1; j <= qtdFotos; j++) {
					WebElement logo;
					if (qtdFotos != 1) {
						logo = elemento(By.xpath("//*[@id=\"ul_obra\"]/li[" + i + "]/a[" + j + "]"));
					} else {
						logo = elemento(By.xpath("//*[@id=\"ul_obra\"]/li[" + i + "]/a"));
					}
					String logoSRC = logo.getAttribute("href");

					URL imageURL = new URL(logoSRC);
					BufferedImage saveImage = ImageIO.read(imageURL);

					// mudar para o enderço que deseja salvar as fotos
					ImageIO.write(saveImage, "png", new File("C:\\fotos\\img_" + qtd + ".png"));
					qtd++;
				}
				if (fotos.size() != i) {
					clicar(By.xpath("//*[@id=\"boxObras\"]/div[2]/a[2]"));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

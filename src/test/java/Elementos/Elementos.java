package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnParaSeuNegocio = By.cssSelector("#__next > div.style__HeaderWrapper-tirswe-0.WxBOR > header > div > div > nav > li:nth-child(3)");
	private By btnContaPJ = By.xpath("//*[@id=\"__next\"]/div[1]/header/div/div/nav/li[3]/div/ul[1]/li[2]/a");
	private By campoCNPJ = By.name("cnpj");
	private By btnAbrirContaPJ = By.xpath("//*[@id=\"short-form\"]/div[2]/button");
	private By campoNomeCompleto = By.name("name");
	private By campoCPF = By.name("cpf");
	private By campoEmail = By.name("email");
	private By campoEmailConfirmacao = By.name("emailConfirmation");
	private By btnCheckBox = By.xpath("//*[@id=\"label-accepted\"]/span[1]");
	private By btnEnviar = By.id("submit-cnpj-prospect-button");
	private By textoPronto = By.xpath("//*[@id=\"prospect-registration-drawer\"]/div/div/div[2]/section/div/div");
	
	public By getBtnParaSeuNegocio() {
		return btnParaSeuNegocio;
	}
	public By getTextoPronto() {
		return textoPronto;
	}
	public By getBtnContaPJ() {
		return btnContaPJ;
	}
	public By getCampoCNPJ() {
		return campoCNPJ;
	}
	public By getBtnAbrirContaPJ() {
		return btnAbrirContaPJ;
	}
	public By getCampoNomeCompleto() {
		return campoNomeCompleto;
	}
	public By getCampoCPF() {
		return campoCPF;
	}
	public By getCampoEmail() {
		return campoEmail;
	}
	public By getCampoEmailConfirmacao() {
		return campoEmailConfirmacao;
	}
	public By getBtnCheckBox() {
		return btnCheckBox;
	}
	public By getBtnEnviar() {
		return btnEnviar;
	}
	
	
	
}

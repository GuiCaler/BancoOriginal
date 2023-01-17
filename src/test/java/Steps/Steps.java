package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Elementos e = new Elementos();
	Metodos m = new Metodos();
	
	@Given("que acesse a url {string}")
	public void que_acesse_a_url(String string) {
		m.abriNavegador(string);
	}


	@Given("NO CABEÇALHO SELECIONE PARA SEU NEGOCIO")
	public void no_cabeçalho_selecione_para_seu_negocio() throws InterruptedException {
		m.clicar(e.getBtnParaSeuNegocio());
		m.pausa(1000);
	}

	@Given("CLICAR EM CONTA PJ")
	public void clicar_em_conta_pj() throws InterruptedException {
		m.clicar(e.getBtnContaPJ());
	}

	@Given("PREENCHER O CAMPO CNPJ DA EMPRESA")
	public void preencher_o_campo_cnpj_da_empresa() {
		m.preencher(e.getCampoCNPJ(), "98201066000144");
	}

	@Given("CLICAR EM ABRIR CONTA PJ")
	public void clicar_em_abrir_conta_pj() throws InterruptedException {
		m.clicar(e.getBtnAbrirContaPJ());

	}

	@Given("PREENCHER O FORMULARIO DE ABERTURA DE CONTA")
	public void preencher_o_formulario_de_abertura_de_conta() {
		m.preencher(e.getCampoNomeCompleto(), "Gabriel Bento Almada");
		m.preencher(e.getCampoCPF(), "52743871440");
		m.preencher(e.getCampoEmail(), "gabriel.bento.almada@estruturalbr.com.br");
		m.preencher(e.getCampoEmailConfirmacao(), "gabriel.bento.almada@estruturalbr.com.br");
	}

	@Given("SELECIONAR CHECKBOX POLITICAS DE PRIVACIDADE")
	public void selecionar_checkbox_politicas_de_privacidade() {
		m.clicar(e.getBtnCheckBox());
	}

	@When("CLICAR EM ENVIAR")
	public void clicar_em_enviar() {
		m.clicar(e.getBtnEnviar());
	}

	@Then("APARECERÁ O TEXTO")
	public void aparecerá_o_texto() throws InterruptedException {
		m.pausa(6000);
	}
	
}

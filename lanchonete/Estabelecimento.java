package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[]args) {
		Cozinheiro cozinheiro= new Cozinheiro();
		
		//a��es que estabelecimento precisa ter ci�ncia
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarSucoNoBalcao();
			
		Atendente atendente = new Atendente();
		
		atendente.receberPagamento();
		atendente.servindoMesa();
				
		Cliente cliente = new Cliente();
		
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		
		
		
		
	}
	
}

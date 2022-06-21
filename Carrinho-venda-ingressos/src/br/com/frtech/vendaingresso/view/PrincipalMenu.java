package br.com.frtech.vendaingresso.view;

import javax.swing.JOptionPane;

import br.com.frtech.vendaingresso.core.model.Evento;

public class PrincipalMenu {

	public static void main(String[] args) {

		Evento evento = new Evento("CPM22", "10-10-2022");
		
		int opcao;
		do {
			String menu = "ESCOLHA UMA OPÇÃO ABAIXO\n";
			menu += "1 - Informações do evento\n";
			menu += "2 - Comprar ingresso\n";
			menu += "3 - Meu carrinho de compras\n";
			menu += "0 - SAIR\n";
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (opcao) {
			case 1:
				JOptionPane.showMessageDialog(null, evento.informacoesEvento());
				break;
				
			case 2:
				evento.comprarIngresso();
				break;
				
			case 3:
				JOptionPane.showMessageDialog(null, evento.listaIngressosVendidos());
				
			}
		} while (opcao != 0);
		
		
	}

}

package br.com.frtech.vendaingresso.core.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Evento {

	private String nome;
	private String data;
	private List<Ingresso> ingressos;
	private Integer contadorIngressos = 0;
	
	public Evento(String nome, String data) {
		this.ingressos = new ArrayList<Ingresso>();
		this.nome = nome;
		this.data = data;
	}
	
	public void comprarIngresso() {
		Pista pista = new Pista();
		Vip vip = new Vip();
		Camarote camarote = new Camarote();
		int opcao;
		
		do {
			String listaIngressos = "Qual tipo de ingresso você quer comprar?\n";
			listaIngressos += "1 - Pista | R$" + pista.getValor() + "\n";
			listaIngressos += "2 - VIP | R$" + vip.getValor() + "\n";
			listaIngressos += "3 - Camarote | R$" + camarote.getValor() + "\n";
			listaIngressos += "0 - Voltar";
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog(listaIngressos));
			
			switch (opcao) {
			case 1:
				int opcaoPista = JOptionPane.showConfirmDialog(null, "Ingresso PISTA selecionado.\nVocê quer continuar sua compra?");
				if(opcaoPista == 0) {
					opcao = 1;
					ingressos.add(pista);
					this.contadorIngressos ++;
					JOptionPane.showMessageDialog(null, "Ingresso PISTA comprado!");
				}else if(opcaoPista == 1) {
					opcao = 1;
					JOptionPane.showMessageDialog(null, "Compra cancelada.");
				}
				break;
				
			case 2:
				int opcaoVip = JOptionPane.showConfirmDialog(null, "Ingresso VIP selecionado.\nVocê quer continuar sua compra?");
				if(opcaoVip == 0) {
					opcao = 1;
					ingressos.add(vip);
					this.contadorIngressos ++;
					JOptionPane.showMessageDialog(null, "Ingresso VIP comprado!");
				}else if(opcaoVip == 1) {
					opcao = 1;
					JOptionPane.showMessageDialog(null, "Compra cancelada.");
				}
				break;
				
			case 3:
				int opcaoCamarote = JOptionPane.showConfirmDialog(null, "Ingresso CAMAROTE selecionado.\nVocê quer confirmar sua compra?");
				if(opcaoCamarote == 0) {
					opcao = 1;
					ingressos.add(camarote);
					this.contadorIngressos++;
					JOptionPane.showMessageDialog(null, "Ingresso CAMAROTE comprado!");
				}else if(opcaoCamarote == 1) {
					opcao = 1;
					JOptionPane.showMessageDialog(null, "Compra cancelada.");
				}
				
				break;
			}
		} while (opcao != 0);
		
	}
	
	public String informacoesEvento() {
		Pista pista = new Pista();
		Vip vip = new Vip();
		Camarote camarote = new Camarote();
		return "HANGAR - TUBARÃO" + 
				"\nEvento: " + getNome() + 
				"\nData: " + getData() + 
				"\nPista: " + pista.getValor() +
				"\nVIP: " + vip.getValor() +
				"\nCamarote: " + camarote.getValor();
	}
	
	public String listaIngressosVendidos() {
		Pista pista = new Pista();
		Vip vip = new Vip();
		Camarote camarote = new Camarote();
		
		String lista = "---LISTA DE INGRESSOS NO MEU CARRINHO--\n";
		int totalPista=0, totalVip=0, totalCamarote=0;
		double valorTotalPista=0, valorTotalVip=0, valorTotalCamarote=0;
		for (Ingresso ingresso : ingressos) {
			if(ingresso instanceof Pista) {
				totalPista ++;
				valorTotalPista += pista.getValor();
			}else if(ingresso instanceof Vip) {
				totalVip ++;
				valorTotalVip += vip.getValor();
			}else if(ingresso instanceof Camarote) {
				totalCamarote++;
				valorTotalCamarote += camarote.getValor();
			}
		}
		double valorTotalIngressos = pista.getValor()*totalPista + vip.getValor()*totalVip + camarote.getValor()*totalCamarote;

		lista += "Total de ingressos comprados: " + getContadorIngressos() + "\n";
		lista += "Total Pista: " + totalPista + " | Valor total: R$" + valorTotalPista + "\n";
		lista += "Total VIP: " + totalVip + " | Valor total: R$" + valorTotalVip + "\n";
		lista += "Total Camarote: " + totalCamarote + " | Valor total: R$" + valorTotalCamarote + "\n";
		lista += "VALOR TOTAL DOS INGRESSOS SELECIONADOS: R$" + valorTotalIngressos + "\n";
		return lista;
	}

	public Integer getContadorIngressos() {
		return contadorIngressos;
	}

	public void setContadorIngressos(Integer contadorIngressos) {
		this.contadorIngressos = contadorIngressos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<Ingresso> getIngressos() {
		return ingressos;
	}

	public void setIngressos(List<Ingresso> ingressos) {
		this.ingressos = ingressos;
	}
	
}

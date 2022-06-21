package br.com.frtech.vendaingresso.core.model;

public abstract class Ingresso {

	private double valor;
	
	public abstract String resumoIngresso();

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}

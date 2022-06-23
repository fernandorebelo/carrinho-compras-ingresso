package br.com.frtech.vendaingresso.core.model;

public class Pista extends Ingresso{
	
	public Pista() {
		super.setValor(20.0);
	}

	@Override
	public String resumoIngresso() {
		return "Ingresso Pista | Valor: " + super.getValor();
	}
}

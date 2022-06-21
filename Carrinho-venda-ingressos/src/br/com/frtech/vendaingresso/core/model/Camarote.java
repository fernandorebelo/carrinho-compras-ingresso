package br.com.frtech.vendaingresso.core.model;

public class Camarote extends Ingresso{

	public Camarote() {
		super.setValor(1000.0);
	}
	
	@Override
	public String resumoIngresso() {
		return "Ingresso Camarote | Valor: " + super.getValor();
	}

	
}

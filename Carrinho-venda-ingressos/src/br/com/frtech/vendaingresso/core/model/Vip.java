package br.com.frtech.vendaingresso.core.model;

public class Vip extends Ingresso{

	public Vip() {
		super.setValor(50.0);
	}
	
	@Override
	public String resumoIngresso() {
		return "Ingresso VIP | Valor: " + super.getValor();
	}

	
	
}

package br.com.pos.mackenzie.pizzaria;

import br.com.pos.mackenzie.pizzaria.domain.Cliente;
import br.com.pos.mackenzie.pizzaria.domain.EntidadeAbstrata;
import br.com.pos.mackenzie.pizzaria.domain.Pizza;

public class CompraHelper extends EntidadeAbstrata {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Cliente cliente;
	private Pizza pizza;

	@Override
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
}

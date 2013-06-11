/**
 * 
 */
package br.com.pos.mackenzie.pizzaria.domain;

import java.util.ArrayList;
import java.util.List;

import br.com.pos.mackenzie.pizzaria.Util;

/**
 * @author Isaac
 * 
 */
public class Pedido {

	private Integer id;
	private List<Item> itens = new ArrayList<Item>();
	private Cliente cliente;

	public Pedido() {
	}

	public Pedido(Integer id, List<Item> itens, Cliente cliente) {
		super();
		this.id = id;
		this.itens = itens;
		this.cliente = cliente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Item> adicionarItem(Item item) {

		List<Item> itens = new ArrayList<Item>();

		if (Util.isNullOuVazio(getItens())) {
			this.itens = new ArrayList<Item>();
		}

		itens.add(item);

		return (ArrayList<Item>) getItens();
	}

}

package br.com.pos.mackenzie.pizzaria.domain;

import java.util.List;

public class Pizza extends EntidadeAbstrata {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private TamanhoPizza tamanhoPizza;
	private boolean borda;
	private TipoMassaPizza tipoMassaPizza;
	private List<Item> itens;

	@Override
	public Integer getId() {
		return this.id;
	}

	public TamanhoPizza getTamanhoPizza() {
		return tamanhoPizza;
	}

	public void setTamanhoPizza(TamanhoPizza tamanhoPizza) {
		this.tamanhoPizza = tamanhoPizza;
	}

	public boolean isBorda() {
		return borda;
	}

	public void setBorda(boolean borda) {
		this.borda = borda;
	}

	public TipoMassaPizza getTipoMassaPizza() {
		return tipoMassaPizza;
	}

	public void setTipoMassaPizza(TipoMassaPizza tipoMassaPizza) {
		this.tipoMassaPizza = tipoMassaPizza;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}

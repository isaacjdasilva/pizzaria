package br.com.pos.mackenzie.pizzaria.domain;

public enum TipoItem {

	ITEM_QUEIJO(1, "Queijo", 1.50, ""),

	ITEM_BROCOLIS(2, "Brócolis", 0.40, ""),

	ITEM_CAMARAO(3, "Camarão", 1.50, ""),

	ITEM_CALABREZA(4, "Calabreza", 1.00, ""),

	ITEM_ESPINAFRE(5, "Espinafre", 0.70, ""),

	ITEM_ATUM(6, "Atum", 1.00, ""),

	ITEM_TOMATE(7, "Tomate", 0.65, ""),

	ITEM_PIMENTA(8, "Pimenta", 0.20, ""),

	ITEM_MILHO(9, "Milho", 1.00, ""),
	
	ITEM_BATATA_PALHA(11, "Batata Palha", 0.80, ""),
	
	ITEM_CEBOLA(12, "Cebola", 0.50, ""),
	
	ITEM_MANGERICAO(13, "Mangericão", 0.50, ""),
	
	ITEM_ALHO(14, "Alho", 0.30, ""),
	
	ITEM_BACON(15, "Bacon", 1.30, ""),
	
	ITEM_PRESUNTO(16, "Presunto", 17.50, ""),
	
	ITEM_OREGANO(17, "Orégano", 17.50, ""),
	
	ITEM_CATUPIRY(18, "Catupity", 17.50, ""),
	
	ITEM_CHAMPIGNON(19, "Champignon", 17.50, ""),
	
	ITEM_FRANGO(20, "Frango", 17.50, "");

	private Integer id;
	private String nome;
	private Double valor;
	private String descricao;

	private TipoItem(Integer id, String nome, Double valor,
			String descricao) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.descricao = descricao;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}

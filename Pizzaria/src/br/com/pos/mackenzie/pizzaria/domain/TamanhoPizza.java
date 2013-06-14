package br.com.pos.mackenzie.pizzaria.domain;

public enum TamanhoPizza {

	GRANDE(1, "Grande"),

	MEDIA(2, "Média"),

	BROTINHO(3, "Brotinho");

	private Integer id;
	private String nome;

	private TamanhoPizza(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
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
}
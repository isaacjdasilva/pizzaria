package br.com.pos.mackenzie.pizzaria.domain;

public enum TipoMassaPizza {

	FINA(1, "Massa Fina"),

	GROSSA(2, "Massa Grossa");

	private Integer id;
	private String nome;

	private TipoMassaPizza(Integer id, String nome) {
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
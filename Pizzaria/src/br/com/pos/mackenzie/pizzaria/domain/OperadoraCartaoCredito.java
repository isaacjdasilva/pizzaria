package br.com.pos.mackenzie.pizzaria.domain;

public enum OperadoraCartaoCredito {
	
	VISA(1, "Visa"),
	MASTERCARD(2, "MasterCard"),
	CREDCARD(3, "CredCard");
	
	private Integer id;
	private String nome;
	
	private OperadoraCartaoCredito(Integer id, String nome) {
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

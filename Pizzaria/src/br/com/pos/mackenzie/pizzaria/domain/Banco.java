package br.com.pos.mackenzie.pizzaria.domain;

public enum Banco {
	
	CAIXA_ECONOMICA("104", "Caixa Econômica Federal"),
	BANCO_DO_BRASIL("001", "Banco do Brasil S.A."),
	BANCO_BRADESCO("237", "Banco Bradesco S.A."),
	ITAÚ("341", "Itaú Unibanco S.A."),
	BANCO_SAFRA("422", "Banco Safra S.A."),
	BANCO_SANTANDER("033", "Banco Santander (Brasil) S.A."),
	HSBC("399", "HSBC Bank Brasil S.A. - Banco Múltiplo"),
	CITIBANK("745", "Banco Citibank S.A.");
	
	private String codigo;
	private String nome;
	
	private Banco() {
	}

	private Banco(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

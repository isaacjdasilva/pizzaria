package br.com.pos.mackenzie.pizzaria.domain;

public class CartaoCredito extends EntidadeAbstrata {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String numero;
	private String codigoSeguranca;
	private Banco banco;
	private OperadoraCartaoCredito operadoraCartaoCredito;

	public CartaoCredito() {
	}

	public CartaoCredito(Integer id, String numero, String codigoSeguranca,
			Banco banco, OperadoraCartaoCredito operadoraCartaoCredito) {
		super();
		this.id = id;
		this.numero = numero;
		this.codigoSeguranca = codigoSeguranca;
		this.banco = banco;
		this.operadoraCartaoCredito = operadoraCartaoCredito;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCodigoSeguranca() {
		return codigoSeguranca;
	}

	public void setCodigoSeguranca(String codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public OperadoraCartaoCredito getOperadoraCartaoCredito() {
		return operadoraCartaoCredito;
	}

	public void setOperadoraCartaoCredito(
			OperadoraCartaoCredito operadoraCartaoCredito) {
		this.operadoraCartaoCredito = operadoraCartaoCredito;
	}
}

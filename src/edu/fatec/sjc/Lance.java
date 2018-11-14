package edu.fatec.sjc;


public class Lance {
	
	private long id;
	private Integer valor;
	private Cliente cliente;
	private Leilao leilao;
	
	public Lance(Integer valor, Cliente cliente) {
		this.valor = valor;
		this.cliente = cliente;
	}
	
	


	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}




	public Leilao getLeilao() {
		return leilao;
	}




	public void setLeilao(Leilao leilao) {
		this.leilao = leilao;
	} 

}

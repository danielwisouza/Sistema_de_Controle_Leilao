package edu.fatec.sjc;



public class Lance {
	
	private long id;
	private Float valor;
	private Cliente cliente;
	private Leilao leilao;
	
	public Lance(Float valor, Cliente cliente, Leilao leilao) {
		this.valor = valor;
		this.cliente = cliente;
		this.leilao = leilao;
	}
	
	


	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
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




	/*public Integer getNumLeilao() {
		return numLeilao;
	}




	public void setNumLeilao(Integer numLeilao) {
		this.numLeilao = numLeilao;
	} */

}

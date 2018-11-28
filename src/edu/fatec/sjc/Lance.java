package edu.fatec.sjc;


public class Lance {
	
	private long id;
	private Integer valor;
	private Cliente cliente;
	private Integer numLeilao;
	
	public Lance(Integer valor, Cliente cliente, Integer numLeilao) {
		this.valor = valor;
		this.cliente = cliente;
		this.numLeilao = numLeilao;
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




	/*public Leilao getLeilao() {
		return leilao;
	}




	public void setLeilao(Leilao leilao) {
		this.leilao = leilao;
	}*/




	public Integer getNumLeilao() {
		return numLeilao;
	}




	public void setNumLeilao(Integer numLeilao) {
		this.numLeilao = numLeilao;
	} 

}

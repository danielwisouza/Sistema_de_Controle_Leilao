package edu.fatec.sjc;


public class Lote {
	
	
	private Integer numLote;
	private Integer qtdeProd[];
	
	private Object tipo;
	private Leilao leilao;
	private Imovel imovel;
	private Veiculo veiculo;
	
	public Lote(Integer numLote, Integer qtdeProd[]) {
		this.numLote = numLote;
		this.qtdeProd=qtdeProd;
	}
	
	
	public Integer getNumLote() {
		return numLote;
	}

	public void setNumLote(Integer numLote) {
		this.numLote = numLote;
	}

	public Object getTipo() {
		return tipo;
	}

	public void setTipo(Object tipo) {
		this.tipo = tipo;
	}

	public Leilao getLeilao() {
		return leilao;
	}

	public void setLeilao(Leilao leilao) {
		this.leilao = leilao;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}


	public Integer[] getQtdeProd() {
		return qtdeProd;
	}


	public void setQtdeProd(Integer qtdeProd[]) {
		this.qtdeProd = qtdeProd;
	}
	
}

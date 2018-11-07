package edu.fatec.sjc;

import java.util.Date;

public class Leilao {
	
	private Integer numeroLeilao;
	private String loteProdutos;
	private InstituicaoFinanceira instFin;
	private Date data;
	private String endereco;
	
	
	private java.lang.Object tipo;
	
	
	public Leilao(Integer numeroLeilao,String loteProdutos, Object tipo, InstituicaoFinanceira instFin, Date data, String endereco) {
		this.numeroLeilao = numeroLeilao;
		this.loteProdutos = loteProdutos;
		this.tipo = tipo;
		this.instFin = instFin;
		this.data = data;
		this.endereco = endereco;
	}

	public Integer getNumeroLeilao() {
		return numeroLeilao;
	}
	public void setNumeroLeilao(Integer numeroLeilao) {
		this.numeroLeilao = numeroLeilao;
	}
	public String getLoteProdutos() {
		return loteProdutos;
	}
	public void setLoteProdutos(String loteProdutos) {
		this.loteProdutos = loteProdutos;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public InstituicaoFinanceira getInstFin() {
		return instFin;
	}
	public void setInstFin(InstituicaoFinanceira instFin) {
		this.instFin = instFin;
	}
	
	
	

	public Object getTipo() {
		return tipo;
	}

	public void setTipo(Object tipo) {
		this.tipo = tipo;
	}

	

	public String toString(){
		return "\nNumero do Leilao:"+ this.numeroLeilao + ", Lote:"+this.loteProdutos + ", Instituição Financeira: " + this.instFin +", Data: "+ data +", Endereço: "+endereco+", Tipo: "+tipo;
	}
	
	
}

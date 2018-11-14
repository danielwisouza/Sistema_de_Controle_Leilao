package edu.fatec.sjc;

import java.util.Date;

public class Leilao {
	
	private Integer numeroLeilao;
	private Integer loteProdutos;
	private String instFin;
	private Date data;
	private String endereco;
	
	
	private Object tipo;
	
	
	public Leilao(Integer numeroLeilao,Integer loteProdutos, String instFin,  String endereco) {
		this.numeroLeilao = numeroLeilao;
		this.loteProdutos = loteProdutos;
		//this.tipo = tipo;
		this.instFin = instFin;
		//this.data = data;
		this.endereco = endereco;
	}

	public Integer getNumeroLeilao() {
		return numeroLeilao;
	}
	public void setNumeroLeilao(Integer numeroLeilao) {
		this.numeroLeilao = numeroLeilao;
	}
	public Integer getLoteProdutos() {
		return loteProdutos;
	}
	public void setLoteProdutos(Integer loteProdutos) {
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
	public String getInstFin() {
		return instFin;
	}
	public void setInstFin(String instFin) {
		this.instFin = instFin;
	}
	
	
	

	/*public Object getTipo() {
		return tipo;
	}

	public void setTipo(Object tipo) {
		this.tipo = tipo;
	}*/

	

	public String toString(){
		return "\nNumero do Leilao:"+ this.numeroLeilao + ", Lote:"+this.loteProdutos + ", Instituição Financeira: " + this.instFin +", Data: "+ data +", Endereço: "+endereco+", Tipo: "+tipo;
	}
	
	
}

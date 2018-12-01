package edu.fatec.sjc;

public class Veiculo {
	
	private Integer id;
	private String tipo;
	private String marca;
	private Integer ano;
	private String modelo;
	private String descricao;
	
	
	public Veiculo(Integer id, String tipo, String marca, Integer ano, String modelo, String descricao) {
		this.id = id;
		this.tipo=tipo;
		this.marca = marca;
		this.ano = ano;
		this.modelo = modelo;
		this.descricao = descricao;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String toString(){
		return "\nVEÍCULO - Marca:"+ this.marca + ", Ano:"+this.ano + ", Modelo: " + this.modelo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}

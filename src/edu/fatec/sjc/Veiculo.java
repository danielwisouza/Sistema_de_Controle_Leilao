package edu.fatec.sjc;

public class Veiculo {
	
	private Integer id;
	private String marca;
	private String ano;
	private String modelo;
	
	
	public Veiculo(String marca, String ano, String modelo) {
		this.marca = marca;
		this.ano = ano;
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
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

}

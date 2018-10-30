package edu.fatec.sjc;

public class Veiculo {
	
	private String marca;
	private Integer ano;
	private String modelo;
	
	
	public Veiculo(String marca, Integer ano, String modelo) {
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

}

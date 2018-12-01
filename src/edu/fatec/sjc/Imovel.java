package edu.fatec.sjc;

public class Imovel {
	
	private Integer id;
	private String registro;
	private String endereco;
	private String descricao;
	
	
	public Imovel(Integer id, String registro, String endereco, String descricao) {
		this.id = id;
		this.registro = registro;
		this.endereco = endereco;
		this.descricao = descricao;
		
	}
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String toString(){
		return "\nIMÓVEL - Número de Registro:"+ this.registro + ", Endereço:"+this.endereco + ", Descrição: " + this.descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}

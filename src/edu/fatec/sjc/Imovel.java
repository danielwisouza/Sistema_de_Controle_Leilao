package edu.fatec.sjc;

public class Imovel {
	
	private String registro;
	private String endereco;
	private String descricao;
	
	
	public Imovel(String registro, String endereco, String descricao) {
		
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
		return "\nIM�VEL - N�mero de Registro:"+ this.registro + ", Endere�o:"+this.endereco + ", Descri��o: " + this.descricao;
	}

}
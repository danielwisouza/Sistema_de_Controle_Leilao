package edu.fatec.sjc;


public class Cliente {
	
	private String CPF;
	private String nome;
	private String senha;
	private String certificadoDigital;
	private Leilao leilao;
	private String lances;
	
	public Cliente(String cpf, String nome, String senha, String certificadoDigital, Leilao leilao, String lance) {
		this.CPF = cpf;
		this.nome = nome;
		this.senha = senha;
		this.certificadoDigital = certificadoDigital;
		this.leilao = leilao;
		this.lances = lance;
	}
	
	

	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cpf) {
		CPF = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCertificadoDigital() {
		return certificadoDigital;
	}
	public void setCertificadoDigital(String certificadoDigital) {
		this.certificadoDigital = certificadoDigital;
	}
	
	public String toString(){
		return "\nNome:"+ this.nome + ", CPF:"+this.CPF + ", Certificado Digital: " + this.certificadoDigital+", Leilao: "+this.leilao+",Lance: "+this.lances;
	}



	public Leilao getLeilao() {
		return leilao;
	}



	public void setLeilao(Leilao leilao) {
		this.leilao = leilao;
	}
	
	public String getLances() {
		return lances;
	}
	public void setLances(String lances) {
		this.lances = lances;
	}
	
	

}
package edu.fatec.sjc;


public class Cliente {
	
	private String nome;
	private String senha;
	private String email;
	private String certificadoDigital;
	private Leilao leilao;
	private Lance lances;
	
	public Cliente(String email, String nome, String senha, String certificadoDigital, Leilao numLeilao, Lance lances) {
		this.email = email;
		this.nome = nome;
		this.senha = senha;
		this.certificadoDigital = certificadoDigital;
		this.leilao = numLeilao;
		this.lances = lances;
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
		return "\nNome:"+ this.nome + ",E-mail:"+this.email + ", Certificado Digital: " + this.certificadoDigital+", Leilao: "+this.leilao+",Lance: "+this.lances;
	}




	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*public Leilao getLeilao() {
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
	}*/
	
	

}

package edu.fatec.sjc;

public class PessoaFisica extends Cliente{

	private String cpf;
	
	public PessoaFisica(String cpf, String email, String nome, String senha, String certificadoDigital, String leilao) {
		super(email, nome, senha, certificadoDigital, leilao);
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}

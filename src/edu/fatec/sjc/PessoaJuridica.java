package edu.fatec.sjc;

public class PessoaJuridica extends Cliente{

	private String CNPJ;
	public PessoaJuridica(String cnpj, String email, String nome, String senha, String certificadoDigital, String leilao) {
		super(email, nome, senha, certificadoDigital, leilao);
		// TODO Auto-generated constructor stub
		this.CNPJ = cnpj;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

}

package edu.fatec.sjc;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Cadastro {
	
	//Variáveis utilizadas nos métodos
	private Scanner le;
	private String cpf, nome, senha, certDig, cnpj, 
	registro, endereco, descricao, loteProdutos, marca, 
	modelo, numLeilao, ano, numLote, tipo;
	private Date data;
	
	//PessoaFisicas
	private static ArrayList <PessoaFisica>pessoasFisicas = new ArrayList<PessoaFisica>();
	
	
	//Imóvel
	private static ArrayList <Imovel>imoveis = new ArrayList<Imovel>();
	
	//Veículo
	private static ArrayList <Veiculo>veiculos = new ArrayList<Veiculo>();
	
	//Instituição Financeira
	private static ArrayList <InstituicaoFinanceira>instFinanceiras = new ArrayList<InstituicaoFinanceira>();
	
	//Leilao
	static ArrayList <Leilao>leiloes = new ArrayList<Leilao>();

	//Lote
	static ArrayList <Lote> lotes = new ArrayList<Lote>();
	

	public Cadastro() {
		PessoaFisicas = new ArrayList<>();
		imoveis = new ArrayList<>();
		instFinanceiras = new ArrayList<>();
		leiloes = new ArrayList<>();
		veiculos = new ArrayList<>();
		lotes = new ArrayList<>();
		
		le = new Scanner(System.in);
	}
	
	

	public void salvarPessoaFisica(ArrayList<PessoaFisica> PessoaFisicas) throws Exception {
		FileOutputStream saida = new FileOutputStream("cadastro.txt");
		ObjectOutputStream saidaO = new ObjectOutputStream(saida);
		saidaO.writeObject(PessoaFisicas);
		saidaO.close();
	}

	@SuppressWarnings({ "resource", "unchecked" })
	public void receberPessoaFisica() throws Exception {
		FileInputStream entrada = new FileInputStream("cadastro.txt");
		ObjectInputStream entradaO = new ObjectInputStream(entrada);
		ArrayList<PessoaFisica> c = (ArrayList<PessoaFisica>) entradaO.readObject();
		PessoaFisicas = c;
	}

	public void GetDB() {

		try {
			receberPessoaFisica();
		} catch (Exception e) {
		}

	}


	void inserirPessoaFisica() {
		System.out.println("CPF: ");
		cpf = le.nextLine();
		System.out.println("Nome: ");
		nome = le.nextLine();
		System.out.println("Senha: ");
		nome = le.nextLine();
		System.out.println("Numero de Certificado Digital: ");
		certDig = le.nextLine();
		System.out.println("Numero do Leilao: ");
		numLeilao = le.nextLine();
		

		PessoaFisicas.add(new PessoaFisica ( cpf, nome, senha, certDig, numLeilao));

		System.out.println("Cadastrado!!!");
	}
	
	void inserirImovel() {
		System.out.println("Registro: ");
		registro = le.nextLine();
		System.out.println("Endereço: ");
		endereco = le.nextLine();
		System.out.println("Descrição: ");
		descricao = le.nextLine();
		
		imoveis.add(new Imovel(registro, endereco, descricao));
		System.out.println("Cadastrado!!!");
	}
	
	void inserirInstFin() {
		System.out.println("CNPJ: ");
		cnpj = le.nextLine();
		System.out.println("Nome: ");
		nome = le.nextLine();
		System.out.println("Endereco: ");
		endereco = le.nextLine();
		
		instFinanceiras.add(new InstituicaoFinanceira(cnpj, nome, endereco));
		System.out.println("Cadastrado!!!");
	}

	void inserirVeiculo() {
		System.out.println("Marca: ");
		marca = le.nextLine();
		System.out.println("Ano: ");
		ano = le.nextLine();
		System.out.println("Modelo: ");
		modelo = le.nextLine();
	}

	void inserirLeilao() {
		System.out.println("Numero do Leilao: ");
		numLeilao = le.next();
		System.out.println("Lote: ");
		loteProdutos = le.next();
		System.out.println("CPNJ da Instituição Financeira: ");
		cnpj = le.nextLine();
		System.out.println("Insira o lote: ");
		
		
		for (InstituicaoFinanceira instituicaoFinanceira : instFinanceiras) {
			if(cnpj != instituicaoFinanceira.getCnpj()) {
				System.out.println("Instituição Financeira não encontrada!");
			}
		}
		
	}
	
	void inserirLote() {
		System.out.println("Número do Lote: ");
		numLote = le.nextLine();
		System.out.println("Tipo do Lote - V para Veículos ou I para imóveis");
		
	}
	
	
	void imprimir() {
		int id = 0;
		for (PessoaFisica PessoaFisica : PessoaFisicas) {
			System.out.println("CPF: " + PessoaFisica.getCPF() + " | Nome: " + PessoaFisica.getNome() + "  \t| Certificado Digital: " + PessoaFisica.getCertificadoDigital());
			id++;
		}
		
		for (Imovel Imovel : imoveis) {
			System.out.println("Registro: " + Imovel.getRegistro() + " | Endereço: " + Imovel.getEndereco() + "  \t| Descricao: " + Imovel.getDescricao());
			id++;
		}
		
		for (InstituicaoFinanceira instituicaoFinanceira : instFinanceiras) {
			System.out.println("CNPJ: " + instituicaoFinanceira.getCnpj() + " | Nome: " + instituicaoFinanceira.getNome() + "  \t| Endereço: " + instituicaoFinanceira.getEndereco());
			id++;
		}
	}

	void removerPessoaFisica() {
		imprimir();
		System.out.println("Seleciona o ID: ");
		int i = le.nextInt();
		le.nextLine();
		PessoaFisicas.remove(i);
		System.out.println("Removido!!!");
	}

}

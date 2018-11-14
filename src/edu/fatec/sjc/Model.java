package edu.fatec.sjc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Model {

	// Variáveis utilizadas nos métodos
	private Scanner le;
	@SuppressWarnings("unused")
	private String nome, senha, certDig, cnpj, registro, endereco, descricao, loteProdutos, marca, modelo, ano, tipo,
			email;
	@SuppressWarnings("unused")
	private Date data;
	@SuppressWarnings("unused")
	private Integer numLeilao, qtde, numLote, id, valor;

	// Instanciando enuns
	TipoVeiculo tipoVeic;
	TipoImovel tipoImovel;

	// Clientes
	private static List<Cliente> clientes;

	// Imóvel
	private static List<Imovel> imoveis;

	// Veículo
	private static List<Veiculo> veiculos;

	// Instituição Financeira
	private static List<InstituicaoFinanceira> instFinanceiras;

	// Leilao
	static List<Leilao> leiloes;

	// Lote
	static List<Lote> lotes;

	// Lances
	static List<Lance> lances;

	public Model() {
		clientes = new ArrayList<>();
		imoveis = new ArrayList<>();
		instFinanceiras = new ArrayList<>();
		leiloes = new ArrayList<>();
		veiculos = new ArrayList<>();
		lotes = new ArrayList<>();
		lances = new ArrayList<>();

		le = new Scanner(System.in);
		
		Lote lote = new Lote(1, null);
		lotes.add(lote);
	}

	/*
	 * public void salvarCliente(ArrayList<Cliente> Clientes) throws Exception {
	 * FileOutputStream saida = new FileOutputStream("cadastro.txt");
	 * ObjectOutputStream saidaO = new ObjectOutputStream(saida);
	 * saidaO.writeObject(Clientes); saidaO.close(); }
	 * 
	 * @SuppressWarnings({ "resource", "unchecked" }) public void receberCliente()
	 * throws Exception { FileInputStream entrada = new
	 * FileInputStream("cadastro.txt"); ObjectInputStream entradaO = new
	 * ObjectInputStream(entrada); ArrayList<Cliente> c = (ArrayList<Cliente>)
	 * entradaO.readObject(); clientes = c; }
	 * 
	 * public void GetDB() {
	 * 
	 * try { receberCliente(); } catch (Exception e) { }
	 * 
	 * }
	 */

	void darLances() {
		System.out.println("Numero de Certificado Digital: ");
		certDig = le.nextLine();

		for (Cliente cliente : clientes) {
			if (certDig != cliente.getCertificadoDigital()) {
				System.out.println("Cliente não encontrado!");
				break;
			}
			// cliente = le.next();
			System.out.println("Insira o número do Leilão: ");
			numLeilao = le.nextInt();

			for (Leilao leilao : leiloes) {
				if (numLeilao != leilao.getNumeroLeilao()) {
					System.out.println("Leilão não encontrado!");
					break;
				}

				System.out.println("Insira o valor: ");
				valor = le.nextInt();

				lances.add(new Lance(valor, cliente));
			}

		}

	}

	void inserirCliente() {

		System.out.println("Nome: ");
		nome = le.nextLine();
		System.out.println("E-mail: ");
		email = le.nextLine();
		System.out.println("Senha: ");
		nome = le.nextLine();
		System.out.println("Numero de Certificado Digital: ");
		certDig = le.nextLine();

		clientes.add(new Cliente(nome, email, senha, certDig, null, null));

		System.out.println("Cadastrado!!!");
	}

	void inserirImovel() {
		System.out.println("Id: ");
		id = le.nextInt();
		System.out.println("Registro: ");
		registro = le.nextLine();
		System.out.println("Endereço: ");
		endereco = le.nextLine();
		System.out.println("Digite uma das opções referente ao tipo do Imóvel:");
		System.out.println("\nApartamentos, Terrenos, Casas, Edifícios Comerciais");
		tipo = le.nextLine();
		// if(tipo == )
		System.out.println("Descrição: ");
		descricao = le.nextLine();

		imoveis.add(new Imovel(registro, endereco, descricao));
		System.out.println("Cadastrado!!!");
	}

	void inserirVeiculo() {
		System.out.println("Id: ");
		id = le.nextInt();
		System.out.println("Marca: ");
		marca = le.nextLine();
		System.out.println("Ano: ");
		ano = le.nextLine();
		System.out.println("Modelo: ");
		modelo = le.nextLine();
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

	void inserirLeilao() {
		System.out.println("Numero do Leilao: ");
		numLeilao = le.nextInt();
		System.out.println("CPNJ da Instituição Financeira: ");
		cnpj = le.next();
		for (InstituicaoFinanceira instituicaoFinanceira : instFinanceiras) {
			if (!cnpj.equals(instituicaoFinanceira.getCnpj())) {
				System.out.println("Instituição Financeira não encontrada!");

			} else {

				System.out.println("Insira o número do lote: ");
				numLote = le.nextInt();
				for (Lote lote : lotes) {
					if (!numLote.equals(lote.getNumLote())) {
						System.out.println("Lote não encontrado!");
					} else {

						/*
						 * System.out.println("Insira a Data: "); Date data = le.nextInt();
						 */

						System.out.println("Insira o Endereço: ");
						endereco = le.next();
					}
				}
			}
		}

		leiloes.add(new Leilao(numLeilao, numLote, cnpj, endereco));

	}

	@SuppressWarnings("null")
	void inserirLote() {

		Integer produtos[] = null;

		System.out.println("Número do Lote: ");
		numLote = le.nextInt();
		System.out.println("Insira a quantidade de produtos: ");
		qtde = le.nextInt();

		for (int i = 0; i < qtde; i++) {
			System.out.println("Tipo do Lote - V para Veículos ou I para imóveis");
			tipo = le.nextLine();
			if (tipo == "V" || tipo == "v") {
				inserirVeiculo();
				for (Veiculo veiculo : veiculos) {
					produtos[i] = veiculo.getId();
				}
			}

			if (tipo == "I" || tipo == "i") {
				inserirImovel();
				for (Imovel imovel : imoveis) {
					produtos[i] = imovel.getId();
				}
			}
		}
		lotes.add(new Lote(numLote, produtos));
	}

	void imprimirCliente() {
		for (Cliente Cliente : clientes) {
			System.out.println(
					" | Nome: " + Cliente.getNome() + "  \t| Certificado Digital: " + Cliente.getCertificadoDigital());
		}

	}

	void imprimirImoveis() {
		for (Imovel Imovel : imoveis) {
			System.out.println("ID: " + Imovel.getId() + " | Registro: " + Imovel.getRegistro() + " | Endereço: "
					+ Imovel.getEndereco() + "  \t| Descricao: " + Imovel.getDescricao());
		}
	}

	void imprimirVeiculos() {
		for (Veiculo veiculo : veiculos) {
			System.out.println("ID: " + veiculo.getId() + " | Marca: " + veiculo.getMarca() + "  \t| Ano: "
					+ veiculo.getAno() + "  \t| Modelo: " + veiculo.getModelo());
		}
	}

	void imprimirInstFin() {
		for (InstituicaoFinanceira instituicaoFinanceira : instFinanceiras) {
			System.out.println("CNPJ: " + instituicaoFinanceira.getCnpj() + " | Nome: "
					+ instituicaoFinanceira.getNome() + "  \t| Endereço: " + instituicaoFinanceira.getEndereco());
		}
	}

	void imprimirLeiloes() {
		for (Leilao leilao : leiloes) {
			System.out.println("Número do leilão: " + leilao.getNumeroLeilao() + " | Lote: " + leilao.getLoteProdutos()
					+ "  \t| Instituição Financeira: " + leilao.getInstFin() + "  \t| Data: " + leilao.getData()
					+ "  \t| Endereço: " + leilao.getEndereco());
		}
	}

	void imprimirLotes() {
		for (Lote lote : lotes) {
			System.out.println("Número do lote: " + lote.getNumLote() + " | Produtos: " + lote.getQtdeProd());
		}
	}

	void imprimirLances() {
		for (Lance lance : lances) {
			System.out.println("Valor: " + lance.getValor() + " | Cliente: " + lance.getCliente() + " | Leilao: "
					+ lance.getLeilao());
		}
	}

	void removerCliente() {
		imprimirCliente();
		System.out.println("Seleciona o ID: ");
		int i = le.nextInt();
		le.nextLine();
		clientes.remove(i);
		System.out.println("Removido!!!");
	}

}

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
	
	
	//vetor com id dos produtos
	Integer produtos[];

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

	

	void darLances() {
		System.out.println("Numero de Certificado Digital: ");
		certDig = le.next();

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

				lances.add(new Lance(valor, cliente, numLeilao));
			}

		}

	}

	void inserirCliente() {

		System.out.println("Nome: ");
		nome = le.next();
		System.out.println("E-mail: ");
		email = le.next();
		System.out.println("Senha: ");
		nome = le.next();
		System.out.println("Numero de Certificado Digital: ");
		certDig = le.next();

		clientes.add(new Cliente(nome, email, senha, certDig, null, null));

		System.out.println("Cadastrado!!!");
	}

	void inserirImovel() {
		/*System.out.println("Id: ");
		id = le.nextInt();*/
		System.out.println("Registro: ");
		registro = le.next();
		System.out.println("Endereço: ");
		endereco = le.next();
		System.out.println("Digite uma das opções referente ao tipo do Imóvel:");
		System.out.println("\nApartamento, Terreno, Casa, Edifício Comercial");
		tipo = le.next();
		if(tipo.equals("Apartamento")||tipo.equals("Terreno")||tipo.equals("Casa")||tipo.equals("Edifício Comercial")) {
			System.out.println("Descrição: ");
			descricao = le.next();
		}else {
			System.out.println("Tipo de imóvel não encontrado");
		}
		imoveis.add(new Imovel(registro, endereco, descricao));
		System.out.println("Cadastrado!!!");
	}

	void inserirVeiculo() {
		System.out.println("Id: ");
		id = le.nextInt();
		
		System.out.println("Digite uma das opções referente ao tipo do Veículo:");
		System.out.println("\nCarro, Motocicleta, Bicicleta, Patinete, Skate");
		tipo = le.next();
		
	
		
		if(tipo.equals("Carro")||tipo.equals("Motocicleta")||tipo.equals("Bicicleta")||tipo.equals("Patinete")||tipo.equals("Skate")) {
			System.out.println("Descrição: ");
			descricao = le.next();
			
			System.out.println("Marca: ");
			marca = le.next();
			System.out.println("Ano: ");
			ano = le.next();
			System.out.println("Modelo: ");
			modelo = le.next();
		}else {
			System.out.println("Tipo de imóvel não encontrado");
			
		}
		
		veiculos.add(new Veiculo(id, tipo, descricao, marca, ano, descricao));
		
	}

	void inserirInstFin() {
		System.out.println("CNPJ: ");
		cnpj = le.next();
		System.out.println("Nome: ");
		nome = le.next();
		System.out.println("Endereco: ");
		endereco = le.next();

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

		

		System.out.println("Número do Lote: ");
		numLote = le.nextInt();
		System.out.println("Insira a quantidade de produtos: ");
		qtde = le.nextInt();

		for (int i = 0; i < qtde; i++) {
			System.out.println("Tipo do Lote - V para Veículos ou I para imóveis");
			tipo = le.next();
			if (tipo.equals("V")  || tipo.equals("v") ) {
				System.out.println("Insira o ID do veículo: ");
				id = le.nextInt();
				for (Veiculo veiculo : veiculos) {
					if(id.equals(veiculo.getId())) {
					produtos[i] = id;
					}else {
						System.out.println("Veículo não encontrado");
						break;
					}
				}
			}else {

			if (tipo.equals("I")  || tipo.equals("i")) {
				System.out.println("Insira o ID do Imóvel: ");
				Integer id = le.nextInt();
				for (Imovel imovel : imoveis) {
					if(id.equals(imovel.getId())) {
						produtos[i] = imovel.getId();
						
					}else {
						System.out.println("Imóvel não encontrado");
						break;
					}
				}
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
			System.out.println("Registro: " + Imovel.getRegistro() + " | Endereço: "
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
		
		System.out.println("Insira o nome: ");
		nome = le.next();
		
		for(Cliente cliente: clientes) {
			for (Lance lance : lances) {
				
				if(cliente.getNome().equals(nome) && cliente.equals(lance.getCliente())) {
				System.out.println("Valor: " + lance.getValor() + " | Cliente: " + lance.getCliente() + " | Leilao: "
						+ lance.getNumLeilao());
			}
		}
	  }
	}

	@SuppressWarnings("unlikely-arg-type")
	/*void removerCliente() {
		imprimirCliente();
		System.out.println("Insira o certificado digital: ");
		String i = le.next();
		for (Cliente cliente : clientes) {
			
			if(cliente.getCertificadoDigital().equals(i))
				clientes.remove(i);
		}
		
		System.out.println("Removido!!!");
	}*/
	
	void removerCliente() {
		
		System.out.println("Insira o certificado digital: ");
		String ctd = le.next();
		
	for (int i = 0; i < clientes.size(); i++) {
	    if (clientes.get(i).getCertificadoDigital().equals(ctd)) {
	      clientes.remove(i);
	    }
	  }
	System.out.println("Removido!!!");
	}
	
	
	void removerImovel() {
		
		System.out.println("Insira o Registro: ");
		String registro = le.next();
		
	for (int i = 0; i < imoveis.size(); i++) {
	    if (imoveis.get(i).getRegistro().equals(registro)) {
	      imoveis.remove(i);
	    }
	  }
	System.out.println("Removido!!!");
	}
	
	
	void removerVeiculo() {
		
		System.out.println("Insira o ID: ");
		int id = le.nextInt();
		
	for (int i = 0; i < veiculos.size(); i++) {
	    if (veiculos.get(i).getId().equals(id)) {
	      veiculos.remove(i);
	    }
	  }
	System.out.println("Removido!!!");
	}
	
	void removerInstFin() {
		
		System.out.println("Insira o CNPJ: ");
		cnpj = le.next();
		
	for (int i = 0; i < instFinanceiras.size(); i++) {
	    if (instFinanceiras.get(i).getCnpj().equals(cnpj)) {
	    	instFinanceiras.remove(i);
	    }
	  }
	System.out.println("Removido!!!");
	}
	
	void removerLeilao() {
		
		System.out.println("Insira o numero do Leilao: ");
		numLeilao = le.nextInt();
		
	for (int i = 0; i < leiloes.size(); i++) {
	    if (leiloes.get(i).getNumeroLeilao().equals(numLeilao)) {
	    	leiloes.remove(i);
	    }
	  }
	System.out.println("Removido!!!");
	}
	
	void removerLote() {
		
		System.out.println("Insira o numero do Lote: ");
		numLote = le.nextInt();
		
	for (int i = 0; i < lotes.size(); i++) {
	    if (lotes.get(i).getNumLote().equals(numLote)) {
	    	lotes.remove(i);
	    }
	  }
	System.out.println("Removido!!!");
	}

}

package edu.fatec.sjc;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
	
	static ArrayList <Cliente>clientes = new ArrayList<Cliente>();
	static ArrayList <Leilao>leiloes = new ArrayList<Leilao>();
	Scanner input = new Scanner (System.in);
	 
	public static void main(String[] args) {
		Model model = new Model();
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		int resposta;
		
	    
	    //Menu *INTERFACE GUI*
		do {
		resposta = Integer.parseInt(JOptionPane.showInputDialog("Digite o que deseja fazer :"
	            + "\n1 - Cadastro de Usuário (Cliente)"
	            + "\n2 - Cadastro de Instituição Financeira"
	            + "\n3 - Cadastro de Imóvel"
	            + "\n4 - Cadastro de Veículo"
	            + "\n5 - Cadastro de Leilão"
	            + "\n6 - Cadastro de Lote"
	            + "\n7 - Imprimir Clientes"
	            + "\n9 - Remover Clientes"
	            + "\n10 - Imprimir Imoveis"
	            + "\n11 - Remover Imoveis"
	            + "\n12 - Imprimir Veiculos"
	            + "\n13 - Remover Veiculos"
	            + "\n14 - Imprimir Instituição Financeira"
	            + "\n15 - Remover Instituição Financeira"
	            + "\n16 - Imprimir Lote"
	            + "\n17 - Remover Lote"
	            + "\n18 - Imprimir Leilão"
	            + "\n19 - Remover Leilão"
	            + "\n20 - Dar Lance"
	            + "\n20 - Imprimir Lances por Cliente"

	            + "\n8 - Sair"));

		
	    switch(resposta){
	        case 1 :
	            model.inserirCliente();
	        break;
	        case 2 :
	        	model.inserirInstFin();
	        break;
	        case 3 :
	        	model.inserirImovel();
	        break;    
	        case 4 :
	        	model.inserirVeiculo();
	        break;
	        case 5 :
	        	model.inserirLeilao();
	        break;
	        case 6 :
	        	model.inserirLote();
	        break;
	        case 7 :
	        	model.imprimirCliente();
	        break;
	        case 9 :
	        	model.removerCliente();
	        break;
	        case 10 :
	        	model.imprimirImoveis();
	        break;
	        case 11 :
	        	model.removerImovel();
	        break;
	        case 12 :
	        	model.imprimirVeiculos();
	        break;
	        case 13 :
	        	model.removerVeiculo();
	        break;
	        case 14 :
	        	model.imprimirInstFin();
	        break;
	        case 15 :
	        	model.removerInstFin();
	        break;
	        case 16 :
	        	model.imprimirLotes();
	        break;
	        case 17 :
	        	model.removerLote();
	        break;
	        case 18 :
	        	model.imprimirLeiloes();
	        break;
	        case 19 :
	        	model.removerLeilao();
	        break;
	        case 20 :
	        	model.darLances();
	        break;
	        case 21 :
	        	model.imprimirLances();
	        break;
	        
	        case 8 :
	        	System.out.println("Processo Finalizado");
	        break;
	        
	        default:
	        
	        break;
	    }}while(resposta != 7);
	}

}

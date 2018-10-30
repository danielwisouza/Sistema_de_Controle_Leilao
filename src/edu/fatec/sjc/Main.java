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
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
		
		try {
			
			Object imovel = new Imovel("1", "Avenida 1", "4 comodos");
			
			Object veiculo = new Veiculo("Volks", 2010, "Gol");
			
			InstituicaoFinanceira instFin = new InstituicaoFinanceira("121212121212", "Instituicao1", "Avenida2");
			Date data = sdf.parse("23/11/2015");			
			
			Leilao leilao = new Leilao(1, "1", imovel, instFin, data , "Avenida3");
			leiloes.add(leilao);
			Leilao leilao2 = new Leilao(2, "2", veiculo, instFin, data , "Avenida3");
			leiloes.add(leilao2);
			
			
			Cliente cliente = new Cliente("400.000.000-00", "Bruna", "123", "1234", leilao, "100.000,00");
			clientes.add(cliente);
			Cliente cliente2 = new Cliente("500.000.000-00", "Maria", "1234", "12345", leilao2, "20.000,00");
			clientes.add(cliente2);
			
			System.out.println(leiloes);
			System.out.println(clientes);
			System.out.println(imovel);
			System.out.println(veiculo);
			System.out.println(instFin);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	    
	    //Menu *INTERFACE GUI*
	    int resposta = Integer.parseInt(JOptionPane.showInputDialog("Digite o que deseja fazer :"
	            + "\n1 - Cadastro de Usuário (Cliente)"
	            + "\n2 - Cadastro de Instituição Financeira"
	            + "\n3 - Cadastro de Imóveis"
	            + "\n4 - Cadastro de Veículos"
	            + "\n5 - Cadastro de Leilões"
	            + "\n6 - Sair"));

	    switch(resposta){
	        case 1 :
	            
	        break;
	        case 2 :
	            
	        break;
	        case 3 :
	        
	        break;    
	        case 4 :
	            
	        break;
	        case 5 :
	            
	        break;
	        default:
	        
	        break;
	    }
	}
	
}

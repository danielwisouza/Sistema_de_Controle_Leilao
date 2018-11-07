package edu.fatec.sjc;

public enum TipoVeiculo {
	CARROS("Carro"), MOTOCICLETAS("Motocicleta"), 
	BICICLETA("Bicicleta"), PATINETE("Patinete"), SKATE("Skate");

	private final String valor;
	TipoVeiculo(String valorOpcao){
		valor = valorOpcao;
	}
	
	public String getValor() {
		return valor;
	}
}


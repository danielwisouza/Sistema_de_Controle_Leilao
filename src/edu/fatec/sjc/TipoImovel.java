package edu.fatec.sjc;

public enum TipoImovel {
	APARTAMENTOS("Apartamentos"), TERRENOS("Terrenos"), 
	CASAS("Casas"), EDIFICIOS_COMERCIAIS("Edif�cios Comerciais");
	
	private final String valor;
	TipoImovel(String valorOpcao){
		valor = valorOpcao;
	}
	
	public String getValor() {
		return valor;
	}
}
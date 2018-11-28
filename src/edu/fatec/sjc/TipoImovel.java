package edu.fatec.sjc;

public enum TipoImovel {
	APARTAMENTOS("Apartamento"), TERRENOS("Terreno"), 
	CASAS("Casa"), EDIFICIOS_COMERCIAIS("Edifício Comercial");
	
	private final String valor;
	TipoImovel(String valorOpcao){
		valor = valorOpcao;
	}
	
	public String getValor() {
		return valor;
	}
}

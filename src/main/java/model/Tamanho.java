package model;

public enum Tamanho {
	PEQUENO(1),MEDIO(2),GRANDE(3),LATINHA250ML(4),LATA350ML(5),SEISCENTOS(6),UMLITRO(7);
	
	private final int valor;

	private Tamanho(int Tamanho) {
		valor = Tamanho;
	}

	public int getValor() {
		return valor;
	}

}

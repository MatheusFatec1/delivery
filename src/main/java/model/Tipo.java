package model;

public enum Tipo {
	BATATA(1), REFRI(2),SUCO(3),AGUA(4);

	private final int valor;

	private Tipo(int Tipo) {
		valor = Tipo;
	}
	public int getValor() {
		return valor;
	}
}

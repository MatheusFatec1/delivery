package model;

	public enum Pagamento {
	DINHEIRO(1),CREDITO(2),DEBITO(3);
		
	private final int valor;

	private Pagamento(int Pagamento) {
		valor = Pagamento;
	}

	public int getValor() {
		return valor;
	}
}

package model;

public enum Status {

		PREPARANDO(1),PRONTO(2),DELIVERY(3),ENTREGUE(4);
			
		private final int valor;

		private Status(int Status) {
			valor = Status;
		}

		public int getValor() {
			return valor;
		}
}

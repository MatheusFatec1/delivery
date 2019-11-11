package model;

public class Endereco {
	private String cpfuser;
	private String rua;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	
	
	
	public Endereco() {
		
	}

	public Endereco(String cpfuser, String rua, int numero, String complemento, String bairro, String cidade) {
		super();
		this.cpfuser = cpfuser;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	public String getCpfuser() {
		return cpfuser;
	}

	public void setCpfuser(String cpfuser) {
		this.cpfuser = cpfuser;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	
}

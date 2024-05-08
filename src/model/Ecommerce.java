package model;

public abstract class Ecommerce {
	
	private int identificador;
	private int tipo;
	private String titular;
	
	public Ecommerce(int identificador, int tipo, String titular) {
		this.identificador = identificador;
		this.tipo = tipo;
		this.titular = titular;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void visualizar() {

		String tipo = "";
		
		switch(this.tipo) {
		case 1:
			tipo = "Produto Entrega";
		break;
		case 2:
			tipo = "Produto Retirada";
		break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("                      Lojas Matrix:");
		System.out.println("***********************************************************");
		System.out.println("Identificador: " + this.identificador);
		System.out.println("Tipo de envio: " + tipo);
		System.out.println("Titular: " + this.titular);

	}
  
	}
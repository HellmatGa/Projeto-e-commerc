package model;

public class ProdutoRetirada extends Ecommerce {
	
	private String dia;

	public ProdutoRetirada(int identificador, int tipo, String titular, String dia) {
		super(identificador, tipo, titular);
		this.dia = dia;
		// TODO Auto-generated constructor stub
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Dia de retirada: " + this.dia);
	}
}

package model;

public class ProdutoEntrega extends Ecommerce {

	private int prazo;
	
	public ProdutoEntrega(int identificador, int tipo, String titular, int prazo) {
		super(identificador, tipo, titular);
		this.prazo = prazo;
		// TODO Auto-generated constructor stub
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("Prazo de entrega: " + this.prazo);
	}
}
package ecommerce.repository;

import model.Ecommerce;

public interface ContaRepository {
	
	//Crud Ecommerce
	public void listarTodos(int numero);
	public void listarId();
	public void cadastrar(Ecommerce Ecommerce);
	public void Atualizar(Ecommerce Ecommerce);
	public void Deletar(int numero);
	
	//Metodos da logistica
	public void prazo(int numero);
	public void dia(String dia);
}

package aula1;

public class Servicos {
	
	Repositorio repositorio = new Repositorio();
	
	public void criarProduto(String nome, String fabricante, double preco) {
		Produto p1 = new Produto(nome, fabricante, preco);
		repositorio.adicionaProduto(p1);
		
	}
	
	public void criarLote(Produto produto, int quantidade, int data) {
		Lote l1 = new Lote(quantidade, data, produto);
	}
	
	public void listarProdutos() {
	}
	
	public void listarLotes() {
		
	}
}

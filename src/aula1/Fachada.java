package aula1;

public class Fachada {
	
	Servicos sv = new Servicos();
	
	public void criarProduto(String nome, String fabricante, double preco) {
		sv.criarProduto(nome, fabricante, preco);
	}
	
	public void criarLote(Produto produto, int quantidade, int data) {
		sv.criarLote(produto, quantidade, data);
	}
	
	public void listarProduto() {
		sv.listarProdutos();
	}
	public void listarLote() {
		sv.listarLotes();;
	}
}

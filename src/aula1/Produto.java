package aula1;

public class Produto {
	
	private String nome;
	private String fabricante;
	private double preco;
	
	public Produto(String nome, String fabricante, double preco) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		String descricao = "Nome: " + this.nome +"; ";
		descricao += "Fabricante: " + this.fabricante + "; ";
		descricao += "Preço: " + this.preco + "; ";
		return descricao;
	}
}

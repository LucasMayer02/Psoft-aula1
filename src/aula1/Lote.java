package aula1;
import java.util.*;

public class Lote {
	private int qtd;
	private int data;
	private Produto prod;
	
	public Lote(int qtd, int data, Produto prod) {
		this.qtd = qtd;
		this.data = data;
		this.prod = prod;
	}
	
	@Override
	public String toString() {
		String descricao = "Quantidade: " + this.qtd + "; ";
		descricao += "Data: " + this.data + "; ";
		descricao += "Produto: (" + this.prod + ")";
		return descricao;
	}
}

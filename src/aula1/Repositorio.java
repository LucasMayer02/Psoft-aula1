package aula1;
import java.util.*;

public class Repositorio {
	private ArrayList<Produto> produtos = new ArrayList<>();
	private ArrayList<Lote> lotes = new ArrayList<>();
	
	public Repositorio() {
		this.produtos = new ArrayList<>();
		this.lotes = new ArrayList<>();
	}
	
	public void adicionaProduto(Produto p1) {
		produtos.add(p1);
	}
	
	public void listaProdduto(Lote l1) {
		lotes.add(l1);
	}
}

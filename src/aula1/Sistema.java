package aula1;
import java.util.*;

public class Sistema {
	
	public static void main(String[] args) {
		Fachada f1 = new Fachada();
		
		f1.criarProduto("Iphone", "Apple", 4500);
		Produto p = new Produto("Iphone", "Apple", 4500);
		f1.criarLote(p, 2000, 2022);
		Lote l = new Lote(2000, 2022, p);
	}
	
}

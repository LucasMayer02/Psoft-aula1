package aula1;

public class Sistema {
	
	public static void main(String[] args) {
		Produto p = new Produto("Iphone", "Apple", 4500);
		Lote l = new Lote(2000, 2022, p);
	}
}

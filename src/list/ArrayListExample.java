package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		exemploListaSimples();
		exemploListaSimplesOrdemAscendente();

	}

	private static void exemploListaSimples(){
		System.out.println("*** Exemplo de Lista Simples ***");
		List<String> lista = new ArrayList<String>();
		lista.add("Zézin");
		lista.add("Maria");
		lista.add("João");
		System.out.println(lista);
		System.out.println("");
	}

	private static void exemploListaSimplesOrdemAscendente(){
		System.out.println("*** Exemplo de Lista com Ordem Ascendente ***");
		List<String>  lista = new ArrayList<String>();
		lista.add("Zézin");
		lista.add("Maria");
		lista.add("João");
		Collections.sort(lista);
		System.out.println(lista);
		System.out.println("");
	}


}

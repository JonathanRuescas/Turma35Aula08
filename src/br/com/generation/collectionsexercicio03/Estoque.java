package br.com.generation.collectionsexercicio03;

import java.util.ArrayList;

public class Estoque {
	
	public static void main(String[] args) {
		String estoque1 = "Note";
		String estoque2 = "Maquina de lavar";
		String estoque3 = "celular";
		String estoque4 = "PC";
		String estoque5 = "Lava louças";
		
		ArrayList<String> estoque = new ArrayList<>();
		estoque.add(estoque1);
		estoque.add(estoque2);
		estoque.add(estoque3);
		estoque.add(estoque4);
		
		System.out.println(estoque);
		
		estoque.add(estoque5);
		System.out.println(estoque);
		
		estoque.remove(0);
		System.out.println(estoque);
		
		for(String i: estoque) {
			System.out.println("Temos os produtos: " + i);

}
}
}
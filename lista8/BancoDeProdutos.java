package lista8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class BancoDeProdutos {

		
		private static HashMap<Long, Produto> mapaHash;
		private static TreeMap<Long, Produto> mapaTree;
		
		public static void main(String[] args) {
			
			mapaHash = new HashMap<Long, Produto>();
			povoarHash(mapaHash);
			System.out.println("\n++++++++++++++++++++++++++++++\n");
			mapaTree = new TreeMap<Long, Produto>();
			povoarHash(mapaTree);
			
		}
		
		private static void povoarHash(Map<Long, Produto> mapa) {
			
			Produto p1 = new Produto(123,"Manga", 2.00);
			Produto p2 = new Produto(345,"Pera", 2.00);
			Produto p3 = new Produto(568,"Jabuticaba", 2.00);
			Produto p4 = new Produto(256,"Morango", 2.00);
			Produto p5 = new Produto(258,"Gengibre", 2.00);
			Produto p6 = new Produto(258,"Uva", 2.00);
			
			mapa.put(p1.getCodigo(), p1);
			mapa.put(p2.getCodigo(), p2);
			mapa.put(p3.getCodigo(), p3);
			mapa.put(p4.getCodigo(), p4);
			mapa.put(p5.getCodigo(), p5);
			mapa.put(p6.getCodigo(), p6);
			
			
			Set<Entry<Long, Produto>> entries = mapa.entrySet();
			for (Entry<Long, Produto> entry : entries) {
				System.out.println("Chave: "+entry.getKey()+" , Nome: "+entry.getValue().getNome());
			}
			
			
		}

}

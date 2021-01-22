package lista8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		
		Set<Aluno> conjAlunos = new HashSet<Aluno>();
		conjAlunos.add(new Aluno("Ana"));
		conjAlunos.add(new Aluno("Júlia"));
		conjAlunos.add(new Aluno("Matheus"));
		conjAlunos.add(new Aluno("Matheus"));
		System.out.println(conjAlunos.size());
		
		TreeSet<Aluno> aset = new TreeSet<Aluno>();
		aset.add(new Aluno("Roberto"));
		aset.add(new Aluno("Miguel"));
		aset.add(new Aluno("Maria"));

			System.out.print(aset.size());
	
	}	

}

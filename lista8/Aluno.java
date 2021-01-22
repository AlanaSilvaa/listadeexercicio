package lista8;

public class Aluno implements Comparable<Aluno> {
		
	  private String nome;

	public Aluno(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean equals(Object obj) {
		return this.getNome().equals(((Aluno) obj).getNome());
	}
	
	public int hashCode () {
		return this.getNome().length();
	}

	@Override
	public int compareTo(Aluno o) {
		return this.getNome().length();
	}
}
	


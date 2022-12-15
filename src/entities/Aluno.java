package entities;

import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
	private String nomeAluno;

	public Aluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomeAluno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nomeAluno, other.nomeAluno);
	}

	@Override
	public int compareTo(Aluno o) {
		return nomeAluno.compareTo(o.getNomeAluno());
	}

	@Override
	public String toString() {
		return "Aluno [nomeAluno=" + nomeAluno + "]";
	}
	
	
}

package entities;

import java.util.Objects;
import java.util.Set;

public class CursoOnline implements Comparable<CursoOnline>{
	private String nomeCurso;
	private Instrutor nomeInstrutor;
	private Set<Aluno> alunos;

	
	public CursoOnline() {
	}	

	public CursoOnline(String nomeCurso, Instrutor nomeInstrutor, Set<Aluno> alunos) {
		this.nomeCurso = nomeCurso;
		this.nomeInstrutor = nomeInstrutor;
		this.alunos = alunos;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public CursoOnline(Instrutor nomeInstrutor) {
		this.nomeInstrutor = nomeInstrutor;
	}

	public Set<Aluno> getAlunos() {
		return alunos;
	}

	public int alunosQntity() {
		return alunos.size();
	}

	public void addAlunos(Aluno aluno) {
		this.alunos.add(aluno);
	}	

	@Override
	public String toString() {
		return "CursoOnline [nomeCurso=" + nomeCurso + ", nomeInstrutor=" + nomeInstrutor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(alunos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CursoOnline other = (CursoOnline) obj;
		return Objects.equals(alunos, other.alunos);
	}

	@Override
	public int compareTo(CursoOnline other) {
		return nomeCurso.compareTo(other.getNomeCurso());
	}

	
	
}

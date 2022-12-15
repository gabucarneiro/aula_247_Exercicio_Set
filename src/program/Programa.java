package program;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.Aluno;
import entities.CursoOnline;
import entities.Instrutor;

public class Programa {

	public static void main(String[] args) {
		//Exercício sobre SET<>
		//TreeSet - Utiliza Comparable (necessita implementar Comparable para chamar esse
		//HashSet - O mais rápido
		Instrutor instrutor = new Instrutor("FDP");
		Set<Aluno> setCursoA = new TreeSet<Aluno>();
		Set<Aluno> setCursoB = new TreeSet<Aluno>();
		Set<Aluno> setCursoC = new TreeSet<Aluno>();
		CursoOnline cursoA = new CursoOnline("CursoA", instrutor, setCursoA);
		CursoOnline cursoB = new CursoOnline("CursoB", instrutor, setCursoB);
		CursoOnline cursoC = new CursoOnline("CursoC", instrutor, setCursoC);
		
		Aluno alunoA = new Aluno("Joao");
		Aluno alunoB = new Aluno("Caio");
		Aluno alunoC = new Aluno("Cesar");
		Aluno alunoD = new Aluno("Berg");
		Aluno alunoE = new Aluno("Priscila");
		//Aluno alunoF = new Aluno("Ana");
		
		cursoA.addAlunos(alunoA);
		cursoA.addAlunos(alunoC);
		cursoA.addAlunos(alunoB);
		cursoA.addAlunos(alunoE);
		cursoA.addAlunos(alunoB);
		cursoA.addAlunos(alunoB);
		cursoA.addAlunos(alunoE);
		cursoB.addAlunos(alunoA);
		cursoB.addAlunos(alunoB);
		cursoB.addAlunos(alunoD);
		cursoC.addAlunos(alunoC);
		System.out.println("Quantidade de alunos no CURSO A: " + cursoA.alunosQntity());
		System.out.println("Quantidade de alunos no CURSO B: " + cursoB.alunosQntity());
		System.out.println("Quantidade de alunos no CURSO C: " + cursoC.alunosQntity());
		
		Set<Aluno> alunos = new HashSet<Aluno>();
		alunos.addAll(cursoA.getAlunos());
		alunos.addAll(cursoB.getAlunos());
		alunos.addAll(cursoC.getAlunos());
		
		Set<CursoOnline> curso = new TreeSet<CursoOnline>();
		curso.add(cursoA);
		curso.add(cursoB);
		curso.add(cursoC);
		System.out.println("Quantidade de alunos: " + alunos.size());
		for(CursoOnline co : curso) {
			System.out.println(" * " + co.getNomeCurso() + " * ");
			for(Aluno a : co.getAlunos()) {
				System.out.println(" - " + a.getNomeAluno());
			}
		}

	}

}

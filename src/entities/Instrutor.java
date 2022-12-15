package entities;

public class Instrutor {
	private String nomeInstrutor;

	public Instrutor(String nomeInstrutor) {
		this.nomeInstrutor = nomeInstrutor;
	}

	public String getNomeInstrutor() {
		return nomeInstrutor;
	}

	@Override
	public String toString() {
		return "Instrutor [nomeInstrutor=" + nomeInstrutor + "]";
	}
	
	
}

package br.edu.unipe.aps2.exercicio1;

public class Aniversariante {
	
	private String nome;
	private DataAniversario dataAniversario;
	
	//gets e sets...

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Aniversariante other = (Aniversariante) obj;
		if (nome == null) {
			if (other.nome != null) return false;
		} else if (!nome.equals(other.nome)) return false;
		if (dataAniversario == null) {
			if (other.dataAniversario != null) return false;
		} else if (!dataAniversario.equals(other.dataAniversario)) return false;
		return true;
	}
}

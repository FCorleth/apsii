package br.edu.unipe.aps2.exercicio1;

public class Aniversariante {
	
	private String nome;
	private DataAniversario dataAniversario;
	
	//gets e sets...

	public Aniversariante(String nome, int dia, int mes) {
		this.nome = nome;
		this.dataAniversario = new DataAniversario();
		try {
			java.lang.reflect.Method m = DataAniversario.class.getDeclaredMethod("DataAniversario", int.class, int.class);
			m.invoke(this.dataAniversario, dia, mes);
		} catch (Exception e) {
		}
	}

	public Aniversariante(String nome, DataAniversario dataAniversario) {
		this.nome = nome;
		this.dataAniversario = dataAniversario;
	}

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

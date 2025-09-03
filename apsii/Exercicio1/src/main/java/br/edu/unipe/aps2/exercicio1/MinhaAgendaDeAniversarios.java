package br.edu.unipe.aps2.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {
    private List<Aniversariante> aniversariantes = new ArrayList<>();

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {
        aniversariantes.add(new Aniversariante(nome, dia, mes));
    }

    @Override
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        ArrayList<String> nomes = new ArrayList<>();
        for (Aniversariante a : aniversariantes) {
            DataAniversario data = a.getDataAniversario();
            if (data != null && data.getDia() == dia && data.getMes() == mes) {
                nomes.add(a.getNome());
            }
        }
        return nomes;
    }

    @Override
    public void removerAniversariante(String nomeAniversariante) {
        aniversariantes.removeIf(a -> nomeAniversariante.equals(a.getNome()));
    }
}

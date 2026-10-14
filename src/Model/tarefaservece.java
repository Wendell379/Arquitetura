package Model;

import java.util.ArrayList;
import java.util.List;

public class tarefaservece {

    private static int id = 1;
    List<tarefas> banco = new ArrayList<>();

    public void cadastrarTarefa(String nome,pessoa responsavel, String descricao) {
        tarefas tarefas = new tarefas(id++,responsavel,nome,descricao);
        banco.add(tarefas);
    }

    public List<tarefas> Listartarefa() {
        return banco;
    }
    public void deletartarefa(int id) {
        for (tarefas t : banco) {
            if (t.getId() == id) {
                banco.remove(t);
                IO.println("Pessoa excluida com sucesso");
                break;
            }
        }
    }
    public void atualizartarefa(int id, String nome, String descricao) {
        for (tarefas t: banco) {
            if (t.getId() == id) {
                t.setNome(nome);
                IO.println("Tarefa Atatualizada com sucesso" + t);
                break;
            }
        }
    }

}

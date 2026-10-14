package Controler;

import Model.pessoa;
import Model.tarefaservece;

import java.util.List;

public class tarefacontroler {

    private final tarefaservece tarefaservece;

    public tarefacontroler(tarefaservece tarefaservece) {
        this.tarefaservece = tarefaservece;
    }

    public void cadastrar() {
        tarefaservece.cadastrarTarefa("Tarefa",new pessoa(1, "Wendell", "wendell@gmail.com"), "Tarefa feita");
        tarefaservece.cadastrarTarefa("Tarefa",new pessoa(2, "Marcos", "marcos@gmail.com"), "Tarefa feita");
        tarefaservece.cadastrarTarefa("Tarefa",new pessoa(3, "Diane", "diane@gmail.com"), "Tarefa feita");
    }

    public List<?> mostrar() {
        return tarefaservece.Listartarefa();
    }

    public void deletar(int id) {
        tarefaservece.deletartarefa(id);
    }

    public void atualizar(int id, String nome, String descricao) {
        tarefaservece.atualizartarefa(id, nome, descricao);
    }
}
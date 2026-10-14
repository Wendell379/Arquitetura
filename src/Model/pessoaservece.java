package Model;

import java.util.ArrayList;
import java.util.List;

public class pessoaservece {

    private  static int id = 1;
    List<pessoa> banco = new ArrayList<>();

    public void cadastrarpessoa( String nome, String email) {
     pessoa pessoa = new pessoa(id++,nome,email);
     banco.add(pessoa);
    }

    public List<pessoa> Listarpessoa() {
        return banco;
    }
    public void deletarpessoa(int id) {
        for (pessoa p: banco){
            if (p.getId() == id) {
                banco.remove(p);
                IO.println("Pessoa excluida com sucesso");
                break;
            }
        }
    }

    public void atualizarpessoa(int id, String nome) {
        for (pessoa p: banco) {
            if (p.getId() == id) {
                p.setNome(nome);
                IO.println("Pessoa Atatualizada com sucesso" + p);
                break;
            }
        }
    }

}
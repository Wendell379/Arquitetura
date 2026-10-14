package Controler;

import Model.pessoaservece;

import java.util.List;

public class pessoacontroler {

    private final pessoaservece Pessoaservece;

    public pessoacontroler(pessoaservece Pessoaservece) {
        this.Pessoaservece = Pessoaservece;
    }

    public void cadastrar() {

        Pessoaservece.cadastrarpessoa("Wendell", "wendell@gmail.com");
        Pessoaservece.cadastrarpessoa("Enzo", "enzo@gmail.com");
        Pessoaservece.cadastrarpessoa("Fiama", "fiama@gmail.com");
    }
    public List<?> mostrar(){
        return Pessoaservece.Listarpessoa();
    }
    public  void deletar(int id) {
        Pessoaservece.deletarpessoa(id);
    }
    public void atualizar(int id, String nome) {
        Pessoaservece.atualizarpessoa(id, nome);
    }

}

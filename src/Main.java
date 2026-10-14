import Controler.pessoacontroler;
import Controler.tarefacontroler;
import Model.pessoa;
import Model.pessoaservece;
import Model.tarefaservece;

void main() {

    tarefaservece service = new tarefaservece();
    tarefacontroler controler = new tarefacontroler(service);

    controler.cadastrar();
    IO.println(controler.mostrar());

    controler.deletar(2);
    IO.println(controler.mostrar());

    controler.atualizar(3, "tarefa","feita");
    IO.println(controler.mostrar());

   // pessoaservece service = new pessoaservece();
   // pessoacontroler controler = new pessoacontroler(service);

    //controler.cadastrar();
   // IO.println(controler.mostrar());

   // controler.deletar(2);
    //IO.println(controler.mostrar());

   // controler.atualizar(1, "Souza");
   // IO.println(controler.mostrar());

}

package Model;

public class tarefas {

    private int id;
    private pessoa responsavel;
    private String nome;
    private String descricao;

    public tarefas() {
    }

    public tarefas(int id, pessoa responsavel, String nome, String descricao) {
        this.id = id;
        this.responsavel = responsavel;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public pessoa getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(pessoa responsavel) {
        this.responsavel = responsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "tarefas{" +
                "id=" + id +
                ", responsavel=" + responsavel +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}' + "\n";
    }
}




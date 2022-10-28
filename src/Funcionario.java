public class Funcionario implements ModeloCrud {

    private int Id;
    private String Nome;
    private String Cidade;
    private String Uf;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getUf() {
        return Uf;
    }

    public void setUf(String uf) {
        Uf = uf;
    }

    @Override
    public void incluir() {
        System.out.println("Funcionario Incluso");

    }

    @Override
    public void alterar() {
        System.out.println("Dados Alterados");

    }

    @Override
    public void excluir() {
        System.out.println("Dados excluidos");

    }

    @Override
    public void recuperar() {
        System.out.println("Dados Recuperados");

    }

    @Override
    public void validar() {
        System.out.println("Dados Validados");

    }
}
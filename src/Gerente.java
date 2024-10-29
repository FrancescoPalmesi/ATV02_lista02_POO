class Gerente extends Funcionario {
    private int senha;
    private int numFuncionariosGerenciados;

    public Gerente(String nome, int idade, int cpf, double salario, int senha, int numFuncionariosGerenciados) {
        super(nome, idade, cpf, salario);
        this.senha = senha;
        this.numFuncionariosGerenciados = numFuncionariosGerenciados;
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    public int getNumFuncionariosGerenciados() {
        return numFuncionariosGerenciados;
    }
}

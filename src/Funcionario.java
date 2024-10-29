class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, int idade, int cpf, double salario) {
        super(nome, idade, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}

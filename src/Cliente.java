class Cliente extends Pessoa {
    private double saldo;
    private double limite;
    private double chequeEspecial;

    public Cliente(String nome, int idade, int cpf, double saldo, double limite, double chequeEspecial) {
        super(nome, idade, cpf);
        this.saldo = saldo;
        this.limite = limite;
        this.chequeEspecial = chequeEspecial;
    }

    public void saca(double valor) {
        if (valor <= saldo + chequeEspecial) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void deposita(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }
}

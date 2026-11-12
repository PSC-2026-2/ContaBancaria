public class Conta {

    // atributos
    private int numero;
    private String nomeTitular;
    private double saldo;

    // construtor
    public Conta(int numero, String nomeTitular) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }

    // metodos get/set
    public int getNumero() {
        return this.numero;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // demais metodos
    public String sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            return "Saque realizado com sucesso!";
        }
        return "Saque não permitido!";
    }

    public String depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return "Depósito realizado com sucesso!";
        }
        return "Depósito não realizado!";
    }

    public String mostrarDados() {
        return "\nNumero da Conta: " + this.numero +
                "\nTitular: " + this.nomeTitular +
                "\nSaldo: " + this.saldo;
    }

}
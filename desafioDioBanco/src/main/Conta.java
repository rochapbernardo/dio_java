package main;

public abstract class Conta implements IConta{
    private int agency;
    private int account;
    private double balance;
    private Cliente cliente;

    private static int SEQ = 1;
    public Conta(Cliente cliente) {
        this.agency = 1;
        this.account = SEQ++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agency;
    }

    public int getConta() {
        return account;
    }

    public double getSaldo() {
        return balance;
    }

    @Override
    public boolean sacar(double valor) {
        if(this.balance>0 && this.balance >=valor) {
            this.balance -= valor;
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void depositar(double valor) {
        this.balance += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(this.sacar(valor)) {
            contaDestino.depositar(valor);
        }
    }

    public void extrato() {
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agência: " + this.agency);
        System.out.println("Conta: " + this.account);
        System.out.println("Saldo: R$" + this.balance);
    }
}

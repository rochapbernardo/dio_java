package main;

public interface IConta {
    public boolean sacar(double valor);
    public void depositar(double valor);
    public void transferir(double valor, Conta contaDestino);
    public void imprimirExtrato();
}

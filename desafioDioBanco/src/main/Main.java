package main;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente(new Cliente("Bernardo", "12345679985"));
        Conta cp = new ContaPoupanca(new Cliente("Ananias", "78945612312"));

        cc.depositar(500);
        cc.transferir(300, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cc.sacar(50);
    }
}

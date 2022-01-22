package main.java.com.company.bancodio;

public class Main {
    public static void main(String[] args) {

        Cliente flavio = new Cliente();
        flavio.setNome("flavio");

        Conta cc = new ContaCorrente(flavio);
        Conta cp = new ContaPoupanca(flavio);
        cc.depositar(500);
        cc.transferir(500, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}

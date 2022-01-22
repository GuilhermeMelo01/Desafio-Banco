package main.java.com.company.bancodio;

import main.java.com.company.bancodio.director.Cliente;
import main.java.com.company.bancodio.logic.Conta;
import main.java.com.company.bancodio.logic.ContaCorrente;
import main.java.com.company.bancodio.logic.ContaPoupanca;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente flavio = new Cliente("Flavio", "5840380938");

        Cliente fabio = new Cliente("fabio","39448320934");

        Cliente mario = new Cliente("mario","53480203492");

        Cliente gui = new Cliente("gui", "8432978429");

        Conta cc1 = new ContaCorrente(flavio);
        Conta cc2 = new ContaCorrente(gui);
        Conta cp1 = new ContaPoupanca(fabio);
        Conta cp2 = new ContaPoupanca(mario);

        List<Cliente> listaClienteCC = List.of(flavio, gui);
        List<Cliente> listaClienteCP = List.of(fabio, mario);


        cp1.depositar(200);
        cp1.depositar(330);
        cp1.transferir(200, cc1);
        cp1.imprimirExtrato();

        cc1.depositar(330);
        cc1.imprimirExtrato();

        cc2.depositar(400);
        cc2.imprimirExtrato();

        cp2.depositar(10);

        cc1.listClientes(listaClienteCC);
        cp1.listClientes(listaClienteCP);




    }
}

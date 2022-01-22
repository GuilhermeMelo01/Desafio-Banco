package main.java.com.company.bancodio.logic;

import main.java.com.company.bancodio.director.Cliente;

import java.util.List;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void listClientes(List<Cliente> clientes) {
        System.out.println("==LISTA DE CLIENTES (CONTA POUPANCA)==");
        super.listClientes(clientes);
        System.out.println("======================================");
    }
}

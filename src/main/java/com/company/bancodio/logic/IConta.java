package main.java.com.company.bancodio.logic;

import main.java.com.company.bancodio.director.Cliente;

import java.util.List;

public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
    void imprimirExtrato();
    void listClientes(List<Cliente> clientes);
}

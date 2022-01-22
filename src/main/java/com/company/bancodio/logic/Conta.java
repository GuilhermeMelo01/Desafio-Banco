package main.java.com.company.bancodio.logic;

import lombok.Data;
import main.java.com.company.bancodio.director.Cliente;

import java.util.List;

@Data
public abstract class Conta implements IConta {
    private static int CONTA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected List<Cliente> clientes;

    public Conta(Cliente cliente) {
        this.agencia = CONTA_PADRAO++;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.printf("Cliente: %s%n", this.cliente.getNome());
        System.out.printf("Cliente: %s%n", this.cliente.getCpf());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
        System.out.println("=====================");
    }

    @Override
    public void listClientes(List<Cliente> clientes) {
        if (clientes != null) {
            for (Cliente cliente1 : clientes) {
                System.out.println(cliente1);
            }
        }
    }
}

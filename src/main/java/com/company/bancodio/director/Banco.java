package main.java.com.company.bancodio.director;

import lombok.Data;
import main.java.com.company.bancodio.logic.Conta;

import java.util.List;

@Data
public class Banco {

    private String nome;
    private List<Conta> contas;

}

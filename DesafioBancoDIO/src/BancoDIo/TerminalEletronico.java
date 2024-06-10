package BancoDIo;

import java.util.Scanner;

import BancoDIo.Clientes.Cliente;
import BancoDIo.Modulo.ContaCorrente;
import BancoDIo.Modulo.ContaPoupanca;

public class TerminalEletronico {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.Depositar(100);
        cp.Depositar(100);

        cc.Sacar(20);
        cp.Sacar(15);


        cc.imprimirExtrato();
        cp.imprimirExtrato();


      
    }
    
}



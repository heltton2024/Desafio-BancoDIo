package BancoDIo.Modulo;

import BancoDIo.Gerenciador.Gerenciador;

public class ContaPoupanca extends Gerenciador{

    public void imprimirExtrato(){
        
        System.out.println("*******************************");
        System.out.println("*********EXTRATO POUPANÇA******");
        extracted();
    }



}

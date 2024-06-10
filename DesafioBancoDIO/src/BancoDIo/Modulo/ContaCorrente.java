package BancoDIo.Modulo;

import BancoDIo.Gerenciador.Gerenciador;

public class ContaCorrente extends Gerenciador {

    public void imprimirExtrato(){
        
        System.out.println("*******************************");
        System.out.println("***EXTRATO CONTA CORRENTE******");
        extracted();
    }

    @Override
    public String toString() {
        return "ContaCorrente []";
    }

    

}

package BancoDIo.Gerenciador;

import BancoDIo.Clientes.Cliente;
import BancoDIo.Imetodos.Imetodo;

public abstract class Gerenciador implements Imetodo {

    //Atributos
    protected int agencia;
    protected int conta;
    protected double saldo;
    

    //metodo constante com o numero da agencia
    private static final int AGENCIA_PADRAO = 1;
    //metodo sequencial com o numero da conta
    private static int SEQUENCIAL = 1;


    //construtor
    public Gerenciador(){
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL ++;

    }



    //metodo Implementeção



    public void Sacar(double valor){
        saldo = saldo + valor;
    }

    public void Depositar(double valor){
        saldo = saldo - valor;
    }

    public void Transferir(double valor, Gerenciador contaDestino){
        this.Sacar(valor);
        contaDestino.Depositar(valor);
    }

     
    
    //metodo get

    


    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public Double getSaldo() {
        return saldo;
    }





    //metodo de impressao
    protected void extracted() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.conta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println("*******************************");

    }

   
    



}

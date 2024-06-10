package BancoDIo.Imetodos;

import BancoDIo.Gerenciador.Gerenciador;

public interface Imetodo {

    void Sacar(double valor);

    void Depositar(double valor);

    void Transferir(double valor, Gerenciador contaDestino);

    void imprimirExtrato();



}

package aplicativo;

import funcionalidade.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico{

    @Override
    public String ligar(String numero) {
        return numero;
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz");
    }
    
}

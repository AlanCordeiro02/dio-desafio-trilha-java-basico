package multifuncional;

import funcionalidade.AparelhoTelefonico;
import funcionalidade.NavegadorNaInternet;
import funcionalidade.ReprodutorMusical;

public class DispositivoMultifuncional implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando por um dispositico multifuncional");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado por um dispositico multifuncional");
    }

    @Override
    public String selecionarMusica(String musica) {
        return musica;
    }

    @Override
    public String exibirPagina(String url) {
        return url;
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada por um dispositico multifuncional");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Nova página adicionada por um dispositico multifuncional");
    }

    @Override
    public String ligar(String numero) {
        return numero;
    }

    @Override
    public void atender() {
        System.out.println("Atendido por um dispositico multifuncional");        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio iniciado por um dispositico multifuncional");
    }
    

}

package aplicativo;

import funcionalidade.ReprodutorMusical;

public class MusicPlayer implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Música tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public String selecionarMusica(String musica) {
        return musica;
    }
    
    
}

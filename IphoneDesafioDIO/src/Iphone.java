import multifuncional.DispositivoMultifuncional;
import funcionalidade.*;

public class Iphone {
    public static void main(String[] args) throws Exception {
        DispositivoMultifuncional dispositivo = new DispositivoMultifuncional();

        String pagina = "Google.com";
        String musica = "Not Afraid - Eminem";
        String numero = "85 998765432";

        NavegadorNaInternet chrome = dispositivo;
        ReprodutorMusical musicaplayer = dispositivo;
        AparelhoTelefonico telefone = dispositivo;

        chrome.adicionarNovaAba();
        chrome.adicionarPagina();
        System.out.println(chrome.exibirPagina(pagina));

        musicaplayer.tocar();
        musicaplayer.pausar();
        System.out.println(musicaplayer.selecionarMusica(musica));

        telefone.atender();
        telefone.iniciarCorreioVoz();
        System.out.println(telefone.ligar(numero));

    }
}

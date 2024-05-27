package aplicativo;

import funcionalidade.NavegadorNaInternet;

public class Chrome implements NavegadorNaInternet{

    @Override
    public String exibirPagina(String pagina) {
        return pagina;
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Aba adicionada");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Página adicionada");
    }
    
}

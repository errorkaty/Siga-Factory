package siga;

public class GerenciadorLogin {

    private final FabricaPainel fabrica = new FabricaPainel();

    public Painel montarPainel(String tipoUsuario){
        Painel painel = fabrica.criar(tipoUsuario);
        painel.montar();
        return painel;
        
    }
}

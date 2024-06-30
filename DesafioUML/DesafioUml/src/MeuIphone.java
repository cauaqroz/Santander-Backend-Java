import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class MeuIphone {
    private IPhone meuIPhone;
    private String nomeUsuario;

    public MeuIphone(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.meuIPhone = new IPhone();
    
        // Inicializando a lista de músicas
        this.meuIPhone.setListaMusicas(Arrays.asList("Musica 1", "Musica 2", "Musica 3"));
        this.meuIPhone.setMusicaAtual("Musica 1");

        // Inicializando a lista de contatos
        this.meuIPhone.setListaContatos(Arrays.asList(
            new Contato("Joao", "1234-5678"),
            new Contato("Maria", "8765-4321"),
            new Contato("Ana", "1111-2222")
        ));
    
        // Inicializando o histórico de navegação
        this.meuIPhone.setHistorico(new ArrayList<>(Arrays.asList("Pagina 1", "Pagina 2")));
        this.meuIPhone.setPaginaAtual("Pagina 2");
        this.meuIPhone.setTela(this.meuIPhone.getPaginaAtual());
        this.meuIPhone.setBateria("80%");
    }

    public void usarIPhone() {
        System.out.println("Usuario do iPhone: " + nomeUsuario);

        // Reproduzindo música
        meuIPhone.reproduzirMusica();
        meuIPhone.avancarMusica();
        meuIPhone.pausarMusica();

        // Fazendo uma chamada
        meuIPhone.fazerChamada();
        meuIPhone.atender();
        meuIPhone.encerrarChamada();

        // Navegando na internet
        meuIPhone.navegar();
        meuIPhone.voltarPagina();
        meuIPhone.avancarPagina();

        // Usando a câmera
        meuIPhone.abrirCamera();
        meuIPhone.usarCamera("Modo Retrato");
        meuIPhone.fecharCamera();

        // Desligando o iPhone
        meuIPhone.desligar();
    }

    public static void main(String[] args) {
        MeuIphone meuIphone = new MeuIphone("Carlos");
        meuIphone.usarIPhone();
    }
}

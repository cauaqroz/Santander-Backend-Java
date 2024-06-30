import java.util.List;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String tela;
    private String bateria;
    private String camera;
    private boolean cameraAberta;
    private String microfone;
    private String altoFalante;

    private List<String> listaMusicas;
    private String musicaAtual;

    
    private List<Contato> listaContatos;
    private Chamada chamadaAtual; 
    
    private List<String> historico;
    private String paginaAtual;
    


    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo musica: " + musicaAtual);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Musica pausada.");
    }

    @Override
    public void avancarMusica() {
        int indexAtual = listaMusicas.indexOf(musicaAtual);
        if (indexAtual < listaMusicas.size() - 1) {
            musicaAtual = listaMusicas.get(indexAtual + 1);
            System.out.println("Avancando para: " + musicaAtual);
        }
    }

    @Override
    public void fazerChamada() {
        System.out.println("Fazendo uma chamada. Microfone: " + microfone + ", Alto-falante: " + altoFalante);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida. Microfone: " + microfone + ", Alto-falante: " + altoFalante);
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
    }

    @Override
    public void navegar() {
        System.out.println("Navegando na internet. Tela: " + tela + ", Bateria: " + bateria);
    }

    @Override
    public void voltarPagina() {
        if (historico.size() > 1) {
            historico.remove(historico.size() - 1);
            paginaAtual = historico.get(historico.size() - 1);
            System.out.println("Voltando para: " + paginaAtual);
        }
    }

    @Override
    public void avancarPagina() {
     System.out.println("Avancando para a proxima pagina.");
    }

    public void desligar() {
        System.out.println("IPhone desligado.");
    }

    public void abrirCamera() {
        cameraAberta = true;
        System.out.println("Camera aberta.");
    }

    public void fecharCamera() {
        cameraAberta = false;
        System.out.println("Camera fechada.");
    }

    public void usarCamera(String modo) {
        if (cameraAberta) {
            System.out.println("Usando a camera no modo: " + modo);
        } else {
            System.out.println("A camera nao esta aberta.");
        }
    }

    
    public List<String> getListaMusicas() {
        return listaMusicas;
    }

    public void setListaMusicas(List<String> listaMusicas) {
        this.listaMusicas = listaMusicas;
    }

    public String getMusicaAtual() {
        return musicaAtual;
    }

    public void setMusicaAtual(String musicaAtual) {
        this.musicaAtual = musicaAtual;
    }

    public List<Contato> getListaContatos() {
        return listaContatos;
    }

    public void setListaContatos(List<Contato> listaContatos) {
        this.listaContatos = listaContatos;
    }

    public Chamada getChamadaAtual() {
        return chamadaAtual;
    }

    public void setChamadaAtual(Chamada chamadaAtual) {
        this.chamadaAtual = chamadaAtual;
    }

    public List<String> getHistorico() {
        return historico;
    }

    public void setHistorico(List<String> historico) {
        this.historico = historico;
    }

    public String getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(String paginaAtual) {
        this.paginaAtual = paginaAtual;
    }
    public void setTela(String tela) {
        this.tela = tela;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }
    
    public String getMicrofone() {
        return microfone;
    }

    public void setMicrofone(String microfone) {
        this.microfone = microfone;
    }

    public String getAltoFalante() {
        return altoFalante;
    }

    public void setAltoFalante(String altoFalante) {
        this.altoFalante = altoFalante;
    }
}
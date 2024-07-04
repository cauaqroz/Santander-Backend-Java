
public class Chamada {
    private Contato contato;
    private String horario;

    public Chamada(Contato contato, String horario) {
        this.contato = contato;
        this.horario = horario;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}

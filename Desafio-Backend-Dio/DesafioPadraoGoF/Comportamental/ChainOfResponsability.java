import java.util.Scanner;

// Classe base para cada etapa do processo
abstract class EtapaProcesso {
    protected EtapaProcesso proximaEtapa;

    // Método que define a próxima etapa
    public void setProximaEtapa(EtapaProcesso etapa) {
        this.proximaEtapa = etapa;
    }

    // Método que cada etapa deve implementar
    public abstract void processar();
}

// Etapa de conexão
class EtapaConexao extends EtapaProcesso {
    private final double valorPagamento = 100.0;

    @Override
    public void processar() {
        System.out.println("[001] - Conectando....[--]");

        // Simulação da lógica de conexão
        System.out.println("[001] - Conexão Realizada....[OK]");

        if (this.proximaEtapa != null) {
            this.proximaEtapa.processar();
        }
    }
}

// Etapa de validação
class EtapaValidacao extends EtapaProcesso {
    @Override
    public void processar() {
        System.out.println("[002] - Validando....[--]");

        // Simulação da lógica de validação
        System.out.println("[002] - Validação Realizada....[OK]");

        if (this.proximaEtapa != null) {
            this.proximaEtapa.processar();
        }
    }
}

// Etapa de envio da informação
class EtapaEnvioInf extends EtapaProcesso {
    @Override
    public void processar() {
        System.out.println("[003] - Enviando Informação....[--]");

        // Simulação da lógica de envio de informação
        System.out.println("[003] - Informação Enviada....[OK]");

        if (this.proximaEtapa != null) {
            this.proximaEtapa.processar();
        }
    }
}

// Etapa autenticação
class EtapaAutenticacao extends EtapaProcesso {
    @Override
    public void processar() {
        System.out.println("[004] - Autenticando....[--]");

        // Simulação da lógica de autenticação
        System.out.println("[004] - Autenticação Realizada....[OK]");

        if (this.proximaEtapa != null) {
            this.proximaEtapa.processar();
        }
    }
}

// Etapa de confirmação
class EtapaConfirmacao extends EtapaProcesso {
    @Override
    public void processar() {
        System.out.println("[005] - Confirmando....[--]");

        // Simulação da lógica de confirmação
        System.out.println("[005] - Confirmação Realizada....[OK]");

        if (this.proximaEtapa != null) {
            this.proximaEtapa.processar();
        }
    }
}

// Cliente
class Cliente {
    private EtapaProcesso etapaProcesso;

    // Construtor Cliente
    public Cliente() {
        this.etapaProcesso = new EtapaConexao();
        EtapaProcesso etapaValidacao = new EtapaValidacao();
        EtapaProcesso etapaEnvio = new EtapaEnvioInf();
        EtapaProcesso etapaAutenticacao = new EtapaAutenticacao();
        EtapaProcesso etapaConfirmacao = new EtapaConfirmacao();

        // Define a sequência das etapas
        this.etapaProcesso.setProximaEtapa(etapaValidacao);
        etapaValidacao.setProximaEtapa(etapaEnvio);
        etapaEnvio.setProximaEtapa(etapaAutenticacao);
        etapaAutenticacao.setProximaEtapa(etapaConfirmacao);
    }

    // Inicia Processo de Pagamento
    public void iniciarPagamento() {
        System.out.println("[000] - Iniciando Processo de Pagamento....[--]");
        this.etapaProcesso.processar();
    }
}

public class ChainOfResponsability {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.iniciarPagamento();
    }
}
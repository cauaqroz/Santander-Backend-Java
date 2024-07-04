import java.util.Scanner;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public abstract boolean validarSenha(int confirmacaoSenha);
}

class CofreDigital extends Cofre {
    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    @Override
    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends Cofre {
    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }

    @Override
    public boolean validarSenha(int confirmacaoSenha) {
        // Não aplicável para cofre físico, mas necessário devido à abstração
        return true;
    }
}

public class CofreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tipoCofre = scanner.nextLine();

        if (tipoCofre.equalsIgnoreCase("digital")) {
            
            int senha = scanner.nextInt();

            CofreDigital cofreDigital = new CofreDigital(senha);
            scanner.nextLine(); // Consumir a quebra de linha restante

            
            int senhaParaAbrir = scanner.nextInt();

            System.out.println("\nTipo: Cofre Digital");
            System.out.println("Metodo de abertura: Senha");
            if (cofreDigital.validarSenha(senhaParaAbrir)) {
                System.out.println("Cofre aberto!");
            } else {
                System.out.println("Senha incorreta!");
            }
        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            CofreFisico cofreFisico = new CofreFisico();

            System.out.println("\nTipo: Cofre Fisico");
            System.out.println("Metodo de abertura: Chave");
        }

        scanner.close();
    }
}
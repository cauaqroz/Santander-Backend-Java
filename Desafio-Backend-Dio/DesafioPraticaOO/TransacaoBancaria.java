import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TransacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        // Lista para armazenar as transações
        List<String> transacoes = new ArrayList<>();

        // Loop para iterar sobre as transações
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            char tipoTransacao = scanner.next().toUpperCase().charAt(0);
            double valorTransacao = scanner.nextDouble();

            if (tipoTransacao == 'D') {
                saldo += valorTransacao;
                transacoes.add("Deposito de " + valorTransacao);
            } else if (tipoTransacao == 'S') {
                saldo -= valorTransacao;
                transacoes.add("Saque de " + valorTransacao);
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--; // Decrementa o índice para repetir a iteração
            }
        }

        // Exibe o saldo final e a lista de transações
        System.out.println("Saldo: " + saldo);
        System.out.println("Transacoes:");
        for (int i = 0; i < transacoes.size(); i++) {
            System.out.println((i + 1) + ". " + transacoes.get(i));
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
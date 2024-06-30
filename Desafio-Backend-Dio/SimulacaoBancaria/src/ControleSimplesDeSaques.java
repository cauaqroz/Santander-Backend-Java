/* 
 Descrição
Você está desenvolvendo um programa simples em Java para auxiliar um cliente a realizar saques de uma conta bancária. O cliente pode fazer saques até atingir um limite diário predefinido.

Entrada
O programa solicitará ao usuário que informe o limite diário de saque.
Em seguida, o programa solicitará ao usuário que informe o valor do primeiro saque.
Saída
Utilizando um laço for, o programa iterará sobre os saques.
Para cada saque, o programa verificará se o valor ultrapassa o limite diário.
Se ultrapassar, o programa informará que o limite foi atingido e encerrará o loop.
Se não ultrapassar, o programa informará que o saque foi realizado com sucesso.
*/

import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double saldoRestante = limiteDiario;

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {
            System.out.print("Digite o valor do saque desejado (ou 0 para encerrar): ");
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transações encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > saldoRestante) {
                System.out.println("Limite diário de saque atingido. Transações encerradas.");
                break; // Encerra o loop
            } else {
                saldoRestante -= valorSaque;
                System.out.printf("Saque realizado. Limite restante: %.1f%n", saldoRestante);
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

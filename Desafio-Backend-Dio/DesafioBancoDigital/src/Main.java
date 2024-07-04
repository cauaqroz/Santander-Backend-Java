
public class Main {

    public static void main(String[] args) {

        //Criando um cliente - Venilton

        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        //Adicionando mais um cliente - Maria 

        Cliente maria = new Cliente();
        maria.setNome("Maria");

        Conta ccMaria = new ContaCorrente(maria);
        Conta poupancaMaria = new ContaPoupanca(maria);

        ccMaria.depositar(200);
        ccMaria.transferir(150, poupancaMaria);

        ccMaria.imprimirExtrato();
        poupancaMaria.imprimirExtrato();

        //Criando o ultimo cliente - João

        Cliente joao = new Cliente();
        joao.setNome("Joao");

        Conta ccJoao = new ContaCorrente(joao);
        Conta poupancaJoao = new ContaPoupanca(joao);

        ccJoao.depositar(300);
        ccJoao.transferir(200, poupancaJoao);

        ccJoao.imprimirExtrato();
        poupancaJoao.imprimirExtrato();
    }

}
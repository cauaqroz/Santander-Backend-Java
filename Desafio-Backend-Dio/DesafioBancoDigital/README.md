 **Desafio:** implementar um sistema bancário simplificado em Java, demonstrando os conceitos de Orientação a Objetos (OO) como abstração, encapsulamento, herança e polimorfismo. Vamos analisar onde cada um dos conceitos foram aplicados:

### Abstração
Abstração é representada pela modelagem de classes como `Conta`, `Cliente`, `ContaCorrente`, `ContaPoupanca`, e `Banco`, que abstraem entidades e comportamentos do mundo real para o contexto do sistema bancário. Por exemplo, a classe `Conta` abstrai características comuns de contas bancárias, como ***agência***, ***número***, ***saldo*** e ***operações básicas (sacar, depositar, transferir)***.

### Encapsulamento
Encapsulamento é evidenciado pelo uso de modificadores de acesso `private/public` em atributos das classes, como na classe `Cliente`, onde o atributo **nome** é `privado` e acessível apenas através dos métodos `getNome()` e `setNome()`.<br>
Isso garante que o estado interno do objeto seja protegido e acessível apenas de maneira controlada.

### Herança
Herança é utilizada nas classes `ContaCorrente` e `ContaPoupanca`, que **herdam da classe abstrata** `Conta`. Isso permite que `ContaCorrente` e `ContaPoupanca` compartilhem **atributos** e **métodos** comuns definidos em `Conta`, enquanto implementam seus comportamentos específicos, como o método `imprimirExtrato()`, demonstrando a reutilização de código e a relação.

### Polimorfismo

Polimorfismo é demonstrado pelo uso da interface `IConta` e sua implementação nas classes `ContaCorrente` e `ContaPoupanca`. Isso permite que objetos de `ContaCorrente` e `ContaPoupanca` sejam tratados de forma polimórfica, por exemplo, ao serem referenciados como `IConta`. Além disso, o método `imprimirExtrato()` é sobrescrito em `ContaCorrente` e `ContaPoupanca`, cada um imprimindo detalhes específicos da conta, o que é um exemplo de polimorfismo de tempo de execução.


## Conclusão

Ao analisar o codigo desenvolvido notamos que ele atende todos os requisitos de abstração, encapsulamento, herança e polimorfismo, fundamentais para a programação orientada a objetos. Ele modela um sistema bancário simplificado, permitindo a criação de clientes, contas correntes e poupanças, e a realização de operações básicas como depósitos, saques e transferências, além de imprimir extratos bancários.
